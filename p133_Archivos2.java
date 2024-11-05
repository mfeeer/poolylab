
//import java.io.File;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.*;
public class p133_Archivos2 {
    public static void main(String[] args) {
        String[] ciudades = { "Zacatecas", "Fresnillo", "Cd. Guzmán", "Río Grande", "Guadalajara", "Novolato", "Zacatlán" };
        File arch = new File("ciudades.txt");
        System.out.print("\033[H\033[2J");
        if(! arch.exists()) { 
            System.out.println("El archivo no existe");
            try {
                BufferedWriter fciudades = new BufferedWriter(new FileWriter(arch));
                for (String ciudad: ciudades)
                fciudades.write(ciudad +"\n");
                fciudades.close();
                System.out.println("Archivo creado con éxito");
                } catch (Exception e) {
                System.out.println("Hubo problemas al manipular el archivo" + e.getMessage());
                System.out.println(e);
                }

        } else {
            System.out.println("El archivo ya existe...");
        }
    }
}
