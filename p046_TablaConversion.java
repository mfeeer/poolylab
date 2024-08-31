/*
 * p046_TablaConversion - Imprime tabla 
 */

import java.util.Scanner;

public class p046_TablaConversion {
    public static void main(String[] args) {
        int ini, fin, c;
        float tc = 20.74f, te=25.00f;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Tabla de conversion de $ peso a $$ dolar\n");
        do {
            System.out.print("Inicio : ");
            ini = obj.nextInt();
            System.out.print("Fin : ");
            fin = obj.nextInt();
        } while (fin < ini); //Valida que iniciomsea menor que fin
        c = ini;
        System.out.println("Peso \t\t Dollar \t Euro");
        System.out.println("----------------------------");
        while (c <= fin) {
            System.out.printf("%10d \t  %10.2f\t %10.2f\n ", c, c * tc, c *te);
            c++;
        }
        System.out.println("----------------------------");
        System.out.print("\nDeseas continuar (S/N) ? ");
        resp = Character.toUpperCase(obj.next().charAt(0));
    }while(resp!='N');
    System.out.println("\nGracias por utilizar este programa !");
    }
}
