/**
 * p048_ImparesAscendente - Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),
además deberá imprimirse la suma y el promedio de esos números impares. El proceso debe de poder repetirse
hasta que el usuario lo decida.
 */

import java.util.Scanner;
public class p048_ImparesAscendente {
    public static void main(String[] args) {
        int c, n, s;
        float promedio;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        
        do{
            n = s = 0; 
            System.out.println("Imprime números impares de forma ascendente de 1 hasta n\n");
            System.out.println("¿Hasta dónde desea los impares?");
            n = obj.nextInt();
            s= 0;
            c = 1;
            int prom= 0;
            while (c <= n){
                System.out.printf("%d ", c);
                s += c;
                c += 2;
                prom++;
            }
            promedio = (float)s / prom;
            System.out.printf("\nLa suma de los números impares hasta %d es %d", n, s);
            System.out.printf("\nEl promedio es:  %.2f", promedio);


        System.out.print("\nDeseas continuar (S/N)?"); resp = Character.toUpperCase(obj.next().charAt(0));
        }while ( resp != 'N');
        System.out.println("\nProceso terminado");
    }  
} 