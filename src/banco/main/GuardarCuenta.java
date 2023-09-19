
package banco.main;

/**
 *
 * @author mont_
 */
public class GuardarCuenta extends Cuenta{
    
    double interes = 0.06;

    public GuardarCuenta(double saldo) {
        super(saldo);
    }
    
    
    @Override
    public boolean retiros(double monto) {
        if(monto <= saldo){
            saldo -= monto;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getDescripcion() {
        return "Cuenta de Ahorros ";
    }
    
    @Override
    public void deposito(double monto){
       saldo += monto;
       saldo -=  (saldo*interes);
        System.out.println(saldo);
   }
    
}
