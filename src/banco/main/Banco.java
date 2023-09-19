
package banco.main;

/**
 *
 * @author mont_
 */
public class Banco {
    private Cliente[] clientes;
    private int numeroDeCuentas;

    public Banco() {
        this.clientes = new Cliente[10];
        this.numeroDeCuentas = 0;
    }
    
    public void agregarCliente(String nombres, String apellidos){
        int i = numeroDeCuentas++;
        clientes[i] = new Cliente(nombres,apellidos);
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }

    public Cliente getClientes(int indiceDeCliente) {
        return clientes[indiceDeCliente];
    }
    
    
}
