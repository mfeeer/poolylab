package p147_TercerExamenParcial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Fernanda Méndez", 19, 'M', "Soltera", "Media", 20000 ));
        datos.add(new Jugador("Juan Herrera", 25,'H',"Soltero", "Defensa", 16000));
        datos.add(new Jugador("Marco Tellez", 22,'H',"Casado", "Delantero", 28000));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }
    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws 
    IOException, ClassNotFoundException {
    ArrayList<Jugador> datos;
    FileInputStream arch = new FileInputStream(archivo);
    ObjectInputStream fpersonas = new ObjectInputStream(arch);
    datos = (ArrayList<Jugador>) fpersonas.readObject();
    fpersonas.close();
    return datos;
    }
}

