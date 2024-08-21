//Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares

import java.util.Scanner;

public class p015_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, dolares, costo;
        Scanner peso = new Scanner(System.in);
        Scanner cost = new Scanner(System.in);

        System.out.print("Dame la cantidad de pesos a convertir: ");
        pesos = peso.nextFloat();
        System.out.print("¿Precio del dolar? ");
        costo = cost.nextFloat();

        dolares = pesos / costo;

        System.out.println("El equivalente en dolares es "+ dolares);

    }

    
}
