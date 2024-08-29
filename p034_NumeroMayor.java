/**
 * p034_NumeroMayor - Dados tres números enteros, verificar cual es el mayor.
 */
import java.util.Scanner;
public class p034_NumeroMayor {
    public static void main(String[] args) {
         int num1, num2, num3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.print("Introduce el primer número entero: "); num1 = obj.nextInt();
        System.out.print("Introduce el segundo número entero: "); num2 = obj.nextInt();
        System.out.print("Introduce el tercer número entero: "); num3 = obj.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("El número mayor es: "+ num1);
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println("El número mayor es: "+ num2);
        }
        else if (num3 >= num1 && num3 >= num2){
            System.out.println("El número mayor es: "+ num3);


        }
        System.out.println("\nGracias por usar este programa, vuelva pronto");
        
    }
}
