/**
 * p073_SumaDigitos - Suma los dígitos individuales de un número entero
 */
import java.util.Scanner;
public class p073_SumaDigitos {
    public static int SumaDigitos(int n) {
        int suma = 0, digito;
        while (n != 0) {
            digito = n % 10;
            suma += digito;
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dame un número entero y sumaré sus dígitos: ");
        numero = sc.nextInt();
        
        System.out.println("\nSuma de los dígitos: " + SumaDigitos(numero));
    }
}

