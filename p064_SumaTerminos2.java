/**
 * p064_SumaTerminos2 - Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma
 */
import java.util.Scanner;
public class p064_SumaTerminos2 {
    public static void main (String[] args ){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("¿Cúantos términos desea imprimir? ");
        int n = new Scanner (System.in).nextInt();
        
        int s = 0;
        int num = 0;
        
        System.out.println("Salida:");
        for (int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            
            System.out.print(num);
            if (i< n ){
                System.out.print("+");
            } 
            s += num;
        

        }
        System.out.println();
        System.out.println("\nSuma:" + s); 
    }
}


