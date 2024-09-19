/**
 * p075_Factorial - Calcula el factorial de un numero entero
 */
import java.util.Scanner;
public class p075_Factorial {
    public static double Factorial(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {  
            f *= i;  
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("Dame un número entero y te regreso el factorial:");
        
        int n = new Scanner(System.in).nextInt();  

        System.out.println("El factorial es: " + Factorial(n));  
    }
}
