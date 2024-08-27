/**
 * p029_Calculadora - Realiza oeraciones matemáticas básicas sobre dos números
 */

import java.util.Scanner;

public class p029_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op; //char sirve para que una variable sea de tipo caracter
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nEfectuando operaciones matemáticas básicas sobre 2 números: ");
        System.out.print("Dame número 1: "); n1 = obj.nextFloat();
        System.out.print("Dame número 2: "); n2 = obj.nextFloat();
        System.out.print("Operaciones + - * / ^ ? "); n2 = obj.nextFloat(); op= obj.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
                break;
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
                break;
            case '^':
                System.out.printf("%.2f ^ %.2f = %.2f", n1, n2, Math.pow(n1, n2));
                break;
            default:
            System.out.println("\nEsta operación no está implementada, tuys chilaquiles están en riesgo... ");

        }
        System.out.println("\nYa te estás ganando unos chilaquiles...");
    }
}
