package p112_CuentaBancariaV2;

import java.util.ArrayList;

public class Banco {
     private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    public Banco() {
        Clientes = new ArrayList<>();
    }
    public Banco(String nombre, String domicilio) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }
     public ArrayList<Cliente> getClientes() {
        return Clientes;
     }
     public double getTotal() {
        double total = 0;
        for(Cliente cliente : Clientes) {
            total += cliente.getTotal();
        }
        return total;
     }
     public void reporte() {
        for (Cliente cliente : Clientes) {
            System.out.println(">" + cliente);
            for (CuentaBancaria cuenta : cliente.getCuentas())
            System.out.println(cuenta);
            if(cliente.getCuentas().size() !=0) System.out.println();
        }
     }
     public void calcularInteres() {
        for ( Cliente cliente : Clientes) {
            for ( CuentaBancaria cuenta : cliente.getCuentas())
            if ( cuenta instanceof CuentaDeAhorro)
            ((CuentaDeAhorro)cuenta).calcularIntereses();
        }
     }
     @Override
     public String toString() {
        return "Banco [Nombe = " + Nombre + ", Domicilio = " + Domicilio + ",  Clientes = " + Clientes.size() + ", Total=" + this.getTotal() +"]";
     }
}
