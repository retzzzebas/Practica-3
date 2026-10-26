public class Palindromos {
public static boolean esPalindromo(String texto){
        String textoBueno = "";
        String origen =  "ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚÜÑáéíóú";

        for(int i=0;i<texto.length();i++){
          if(origen.indexOf(texto.charAt(i)) != -1){
            char corregir = normalizar(texto.charAt(i));
            texto = texto.replace(texto.charAt(i),corregir);
          }
        }

        for(int i = 0; i < texto.length(); i++){
          if(esSignificativo(texto.charAt(i)))
          {textoBueno = textoBueno + texto.charAt(i);}
        }

        for (int i = 0,j=textoBueno.length()-1;i < j; i++,j-- ) {

          char inicio = (textoBueno.charAt(i));
          char ultimo = (textoBueno.charAt(j));
          if(inicio != ultimo){
            return false;  }
        }
         return true;
    }
    private static char normalizar(char c) {
        String origen =  "ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚÜÑáéíóú";
        String destino = "abcdefghijklmnopqrstuvwxyzaeiouüñaeiou";
        int posicion = origen.indexOf(c);
        char resultado = destino.charAt(posicion);
          return resultado;
    }
    private static boolean esSignificativo(char c) {
        return (c >= 'a' && c <= 'z')
            || (c >= '0' && c <= '9') || c == 'ñ' || c == 'ü';
    }
    public static void main(String [] args) {
        boolean res = esPalindromo("anita lava la tina");
        boolean res2 = esPalindromo("¿Acaso hubo búhos acá?");
        boolean res3 = esPalindromo("Java es genial");
        boolean res4 = esPalindromo("Somos");
        System.out.println("Palindromo resultado: " + res);
        System.out.println("Palindromo resultado: " + res2);
        System.out.println("Palindromo resultado: " + res3);
        System.out.println("Palindromo resultado: " + res4);
    }
}