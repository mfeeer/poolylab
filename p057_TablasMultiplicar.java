/**
 * p057_TablasMultiplicar - Imprimir las tablas del 1 al 10 hasta el 10
 */

 import java.util.Scanner;

 public class p057_TablasMultiplicar {
     public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         boolean repite = true;  
 
         while (repite) {
             System.out.print("\033[H\033[2J");
             System.out.flush();
 
             System.out.println("¿Hasta qué tabla quieres? ");
             int n = obj.nextInt();
 
             System.out.println("¿Hasta dónde la quieres? ");
             int m = obj.nextInt();
             for (int i = 1; i <= n; i++) {
                 System.out.println("Tabla del " + i);
                 System.out.println("----------------");
                 for (int j = 1; j <= m; j++) {
                     System.out.println(i + " x " + j + " = " + (i * j));
                 }
                 System.out.println(); 
             }
 
             System.out.print("¿Deseas continuar (s/n)? ");
             String resp = obj.next().toLowerCase();  
             repite = resp.equals("s");
         }
 
         System.out.println("\nProceso terminado.");
     }
 }
 
 

