/**
 * p049_ParesDescendente - Se desea imprimir los números pares desde 100 hasta el número que el usuario decida (n), además deberá imprimirse la suma y el promedio de esos números pares. El proceso debe de poder repetirse hasta que el usuario lo decida.
 */

 import java.util.Scanner;

 public class p049_ParesDescendente {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         char resp;
 
         do {
             System.out.print("\033[H\033[2J");
             System.out.flush();
 
             System.out.println("Imprimiendo números pares desde 100 hasta n...");
             System.out.print("¿Hasta qué número quieres descender? ");
             int n = scanner.nextInt();
 
             int c = 100;
             int suma = 0;
             int contador = 0;
 
             while (c >= n) {
                 System.out.printf("%d ", c);
                 suma += c;
                 contador++;
                 c -= 2;
             }
 
             float promedio = (float) suma / contador;
 
             System.out.println("\nLa suma de los números pares es: " + suma);
             System.out.printf("El promedio de los números pares es: %.2f", promedio);
             System.out.println("\nEl ciclo ha terminado :)");
 
             System.out.print("\n¿Deseas continuar (S/N)? ");
             resp = Character.toUpperCase(scanner.next().charAt(0));
 
         } while (resp != 'N');
 
         scanner.close();
         System.out.println("Proceso terminado");
     }
 }
 
 
