/**
 * p059_FactorialNumero - Imprime el facgtorial de n números
 */

import java.util.Scanner;
public class p059_FactorialNumero {
    public static void main (String[] args ){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("¿Hasta qué número desea el factorial? "); int n = new Scanner (System.in).nextInt();
        
        
        for (int i = 1; i <= n; i++) {
            int f= 1;
            System.out.printf("%d! = ", i);
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d %s",j, (i==j ? " " : "*") );
                f = f*j;
            }
            System.out.printf("= %d ", f);
            System.out.println();
        }
        
    }
}
