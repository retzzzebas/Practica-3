public class EditorTexto{
StringBuilder contenido;
StringBuilder anterior;

  public EditorTexto(){
    contenido = new StringBuilder("");
    anterior = new StringBuilder("");
  }

  public void escribir(String texto){
    insertar(contenido.length(), texto);
  }
  public void insertar(int posicion, String texto){
    if(texto == null || !validarIndice(posicion,posicion)) return;
    aplicarEdicion(posicion,posicion,texto);
  }
  public void eliminar(int inicio, int fin){
    if(!validarIndice(inicio,fin)) return;
    aplicarEdicion(inicio,fin,"");
  }

  public void deshacer(){
    if(anterior == null) return;
    contenido = new StringBuilder (anterior);
    anterior = null;
  }

  public void reemplazar(int inicio, int fin, String texto){
    if(texto == null || !validarIndice(inicio,fin)) return;
    aplicarEdicion(inicio,fin,texto);
  }
  public String obtenerTexto(){
    return contenido.toString();
  }
  private void aplicarEdicion(int inicio, int fin, String texto){
    String actual = contenido.toString();
    StringBuilder nuevo = new StringBuilder();
    copiar(actual,0,inicio,nuevo);
    copiar(texto,0,texto.length(),nuevo);
    copiar(actual,fin,actual.length(),nuevo);

    if(nuevo.toString().equals(actual)) return;
    anterior = new StringBuilder(contenido);
    contenido = nuevo;

  }
  private void copiar(String origen, int inicio, int fin,StringBuilder destino){
    for(int i = inicio; i<fin; i++){
      destino.append(origen.charAt(i));
    }
  }
  private boolean validarIndice(int inicio, int fin){
    return inicio >= 0 && inicio <= fin && fin <= contenido.length();
  }

  public static void main(String[] args) {
    EditorTexto editor = new EditorTexto();
    editor.escribir("Hola mundo ");
    editor.insertar(5, "gran ");
    editor.eliminar(0, 5);
    System.out.println(editor.obtenerTexto()); // gran mundo
    editor.deshacer();
    System.out.println(editor.obtenerTexto()); // Hola gran mundo

  }
}
