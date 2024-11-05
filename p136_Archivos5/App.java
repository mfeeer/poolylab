package p136_Archivos5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void CapturaDatos(ArrayList<Persona> datos){

    }
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner (System.in);
        String archivo = "datos.dat";
        ArrayList <Persona> datos = new ArrayList<>();

        do{
            System.out.println("\033[H\033[2J");
            System.out.println("------------Procesamiento de datos--------------"); 
            System.out.println("Capturar datos ....................... [ 1 ]");
            System.out.println("Grabar datos en archivo ........... [ 2 ]");
            System.out.println("Leer datos de archivo ............ [ 3 ]");
            System.out.println("Mostrar datos .......... ............ [ 4 ]");
            System.out.println("Salir ................................ [ 5 ]");
            System.out.print("Elije opcion ? "); op = obj.nextInt(); 

            switch (op) {
                case 1:
                    if(datos.size()==0) System.out.println("\nSe capturan datos por primera vez\n");
                else System.out.println("\nLos datos a capturar se agregan a los datos existentes\n");
                Procesa.capturaDatos(datos);
                break;
                case 2 :
                try {
                if(datos.size()!=0) {
                Procesa.grabarDatos(archivo, datos);
                System.out.println("\nDatos grabados correctamente ..");
                } else System.out.println("\nNo hay datos para grabar, captura datos antes");
                } catch (Exception e) {
                System.out.println("\nError al grabar los datos en el archivo");
                } break;
                case 3:
                try {
                datos = Procesa.leerDatos(archivo);
                System.out.println("\nDatos cargados correctamente ..");
        }
    }
}
