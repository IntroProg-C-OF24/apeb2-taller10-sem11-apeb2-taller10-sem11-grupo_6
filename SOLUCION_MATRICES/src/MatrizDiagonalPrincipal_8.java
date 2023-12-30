/*
 Ejercicio 8
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9) generados automáticamente,
presente los elementos de la diagonal principal, los ubicados sobre la diagonal principal, y bajo dicha principal.
 */
import java.util.Random;
import java.util.Scanner;
public class MatrizDiagonalPrincipal_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        int limMt = scanner.nextInt();
        int[][] mt = new int[limMt][limMt];

        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                mt[i][j] = random.nextInt(19) - 9; 
            }
        }

        System.out.println("Matriz Completa");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                System.out.print(mt[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("----ELEMENTOS DE LA DIAGONAL PRINCIPAL------");
        for (int i = 0; i < limMt; i++) {
            System.out.print(mt[i][i] + " | ");
        }
        System.out.println();

        System.out.println("----ELEMENTOS POR ENCIMA DE LA DIAGONAL PRINCIPAL------");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                if (j > i) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println();

        System.out.println("----ELEMENTOS POR DEBAJO DE LA DIAGONAL PRINCIPAL------");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                if (j < i) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println();
    }
}
    
    

