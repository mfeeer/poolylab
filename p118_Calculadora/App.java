package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        System.out.println("\033[H\033[2J");
        System.out.println("La Suma es:");
        miCalculadora.sumar(10, 20);
        System.out.println("La Resta es:");
        miCalculadora.restar(100, 50);
        System.out.println("La Multiplicación es:");
        miCalculadora.multiplicar(100, 100);
        System.out.println("La División es:");
        miCalculadora.dividir(5000, 25);
    }
}
