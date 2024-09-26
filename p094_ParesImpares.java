/**
 * Declare dos arreglos de números enteros de una cantidad MAX 100 (a[MAX], b[MAX])
 Muestre la cuenta de impares
 Rellene el arreglo a[] con números aleatorios entre 0 y 20
 Muestre elementos del arreglo
 Muestre solo los elementos que son pares y los cuente
 Muestre solo los elementos que son impares y los cuente
 Muestre la cuenta de pares
 */
import java.util.Random;
public class p094_ParesImpares {
        public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);
        }
        System.out.println("Elementos del arreglo 'a':");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int par = 0;
        System.out.println("Elementos pares del arreglo:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                par++;
            }
        }
        System.out.println("\nSuma de pares: " + par);
        int impar = 0;
        System.out.println("Elementos impares del arreglo:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                impar++;
            }
        }
        System.out.println("\nSuma de impares: " + impar);
    }
    
}

