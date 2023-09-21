
package banco.main;

/**
 *
 * @author mont_
 */
public interface OperacionesCuenta {
    public double getSaldo();
    
   public void deposito(double monto);
   
   public boolean retiros(double monto);
   
   public String getDescripcion();
}


