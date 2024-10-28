import java.util.Scanner;


public class p125_Excepcion5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int a[] = {10,20,30,40};

        System.out.println("Los elementos de la lista son : ");
        for (int i : a){
            System.out.println(i + " ");
        }
        try {
        System.out.println("Que posición del arreglo deseas acceder ? "); int pos = new Scanner(System.in).nextInt();
        System.out.println("La posición " + pos + ", contiene el valor de " + a[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
        
        System.out.println("Estas tratando de acceder una posición del arreglo fuera de límite");
        System.out.println("Mensaje del sistema : " + e);
        
        } finally {
        System.out.println("Los elementos que tiene el arreglo son:");
        for (int i : a) {
        System.out.print(i+" ");
        }
    }
    }
}

