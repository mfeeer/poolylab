package p114_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this();
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLiga() {
        return Liga;
    }

    public void setLiga(String liga) {
        Liga = liga;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        Jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getSalario() + jugador.getBono();
        }
        return total;
    }

    public void reporte() {
        System.out.println("Equipo [Nombre = " + Nombre + ", Liga = " + Liga + 
                           ", Jugadores = " + Jugadores.size() +
                           ", Bono = " + getTotalBono() + 
                           ", Total = " + getTotal() + 
                           ", Hombres = " + getTotalH() + 
                           ", Mujeres = " + getTotalM() + "]");
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador.toString());
        }
    }
}


