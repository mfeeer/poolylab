/**
 * p033_NumerosConsecutivos - Dados 3 números enteros, verificar si son consecutivos (9, 10, 11) y mandar un mensaje confirmandolo, si no lo son (1, 4, 6) mandar mensaje de error
 */

import java.util.Scanner;
public class p033_NumerosConsecutivos {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.print("Introduce el primer número entero: "); num1 = obj.nextInt();
        System.out.print("Introduce el segundo número entero: "); num2 = obj.nextInt();
        System.out.print("Introduce el tercer número entero: "); num3 = obj.nextInt();

        if (num2 == num1 + 1 && num3 ==num2 + 1){  
            System.out.println("Los números son consecutivos");

        } else {   
        System.out.println("Los números no son consecutivos");
        }
        System.out.println("\nGracias por usar este programa, vuelva pronto");
        

    }
    
}
