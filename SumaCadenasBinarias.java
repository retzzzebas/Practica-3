public class SumaCadenasBinarias {
    public String addBinary(String a, String b) {
            char [] ArregloA = a.toCharArray();
            char [] ArregloB = b.toCharArray();

            int longitudA = ArregloA.length;
            int longitudB = ArregloB.length;
            int acarreo = 0;

            int longitudEntrada;
            if (longitudA > longitudB) {
                longitudEntrada = longitudA;
            } else {
                longitudEntrada = longitudB;
            }

            int longitudSalida = longitudEntrada + 1;
            char [] resultado = new char[longitudSalida];
            int k = longitudSalida - 1;

            for (int contador = 1; contador <= longitudSalida; contador++) {
                int suma = acarreo;

                if (contador <= longitudA) {
                    suma = suma + (ArregloA[longitudA - contador] - '0');
                }
                if (contador <= longitudB) {
                    suma = suma + (ArregloB[longitudB - contador] - '0');
                }

                resultado[k] = (char) ((suma % 2) + '0');
                k = k-1;
                acarreo = suma / 2; 
            }

            if (resultado[0] == '0' && longitudSalida > 1) {
                return new String(resultado, 1, longitudSalida - 1);
            } else {
                return new String(resultado);
            }
         
    }
    public static void main(String[] args) {
        SumaCadenasBinarias Prueba = new SumaCadenasBinarias(); 
        String c1 = "10";
        String c2 = "100";
        String resultadoFinal = Prueba.addBinary(c1, c2);
        System.out.println("Sumas: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Resultado " + resultadoFinal);
    }
}

