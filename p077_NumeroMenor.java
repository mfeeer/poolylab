/**
 *  p077_NumeroMenor - Diseña un programa con una función que pida 4 números enteros y devuelva el menor de ellos.
*/ 
import java.util.Scanner;

public class p077_NumeroMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Introduce el tercer número:");
        int num3 = scanner.nextInt();
        
        System.out.println("Introduce el cuarto número:");
        int num4 = scanner.nextInt();
        
        int menor = encontrarMenor(num1, num2, num3, num4);
        
        System.out.println("El menor de los cuatro números es: " + menor);
    }
    
    public static int encontrarMenor(int a, int b, int c, int d) {
        int menor = a;
        
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        if (d < menor) {
            menor = d;
        }
        
        return menor;
    }
}
