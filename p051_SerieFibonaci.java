/**
 * p051_SerieFibonaci -Se desean imprimir los primeros n números de la será de Fibonacci. El proceso debe de poder repetirse hasta
que el usuario lo decida.
 */


import java.util.Scanner;
public class p051_SerieFibonaci { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resp;
        int n, a, b, sig;
        int i;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("¿Cuántos números quieres en la serie Fibonacci? ");
            n = scanner.nextInt();

            a = 0;
            b = 1;
            System.out.println("La serie Fibonacci es:");

            for (i = 1; i <= n; i++) {
                System.out.print(a + " ");
                sig = a + b;
                a = b;
                b = sig;
            }

            System.out.print("\n¿Quieres continuar (s/n)? ");
            resp = Character.toUpperCase(scanner.next().charAt(0));

        } while (resp != 'N');

        scanner.close();
        System.out.println("FIN DEL PROGRAMA.....");
    }
}


