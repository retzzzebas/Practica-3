public class PalabrasInvertidas {
     public static String invertirPalabras(String texto) {
       if (texto.length() == 0) return "";
       StringBuilder resultado = new StringBuilder();
       int derecha = texto.length() - 1;
       int cursorEspacios = 0;

       while (derecha >= 0) {
           int fin = derecha + 1;
           while (derecha >= 0 && texto.charAt(derecha) != ' ') derecha--;
           resultado.append(texto, derecha + 1, fin);

           while (cursorEspacios < texto.length()
                   && texto.charAt(cursorEspacios) != ' ') cursorEspacios++;
           while (cursorEspacios < texto.length()
                   && texto.charAt(cursorEspacios) == ' ') {
               resultado.append(' ');
               cursorEspacios++;
           }
           while (derecha >= 0 && texto.charAt(derecha) == ' ') derecha--;
       }
       return resultado.toString();
   }
   public static void main(String[] args) {
    System.out.println(invertirPalabras("Java es poderoso"));
    System.out.println(invertirPalabras("uno dos tres"));
    System.out.println(invertirPalabras("Hola"));
    System.out.println(invertirPalabras("Java es genial"));
   }
}