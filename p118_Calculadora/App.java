package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        System.out.println("\033[H\033[2J");
        System.out.println("La suma es:");
        miCalculadora.sumar(10, 20);
        System.out.println("La resta es:");
        miCalculadora.restar(100, 50);
        System.out.println("La multiplicación es:");
        miCalculadora.multiplicar(100, 100);
        System.out.println("La división es:");
        miCalculadora.dividir(5000, 25);
    }
}
