/*
Ejercicio 5
Desarrolla una solución que permita multiplicar dos matrices bidimensionales. 
El usuario debe ingresar las dimensiones y los elementos de ambas matrices. 
Realiza la multiplicación y muestra el resultado al final. 
Nota: Las matrices se deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).
 */
package grupo06taller10;

import java.util.Scanner;

public class MultiplicacionMatrices_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filasA, columnasA, filasB, columnasB;
        int[][] resultado;
        
        System.out.println("Ingrese el numero de filas de la matriz A:");
        filasA = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz A:");
        columnasA = scanner.nextInt();
        int[][] matrizA = new int[filasA][columnasA];

        System.out.println("Ingrese el numero de filas de la matriz B:");
        filasB = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz B:");
        columnasB = scanner.nextInt();
        int[][] matrizB = new int[filasB][columnasB];

        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar las matrices. El numero de columnas de A debe ser igual al numero de filas de B.");
        } else {
            resultado = new int[filasA][columnasB];

            System.out.println("Matriz A:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizA[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matrizA[i][j] + "  | ");
                }
                System.out.println();
            }

            System.out.println("Matriz B:");
            for (int i = 0; i < filasB; i++) {
                for (int j = 0; j < columnasB; j++) {
                    matrizB[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matrizB[i][j] + "  | ");
                }
                System.out.println();
            }

            System.out.println("Resultado de la multiplicacion:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    resultado[i][j] = matrizA[i][j] * matrizB[i][j];
                    System.out.print(resultado[i][j] + "  | ");
                }
                System.out.println();
            }
        }
    }
}
/*
Ingrese el numero de filas de la matriz A:
3
Ingrese el numero de columnas de la matriz A:
3
Ingrese el numero de filas de la matriz B:
3
Ingrese el numero de columnas de la matriz B:
3
Matriz A:
8  | 0  | -5  | 
9  | 3  | -5  | 
5  | -7  | 0  | 
Matriz B:
6  | 5  | -2  | 
-5  | -1  | 3  | 
3  | -7  | -5  | 
Resultado de la multiplicacion:
48  | 0  | 10  | 
-45  | -3  | -15  | 
15  | 49  | 0  | 
BUILD SUCCESSFUL (total time: 3 seconds)
*/