//Convertir una temperatura de grados fahrenheit a grados celsius
//celsius = (fahrenheit – 32) * (5/9).

import java.util.Scanner;

public class p012_ConvertirTemperatura {
    public static void main (String[] args) {
        double gradosf, gradosc;
        Scanner fahrenheit= new Scanner (System.in);
    System.out.println("Temperatura den grados Fahrenheit: ");
    gradosf = fahrenheit.nextDouble();
    gradosc = (gradosf - 32) * 5/9;
    System.out.println("Temperatura en grados Celsius:  " + gradosc);
     
    }
}
