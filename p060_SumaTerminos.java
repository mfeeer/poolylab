/**
 * p060_SumaTerminos - 
 */

 import java.util.Scanner;

 public class p060_SumaTerminos {
     public static void main (String[] args ){
         System.out.print("\033[H\033[2J"); System.out.flush();
         System.out.print("¿Hasta qué número desea el factorial? ");
         int n = new Scanner (System.in).nextInt();
         
         float s = 0;
         
         for (int i = 1; i <= n; i++) {
             float f = 1;
             System.out.printf("1 / ");
             
             for (int j = 1; j <= i; j++) {
                 f = f * j;
             }
             
             s = s + 1 / f;
             System.out.printf("%.0f + ", f); 
             System.out.printf("= %.2f ", 1 / f); 
             System.out.println();
         }
         
         System.out.printf("Suma total: %.4f", s); 
     }
 }
 


