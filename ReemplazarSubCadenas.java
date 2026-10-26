public class ReemplazarSubCadenas {
    public static String reemplazar(String texto, String buscar, String reemplazo) {
        if (buscar == null || buscar.isEmpty()) {
            return texto;
        }
        if (texto == null) {
            return null;
        }
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        int longitudTexto = texto.length();
        int longitudBuscar = buscar.length();

        while (i < longitudTexto) {
            if (i + longitudBuscar <= longitudTexto && texto.substring(i, i + longitudBuscar).equals(buscar)) {
                resultado.append(reemplazo);
                i += longitudBuscar;
            } else {
                resultado.append(texto.charAt(i));
                i++;
            }
        }
        return resultado.toString();

        
    }
    public static void main (String[] args) {
        System.out.println(reemplazar("Java es Java", "Java", "Kotlin"));
        System.out.println(reemplazar("aaaaa", "a", "b"));
        System.out.println(reemplazar("uno dos uno", "uno", "tres"));
        }
} 
