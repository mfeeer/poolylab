/**
 * p021_EjecucionCondicional - Verifica si un numero es positivo, negativo o cero
 */

 import.java.Scanner;
public class p021_EjecucionCondicional {
    public static void main(String[] args) {
            int n;
            System.out.println("Verfica si un número es postivo, negativo o cero\n");
            System.out.print("Dame un numero ? ");
            n = new Scanner(System.in).nextInt();
            if( n>0 )

            System.out.println("El número es POSITIVO");

            if( n<0 )

            System.out.println("El número es NEGATIVO");

            if( n==0 )

            System.out.println("El número es CERO");
            System.out.println("\nGracias por utilizar este programa\n");
    }
}
