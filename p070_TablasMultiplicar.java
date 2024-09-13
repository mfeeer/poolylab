/**
 * p070_TablasMultiplicar - Imprime la tabla de multiplicar que el usuario quiere 
 */

import java.util.Scanner;
public class p070_TablasMultiplicar {
    public static void Tabla(int tabla, int limite){
        for (int i = 1; i<= limite; i++)
            System.out.printf("%d x %d = %d \n", tabla, i, tabla *i);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.print("¿Qué tabla quieres?"); int tabla = obj.nextInt();
        System.out.print("¿Hasta dónde?"); int limite = obj.nextInt();

        Tabla (tabla, limite);

        //Tabla(3, 5);
        //Tabla(2, 4);
        //Tabla (99, 2);

        
    }
}
