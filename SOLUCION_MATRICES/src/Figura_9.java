/*
Ejercicio 9
Con el objetivo de manipular correctamente los ciclos repetitivos anidados, se solicita, dado la altura de la salida, generar por pantalla las siguientes figuras. Nota: Ud. puede elegir libremente el caracter a mostrar en la figura.

*
* *
* * *
* * * *

*/
package grupo06taller10;
public class Figura_9 {
    public static void main(String[] args) {
        int altura = 4;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

* 
* * 
* * * 
* * * * 
BUILD SUCCESSFUL (total time: 0 seconds)
*/