package p111_CuentaBancariaV1;

import CuentaBancariaV2.CuentaDeAhorro;
import CuentaBancariaV2.CuentaDeCheques;

public class Cliente {
    private String Nombre;
    private CuentaBancaria Cuenta;
    public Cliente(String nombre, CuentaBancaria cuenta){
        Nombre = nombre;
        Cuenta = cuenta;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public CuentaBancaria getCuenta(){
        return Cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta) {
        Cuenta = cuenta;
    }
    @Override
    public String toString(){
        return "Cliente [ Nombre= " + Nombre + ", Cuenta Saldo = " + Cuenta.getSaldo() +"]";
    }
    public void agregarCuenta(CuentaDeCheques cuentaDeCheques) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarCuenta'");
    }
    public void agregarCuenta(CuentaDeAhorro cuentaDeAhorro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarCuenta'");
    }
    
}
