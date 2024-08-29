/**
 * p040_Numeros100a1 - Imprime números de 100 a 1 usando while
 */
import java.util.Scanner;
public class p040_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla

        System.out.println("Imprimiendo números de n a 1 en decrementos de d \n");
        System.out.println("¿Desde donde deseas descender?");
        int c = new Scanner(System.in).nextInt();
        System.out.println("¿Decrementos de?");
        int d = new Scanner(System.in).nextInt();

        while (c >= 1) {
            System.out.printf("Cheve %d \n ", c);
            c = c - d;
        }
        System.out.println("\nEl ciclo ha terminado...");
        System.out.println(c);
    }
    
}


