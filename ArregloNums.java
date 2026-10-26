public class ArregloNums {
public static void main(String[] args) {
    int[] numeros = {8, 3, 10, 5, 4};
    int suma = 0;
    int mayor = 0;
    for(int i = 0;i<numeros.length;i++){
      suma = suma + numeros[i];
      if(numeros[i] > mayor){mayor = numeros[i];}

    }
    System.out.println("Respuestas :");
    System.out.println("Mayor = " + mayor);
    System.out.println("Suma = " + suma);
    System.out.println("Promedio = " + suma/numeros.length);

  }
}