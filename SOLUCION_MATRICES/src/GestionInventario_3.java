/*
Ejercicio 3
Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. 
Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, 
con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, 
y unidades deseadas. Adicional se debe agregar a la factura al 12% del IVA, y si la compra superar los $100, 
se debe aplicar un descuento.

Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva. Crea
 */
package grupo06taller10;
import java.util.Scanner;

public class GestionInventario_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, iva, totalConIva, totalSinIva;
        int numProductos, cantidadDeseada, codigoFacturar;
        boolean encontrado = false;
        iva = 0.12;

        System.out.print("Ingrese el numero de productos a ingresar al inventario: ");
        numProductos = scanner.nextInt();

        String[] nombresProducto = new String[numProductos];
        int[][] datosProducto = new int[numProductos][3];

        for (int i = 0; i < numProductos; i++) {
            datosProducto[i][0] = i + 1;
            System.out.println("==========================================");
            System.out.println("Codigo del producto: " + datosProducto[i][0]);
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            scanner.nextLine();
            nombresProducto[i] = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            datosProducto[i][1] = scanner.nextInt();
            System.out.print("Ingrese la cantidad del producto: ");
            datosProducto[i][2] = scanner.nextInt();
        }
        
        System.out.println("=========================================");
        System.out.println("INVENTARIO");
        for (int i = 0; i < numProductos; i++) {
            System.out.println("Codigo: " + datosProducto[i][0] + ", Producto: " + nombresProducto[i]);
            System.out.println("--> Precio: $" + datosProducto[i][1] + ", Cantidad: " + datosProducto[i][2]);
        }

        System.out.println("==========================================");
        System.out.println("FACTURA: ");
        System.out.print("Ingrese el codigo del producto a facturar: ");
        codigoFacturar = scanner.nextInt();

        for (int i = 0; i < numProductos; i++) {
            if (datosProducto[i][0] == codigoFacturar) {
                encontrado = true;
                System.out.print("Ingrese la cantidad deseada a facturar para " + nombresProducto[i] + ": ");
                cantidadDeseada = scanner.nextInt();

                precio = datosProducto[i][1];
                totalSinIva = precio * cantidadDeseada;
                totalConIva = totalSinIva + (totalSinIva * iva);

                if (totalSinIva > 100) {
                    System.out.println("Su compra ha superado los $100, se ha aplicado un descuento (No se agrega el 12% de IVA)");
                    System.out.println("Producto: " + nombresProducto[i] + ", Cantidad: " + cantidadDeseada);
                    System.out.println("El valor total a pagar es de: $" + totalSinIva + " (descuento aplicado)");
                } else {
                    System.out.println("Producto: " + nombresProducto[i] + ", Cantidad: " + cantidadDeseada);
                    System.out.println("Total a pagar: $" + totalSinIva + " , Sumado el IVA (12%): $" + totalConIva + " (No se aplica descuento)");
                }
            }
        }

        if (!encontrado) {
            System.out.println("El producto no fue encontrado en el inventario.");
        }
    }
}
/*
Ingrese el numero de productos a ingresar al inventario: 2
==========================================
Codigo del producto: 1
Ingrese el nombre del producto 1: Camiseta
Ingrese el precio del producto: 15
Ingrese la cantidad del producto: 20
==========================================
Codigo del producto: 2
Ingrese el nombre del producto 2: Pantalon
Ingrese el precio del producto: 15
Ingrese la cantidad del producto: 20
=========================================
INVENTARIO
Codigo: 1, Producto: Camiseta
--> Precio: $15, Cantidad: 20
Codigo: 2, Producto: Pantalon
--> Precio: $15, Cantidad: 20
==========================================
FACTURA: 
Ingrese el codigo del producto a facturar: 2
Ingrese la cantidad deseada a facturar para Pantalon: 10
Su compra ha superado los $100, se ha aplicado un descuento (No se agrega el 12% de IVA)
Producto: Pantalon, Cantidad: 10
El valor total a pagar es de: $150.0 (descuento aplicado)
BUILD SUCCESSFUL (total time: 1 minute 20 seconds)
*/