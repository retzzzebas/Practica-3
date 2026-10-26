public class ByeDuplicados {
    public static String eliminarDuplicados(String texto) {
        StringBuilder resultado = new StringBuilder();
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        
        for (int i = 0; i < texto.length(); i++) {
            char charActual = texto.charAt(i);

            String charString = String.valueOf(charActual);

            if (resultado.indexOf(charString) == -1) {
                resultado.append(charString);
            }
        }
        return resultado.toString();   
    }
    public static void main(String[] args) {
        System.out.println(eliminarDuplicados("Programacion"));
        System.out.println(eliminarDuplicados("mississippi"));
        System.out.println(eliminarDuplicados("aabbcc"));
        System.out.println(eliminarDuplicados("123123456"));
    }
}