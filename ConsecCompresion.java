public class ConsecCompresion {
    public static String comprimir(String texto) {
        if (texto.length() == 0) return "";
        StringBuilder resultado = new StringBuilder();
        char grupo = texto.charAt(0);
        int repeticiones = 1;

        for (int i = 1; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            if (actual == grupo) {
                repeticiones++;
            } else {
                resultado.append(grupo).append(repeticiones);
                grupo = actual;
                repeticiones = 1;
            }
        }
        resultado.append(grupo).append(repeticiones);
        return resultado.toString();
    }
    public static void main(String[] args) {
        System.out.println(comprimir("aaabbcaaaa"));
        System.out.println(comprimir("xxxxyzz"));
        System.out.println(comprimir("abcd"));
        System.out.println(comprimir(""));
    }
}