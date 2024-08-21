// p03_AreaTriangulo - Calcula el área de un triángulo

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el área de triángulo.\n");
        System.out.println("Dame la base ?"); base = obj.nextInt();
        System.out.println("Dame la altura ?"); altura = obj.nextInt();

        area =( base * altura ) / 2;
        System.out.println(String.format("Para un triángulo de base %d y una altura de %d el área es %.2f ", base, altura, area));
    }
}
