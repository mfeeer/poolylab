/**
 * p074_SumaParesImpares - Suma pares o impares 
 */

 import java.util.Scanner;

 public class p074_SumaParesImpares {
     public static int SumaParImpar(int ini, int fin, char poi) {
         int suma = 0;
         for (int i = ini; i <= fin; i++) {
             if (poi == 'P' && i % 2 == 0) { // Suma de pares
                 suma += i;
             } else if (poi == 'I' && i % 2 != 0) { // Suma de impares
                 suma += i;
             }
         }
         return suma;
     }
 
     public static void main(String[] args) {
         int ini, fin, suma;
         char poi;
         Scanner obj = new Scanner(System.in); // Inicialización del Scanner
 
         System.out.print("\033[H\033[2J");
         System.out.flush(); // Limpia la consola
         System.out.println("Suma Pares o Impares en un rango de valores...");
 
         // Entrada de datos
         do {
             System.out.print("Dame el inicio: ");
             ini = obj.nextInt();
             System.out.print("Dame el fin: ");
             fin = obj.nextInt();
         } while (fin < ini); // Asegura que el fin sea mayor o igual al inicio
 
         // Selección de pares o impares
         System.out.println("\n[P]ares\n[I]mpares");
         poi = Character.toUpperCase(obj.next().charAt(0));
 
         // Cálculo de la suma
         suma = SumaParImpar(ini, fin, poi);
 
         System.out.println("\nLa suma es: " + suma);
     }
 }
 