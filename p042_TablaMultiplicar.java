/**
 * p042_TablaMultiplicar - Imprime la tabla de multiplicar t hasta n
 */

import java.util.Scanner;

public class p042_TablaMultiplicar {
    public static void main(String[] args) {
        int t, c, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.println("Imprime la tabla de multiplicar \n");
        System.out.print("¿Qué tabla quieres?"); t = obj.nextInt();
        System.out.print("¿Hasta dónde?"); n = obj.nextInt();
        //t = 1;
        c = 1;

        while (c<= n ) {
            System.out.printf("%d x %d \n", t, c, t*c);
            c++;
        }
        System.out.println("\nProceso terminado... ");
    }
}
