/**
 * p091_Temperaturas - Muestra los elementos de temperatura
 */

 public class p091_Temperaturas {
    public static void mostrar(float[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void cero(float[] a) {
        for(int i = 0; i < a.length; i++)
            if (a[i] > 10) 
                a[i] = 0;
    }

    public static void main(String[] args) {
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.printf("\nPrimer elemento : %.2f", temperaturas[0]); 
        System.out.printf("\nTercer elemento : %.2f", temperaturas[2]);
        System.out.print("\nMostrar los elementos: "); mostrar(temperaturas);

        System.out.print("\nElementos mayores de 10 como 0: "); cero(temperaturas); 
    
        mostrar(temperaturas);
    }
}

