package grupo06taller10;
/*
Ejercicio 1
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, 
la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia 
INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben 
calcular (ponderar) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA 
con un peso del 30%). En resumen, los requerimientos son los siguientes:

Registre los nombres de cada estudiante de dicho paralelo.
Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
Obtenga el promedio del curso, del paralelo C.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
*/
import java.util.Random;
import java.util.Scanner;

public class GestionNotas_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int limEsts = 28, limNotas = 3;
        double mayorPromedio, menorPromedio;
        String estudianteMayor = "", estudianteMenor = "";

        String[] arrNombEst = new String[limEsts];
        double[][] arrNotasEst = new double[limEsts][limNotas];
        double[] arrPromEst = new double[limEsts];
        double promedioCurso, sumaPromedios = 0;

        for (int i = 0; i < limEsts; i++) {
            System.out.print("Ingrese nombre del Estudiante " + (i + 1) + ": ");
            arrNombEst[i] = scanner.nextLine();

            for (int j = 0; j < limNotas; j++) {
                arrNotasEst[i][j] = rand.nextInt(11);
            }
        }

        for (int i = 0; i < limEsts; i++) {
            arrPromEst[i] = (arrNotasEst[i][0] * 0.35) + (arrNotasEst[i][1] * 0.35) + (arrNotasEst[i][2] * 0.3);
            sumaPromedios += arrPromEst[i];
        }

        promedioCurso = sumaPromedios / limEsts;

        System.out.println("Promedio del curso: " + promedioCurso);
        System.out.println("==============================================");
        System.out.println("Estudiantes con promedio superior al del curso:");

        for (int i = 0; i < limEsts; i++) {
            if (arrPromEst[i] > promedioCurso) {
                System.out.println(arrNombEst[i] + " | PROMEDIO: " + arrPromEst[i]);
            }
        }
        System.out.println("===============================================");
        System.out.println("Estudiantes con promedio inferior al del curso:");

        for (int i = 0; i < limEsts; i++) {
            if (arrPromEst[i] < promedioCurso) {
                System.out.println(arrNombEst[i] + " | PROMEDIO: " + arrPromEst[i]);
            }
        }
        System.out.println("==============================================");

        mayorPromedio = arrPromEst[0];
        menorPromedio = arrPromEst[0];

        for (int i = 1; i < limEsts; i++) {
            if (arrPromEst[i] > mayorPromedio) {
                mayorPromedio = arrPromEst[i];
                estudianteMayor = arrNombEst[i];
            }

            if (arrPromEst[i] < menorPromedio) {
                menorPromedio = arrPromEst[i];
                estudianteMenor = arrNombEst[i];
            }
        }

        System.out.println("Estudiante con el mayor promedio: " + estudianteMayor + " | Promedio: " + mayorPromedio);
        System.out.println("Estudiante con el menor promedio: " + estudianteMenor + " | Promedio: " + menorPromedio);
    }
}
/*
Ingrese nombre del Estudiante 1: Maria
Ingrese nombre del Estudiante 2: Juan
Ingrese nombre del Estudiante 3: Ana
Ingrese nombre del Estudiante 4: Carlos
Ingrese nombre del Estudiante 5: Sofia 
Ingrese nombre del Estudiante 6: Pedro
Ingrese nombre del Estudiante 7: Laura
Ingrese nombre del Estudiante 8: Luis
Ingrese nombre del Estudiante 9: Valentina
Ingrese nombre del Estudiante 10: Alejandro
Ingrese nombre del Estudiante 11: Gabriela
Ingrese nombre del Estudiante 12: Andres
Ingrese nombre del Estudiante 13: Camila
Ingrese nombre del Estudiante 14: Diego
Ingrese nombre del Estudiante 15: Natalia
Ingrese nombre del Estudiante 16: Miguel
Ingrese nombre del Estudiante 17: Lucia
Ingrese nombre del Estudiante 18: Jose
Ingrese nombre del Estudiante 19: Valeria
Ingrese nombre del Estudiante 20: Javier
Ingrese nombre del Estudiante 21: Marta
Ingrese nombre del Estudiante 22: Ricardo
Ingrese nombre del Estudiante 23: Andrea
Ingrese nombre del Estudiante 24: Daniel
Ingrese nombre del Estudiante 25: Kevin
Ingrese nombre del Estudiante 26: Federico
Ingrese nombre del Estudiante 27: Clara
Ingrese nombre del Estudiante 28: Raul
Promedio del curso: 5.455357142857144
==============================================
Estudiantes con promedio superior al del curso:
Carlos | PROMEDIO: 7.65
Sofia  | PROMEDIO: 7.699999999999999
Luis | PROMEDIO: 5.999999999999999
Valentina | PROMEDIO: 7.449999999999999
Alejandro | PROMEDIO: 6.4
Gabriela | PROMEDIO: 8.049999999999999
Andres | PROMEDIO: 6.35
Diego | PROMEDIO: 6.1
Jose | PROMEDIO: 5.55
Valeria | PROMEDIO: 5.9
Javier | PROMEDIO: 6.949999999999999
Ricardo | PROMEDIO: 7.749999999999999
Andrea | PROMEDIO: 5.8999999999999995
Federico | PROMEDIO: 5.75
Raul | PROMEDIO: 8.0
===============================================
Estudiantes con promedio inferior al del curso:
Maria | PROMEDIO: 2.6499999999999995
Juan | PROMEDIO: 4.35
Ana | PROMEDIO: 4.449999999999999
Pedro | PROMEDIO: 2.35
Laura | PROMEDIO: 5.05
Camila | PROMEDIO: 2.55
Natalia | PROMEDIO: 2.75
Miguel | PROMEDIO: 5.449999999999999
Lucia | PROMEDIO: 4.449999999999999
Marta | PROMEDIO: 4.7
Daniel | PROMEDIO: 2.3
Kevin | PROMEDIO: 4.9
Clara | PROMEDIO: 5.3
==============================================
Estudiante con el mayor promedio: Gabriela | Promedio: 8.049999999999999
Estudiante con el menor promedio: Daniel | Promedio: 2.3
BUILD SUCCESSFUL (total time: 3 minutes 35 seconds)
*/