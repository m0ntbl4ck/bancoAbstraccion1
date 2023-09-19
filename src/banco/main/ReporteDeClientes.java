
package banco.main;

/**
 *
 * @author mont_
 */
public class ReporteDeClientes {
    private Banco banco;
    
    public Banco getBanco(){
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public void generarReporte(){
        System.out.println("\t\t\tREPORTE DE CLIENTE");
        System.out.println("\t\t\t==================");
        
        for (int i = 0; i < banco.getNumeroDeCuentas(); i++) {
            Cliente cliente = banco.getClientes(i);
            
            System.out.println();
            System.out.println("Cliente: "+
                    cliente.getNombres()+ ", "+
                    cliente.getApellidos()
            );
            
            for (int j = 0; j < cliente.getNumeroDeCuentas(); j++) {
                Cuenta cuenta = cliente.getCuenta(j);
                System.out.println("    "+ cuenta);
            }
        }
    }
}
