/*
Ejercicio 7
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9) generados automáticamente, 
presente los elementos de la diagonal secundaria, los ubicados sobre la diagonal secundaria, y bajo dicha diagonal.
 */
package grupo06taller10;
import java.util.Scanner;
public class DiagonalSecundaria_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limMt;

        System.out.println("Ingrese el tamanio de la matriz cuadrada:");
        limMt = scanner.nextInt();
        int[][] mt = new int[limMt][limMt];

        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                mt[i][j] = (int) (Math.random() * 19 - 9); 
            }
        }

        System.out.println("Matriz Completa:");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                System.out.print(mt[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("----ELEMENTOS DE LA DIAGONAL SECUNDARIA------");
        for (int i = 0; i < limMt; i++) {
            System.out.print(mt[i][(limMt - i) - 1] + " | ");
        }
        System.out.println();

        System.out.println("----ELEMENTOS SOBRE LA DIAGONAL SECUNDARIA------");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                if (j < (limMt - i) - 1) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println();

        System.out.println("----ELEMENTOS DEBAJO DE LA DIAGONAL SECUNDARIA------");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                if (j > (limMt - i) - 1) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println();
    }
}
/*
Ingrese el tamanio de la matriz cuadrada:
3
Matriz Completa:
-7 | 6 | 4 | 
9 | -8 | 3 | 
9 | 0 | 7 | 
----ELEMENTOS DE LA DIAGONAL SECUNDARIA------
4 | -8 | 9 | 
----ELEMENTOS SOBRE LA DIAGONAL SECUNDARIA------
-7 | 6 | 9 | 
----ELEMENTOS DEBAJO DE LA DIAGONAL SECUNDARIA------
3 | 0 | 7 | 
BUILD SUCCESSFUL (total time: 3 seconds)
*/