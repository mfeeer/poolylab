/**
 * Una empresa fotocopiadora requiere un programa que le permita llevar el control de su venta de
fotocopias. El valor de la copia es: Carta $3, Oficio $4, Doble Oficio $6, debe mostrarse un
resumen de ventas con un mensaje de acuerdo a la venta total
 */

 import java.util.Scanner;

 public class p065_SistemaPapeleria {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int totalVentas = 0;
        int ventasCarta = 0, ventasOficio = 0, ventasDobleOficio = 0;
        int cantidadCarta = 0, cantidadOficio = 0, cantidadDobleOficio = 0;
        int opcion, cantidad;
        boolean repite = true;
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("-------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias\n");
        System.out.println("-------------------------------");
        
 
        while (repite) {
            System.out.println("Selecciona la opción que deseas:");
            System.out.println("Tamaño carta:       precio: $3 - [1]:");
            System.out.println("Tamaño oficio:      precio: $4 - [2]:");
            System.out.println("Tamaño doble oficio: precio: $6 - [3]:");
 
            opcion = obj.nextInt();
            System.out.print("¿Qué cantidad deseas? ");
            cantidad = obj.nextInt();
 
            switch (opcion) {
                case 1:
                    ventasCarta += 3 * cantidad;
                    cantidadCarta += cantidad;
                    break;
                case 2:
                    ventasOficio += 4 * cantidad;
                    cantidadOficio += cantidad;
                    break;
                case 3:
                    ventasDobleOficio += 6 * cantidad;
                    cantidadDobleOficio += cantidad;
                    break;
                default:
                    System.out.println("Error en el sistema");
                    break;
            }
 
            System.out.print("¿Deseas continuar (s/n)? ");
            String resp = obj.next().toLowerCase();
            repite = resp.equals("s");
 
            totalVentas = ventasCarta + ventasOficio + ventasDobleOficio;
 
            System.out.println("---------------------------------------");
            System.out.println("Resumen diario de ventas");
            System.out.println("---------------------------------------");
            System.out.println("Tamaño carta:       " + cantidadCarta + " - $" + ventasCarta);
            System.out.println("Tamaño oficio:      " + cantidadOficio + " - $" + ventasOficio);
            System.out.println("Tamaño doble oficio: " + cantidadDobleOficio + " - $" + ventasDobleOficio);
            System.out.println("---------------------------------------");
            System.out.println("Total ventas: " + (cantidadCarta + cantidadOficio + cantidadDobleOficio) + " - $" + totalVentas);
 
            if (totalVentas < 50) {
                System.out.println("Esta venta es una: Venta moderada....");
            }else if (totalVentas >= 50 && totalVentas <= 100) {
                System.out.println("Esta venta es una: Venta frecuente....");
             }else {
                System.out.println("Esta venta es una: Venta superada....");
             }
         } System.out.println("Fin del programa....");
     }
 }
 