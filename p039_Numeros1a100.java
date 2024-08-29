/**
 * p039_Numeros1a100 - Imprimir números de 1 a 100 con while
 */
import java.util.Scanner;
 public class p039_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla

        System.out.println("Imprimiendo los números de 0 a n");
        System.out.println("Hasta donde quieres que llegue?"); int n = new Scanner(System.in).nextInt();
        System.out.println("¿En incrementos de?"); int i = new Scanner(System.in).nextInt();

        int c = 0;
        while (c<= n){
            System.out.printf("%d ",c);
            c = c + i;
        }

        System.out.println("\nEl ciclo ha terminado");
        System.out.println(c);

    }
 }