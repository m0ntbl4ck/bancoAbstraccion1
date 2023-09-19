
package banco.main;

/**
 *
 * @author mont_
 */
public abstract class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
   public void deposito(double monto){
       saldo += monto;
   }
   
   public abstract boolean retiros(double monto);
   
   public abstract String getDescripcion();

    @Override
    public String toString() {
        return getDescripcion() +": el saldo de la cuenta es: "+this.getSaldo();
    }
   
   
   
}
