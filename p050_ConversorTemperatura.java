/**
 * p050_ConversorTemperatura  -calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores
introducidos por el usuario, es decir el usuario introduce la temperatura inicial y la temperatura final en grados
centígrados y el programa realiza la conversión a farenheit incrementando el valor inicial en 1, hasta llegar al
valor final. Se deberá validar el rango, es decir Final no puede ser menor a Inicial. El proceso debe de poder
repetirse hasta que el usuario lo decida.
 */

import java.util.Scanner;

public class p050_ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempInicial, tempFinal;
        double fahrenheit;
        int i;
        char resp;

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.print("Ingresa la temperatura que deseas convertir en grados centígrados: ");
            tempInicial = scanner.nextInt();

            System.out.print("Introduce la temperatura final en grados centígrados: ");
            tempFinal = scanner.nextInt();

            if (tempFinal < tempInicial) {
                System.out.println("La temperatura final es menor que la temperatura inicial, por favor intentelo de nuevo");
            } else {
                System.out.println("****************************");
                System.out.println("Centígrados ----  Farenheit");
                System.out.println("****************************");

                for (i = tempInicial; i <= tempFinal; i++) {
                    fahrenheit = (i * 9.0 / 5) + 32;
                    System.out.printf("%d                %.1f\n", i, fahrenheit);
                }

                System.out.println("***************************");
            }

            System.out.print("\n¿Deseas continuar (s/n)? ");
            resp = Character.toUpperCase(scanner.next().charAt(0));

        } while (resp != 'N');

        scanner.close();
        System.out.println("Fin del programa:))");
    }
}


