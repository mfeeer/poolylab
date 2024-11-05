import java.io.*;
public class p134_Archivos3 {
    public static void main(String[] args) {
        File arch = new File("ciudades.txt");
        if(! arch.exists()) {
            try {
            BufferedReader fciudades = new BufferedReader(new FileReader(arch));
            int mi
            String linea;
            }

        }
        
        
        else {
        try {
        BufferedReader fnombres = new BufferedReader(new FileReader(arch));
        String linea;
        while((linea=fnombres.readLine())!=null)
        System.out.println(linea);
}
