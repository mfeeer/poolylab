/**
 * p044PareesAscendentes -Imprime números pares desde 2 hasta n, repite el proceso varias veces
 */

import java.util.Scanner;
public class p044_ParesAscendentes {
    public static void main(String[] args) {
        int c, n, s;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do{
            System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
            c = 2; 
            n = s = 0; 
            System.out.println("Imprime pares de forma ascendente de 2 hasta 1\n");
            System.out.println("¿Hasta dónde desea los pares?");
            n = obj.nextInt();
            while (c <= n){
                System.out.printf("%d ", c);
                s += c;
                c += 2;
            }
            System.out.printf("\nLa suma de los pares hasta %d es %d", n, s);
            System.out.printf("\nDeas continuar? (S/N)"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado");

    }
    
}
