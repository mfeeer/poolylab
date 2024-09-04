/**
 * p054_ArribaAbajo - Ir de 1 a N o de N a 1 segun lo decida el usuario
 */
import java.util.Scanner;
public class p054_ArribaAbajo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.println("Imprime los números de N a 1 o de N a 1 segun lo decidas:))");
        System.out.println("Números de 1 a N...... [ 1 ]");
        System.out.println("Números de N a 1...... [ 2 ]");
        System.out.println("Salir del programa...... [ 3 ]");
        System.out.print("Elije una opción: "); int op = obj.nextInt();

        switch (op) {
            case 1:
                System.out.println("Imprimiendo de 1 a N......");
                System.out.println("¿Hasta dónde?");  n = obj.nextInt();
                for (int i = 1; i <= n; i++) System.out.print(i + " ");
                break;
            case 2:
                System.out.println("Imprimiendo de N a 1......");
                System.out.println("¿Desde dónde?");  n = obj.nextInt();
                for (int i = n; i >= 1; i--) System.out.print(i + " ");
                break;
            case 3:
                System.out.println("\nHaz decidido salir del sistema..\n");
                break;
            default:
                System.out.println("Opción inválida");
                break;

        }
        System.out.println("\nProceso terminado.");






    }   
   
}
