/**
 * p067_PromedioNumeros - Calcular el promedio de 3 numeros usando una función
 */
import java.util.Scanner;
public class p067_PromedioNumeros {
    public static float Promedio (float num1, float num2, float num3) {
        float suma, prom;
        suma = num1 + num2 + num3;
        prom = suma / 3;
        return prom;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        System.out.println("Dados tres números flotantes, obtener su promedio");

        System.out.print("Dame el número 1: "); float num1 = obj.nextFloat();
        System.out.print("Dame el número 2: "); float num2 = obj.nextFloat();
        System.out.print("Dame el número 3: "); float num3 = obj.nextFloat();

        float prom = Promedio (num1, num2, num3);
        System.out.println("\nEl promedio es : " + prom);

        System.out.println("\nEl promedio es : " + Promedio (10, 10, 10));

    }

}
