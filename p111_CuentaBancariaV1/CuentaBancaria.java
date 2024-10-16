package p111_CuentaBancariaV1;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void deposita (double cantidad){
        saldo = saldo + cantidad;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean retira(double cantidad){
        if (saldo>=cantidad ){
            saldo = saldo - cantidad;
            return true;
        }
        return false;
    }

    public CuentaBancariaV2.CuentaBancaria get(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}
