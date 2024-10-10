package p110_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo", true, 10.23);
        Circulo c2 = new Circulo("Verde", false, 99.12);
        Rectangulo r1 = new Rectangulo("Amarillo", false, 10, 20);
        Rectangulo r2 = new Rectangulo("Azul", true, 15, 44.0);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(c1);
        formas.add(c2);
        formas.add(r1);
        formas.add(r2);
        System.out.println("Todas las formas: ");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        ArrayList<Forma> formasC = new ArrayList<>();
        formasC.add(c1);
        formasC.add(c2);
        ArrayList<Forma> formasR = new ArrayList<>();
        formasR.add(r1);
        formasR.add(r2);
        System.out.println("\nCalculando áreas y perimetros de las figuras:");
        for (Forma formaC : formasC) {
            System.out.println("La forma es un Circulo");
            System.out.println("El área es       : " + formaC.getArea());
            System.out.println("El perímetro es  : " + formaC.getPerimetro());
        }
        for (Forma formaR : formasR) {
            System.out.println("La forma es un Rectángulo");
            System.out.println("El área es       : " + formaR.getArea());
            System.out.println("El perímetro es  : " + formaR.getPerimetro());
        }
    }
}
