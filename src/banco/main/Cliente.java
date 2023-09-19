
package banco.main;

/**
 *
 * @author mont_
 */
public class Cliente {
    
    private String nombres;
    private String apellidos;
    private Cuenta[] cuentas;
    private int numeroDeCuentas;

    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        
        this.cuentas = new Cuenta[10];
        this.numeroDeCuentas = 0;
    }
    
    public void agregarCuenta(Cuenta cuenta){
        int i = numeroDeCuentas++;
        cuentas[i]=cuenta;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Cuenta getCuenta(int indiceCuentas) {
        return cuentas[indiceCuentas];
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }
   
    
}
