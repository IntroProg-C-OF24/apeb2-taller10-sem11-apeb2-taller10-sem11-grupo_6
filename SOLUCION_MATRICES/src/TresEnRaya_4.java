/*
 Ejercicio 4
Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar
sus movimientos alternativamente.
El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 */
import java.util.Scanner;

public class TresEnRaya_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tabla= new String[3][3];
        int turno = 1;
        int limit = 3;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                tabla[i][j] = " - ";
            }
        }

        for (turno = 1; turno <= limit * limit; turno++) {
            System.out.println("   0   1   2 ");
            for (int i = 0; i < limit; i++) {
                System.out.print(i + " |");
                for (int j = 0; j < limit; j++) {
                    System.out.print(tabla[i][j]);
                    if (j < limit - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }

            if (turno % 2 == 1) {
                System.out.println("Turno del Jugador 1 (X)");
            } else {
                System.out.println("Turno del Jugador 2 (O)");
            }

            System.out.println("Ingrese la fila y la columna para colocar:");
            System.out.println("Fila:");
            int i = scanner.nextInt();
            System.out.println("Columna:");
            int j = scanner.nextInt();

            if (i >= 0 && i < limit && j >= 0 && j < limit && tabla[i][j].equals(" - ")) {
                if (turno % 2 == 1) {
                    tabla[i][j] = " X ";
                } else {
                    tabla[i][j] = " O ";
                }
            } else {
                System.out.println("Ya se ha colocado una ficha en esta posición. Elija otra.");
                turno = turno - 1;
                continue;
            }

            for (int k = 0; k < limit; k++) {
                if (tabla[k][0].equals(tabla[k][1]) && tabla[k][1].equals(tabla[k][2]) && !tabla[k][0].equals(" - ")
                        || tabla[0][k].equals(tabla[1][k]) && tabla[1][k].equals(tabla[2][k]) && !tabla[0][k].equals(" - ")) {
                    System.out.println("¡El jugador " + (turno % 2 == 1 ? "1 (X)" : "2 (O)") + " gana!");
                    return;
                }
            }
            if (tabla[0][0].equals(tabla[1][1]) && tabla[1][1].equals(tabla[2][2]) && !tabla[0][0].equals(" - ")
                    || tabla[0][2].equals(tabla[1][1]) && tabla[1][1].equals(tabla[2][0]) && !tabla[0][2].equals(" - ")) {
                System.out.println("¡El jugador " + (turno % 2 == 1 ? "1 (X)" : "2 (O)") + " gana!");
                return;
            }

            boolean empate = true;
            for (int k = 0; k < limit; k++) {
                for (int l = 0; l < limit; l++) {
                    if (tabla[k][l].equals(" - ")) {
                        empate = false;
                        break;
                    }
                }
            }
            if (empate) {
                System.out.println("¡Es un empate!");
                return;
            }
        }
    }
}
/* EJECUCIÓN DEL CODIGO:
0   1   2 
0 | - | - | - 
1 | - | - | - 
2 | - | - | - 
Turno del Jugador 1 (X)
Ingrese la fila y la columna para colocar:
Fila:
1
Columna:
1
   0   1   2 
0 | - | - | - 
1 | - | X | - 
2 | - | - | - 
Turno del Jugador 2 (O)
Ingrese la fila y la columna para colocar:
Fila:
0
Columna:
0
   0   1   2 
0 | O | - | - 
1 | - | X | - 
2 | - | - | - 
Turno del Jugador 1 (X)
Ingrese la fila y la columna para colocar:
Fila:
2
Columna:
2
   0   1   2 
0 | O | - | - 
1 | - | X | - 
2 | - | - | X 
Turno del Jugador 2 (O)
Ingrese la fila y la columna para colocar:
Fila:
0
Columna:
1
   0   1   2 
0 | O | O | - 
1 | - | X | - 
2 | - | - | X 
Turno del Jugador 1 (X)
Ingrese la fila y la columna para colocar:
Fila:
0
Columna:

1
Ya se ha colocado una ficha en esta posición. Elija otra.
   0   1   2 
0 | O | O | - 
1 | - | X | - 
2 | - | - | X 
Turno del Jugador 1 (X)
Ingrese la fila y la columna para colocar:
Fila:
2
Columna:
0
   0   1   2 
0 | O | O | - 
1 | - | X | - 
2 | X | - | X 
Turno del Jugador 2 (O)
Ingrese la fila y la columna para colocar:
Fila:
0
Columna:
2
¡El jugador 2 (O) gana!

*/