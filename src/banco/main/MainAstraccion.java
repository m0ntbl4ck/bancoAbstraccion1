
package banco.main;

/**
 *
 * @author mont_
 */
public class MainAstraccion {

    
    public static void main(String[] args) {
        Banco banco = new Banco();
        inicializarClientes(banco);
        
        
        ReporteDeClientes reporte = new ReporteDeClientes();
        
        reporte.setBanco(banco);
        
        reporte.generarReporte();
        
    }
    
    private static void inicializarClientes(Banco banco) {
   
        Cliente cliente;
        Cliente cliente1;
        Cliente cliente2;
        Cliente cliente3;
        Cliente cliente4;
        Cliente cliente5;
        
        banco.agregarCliente("William", "Perez");
        cliente = banco.getClientes(0);
        GuardarCuenta cuenta2 = new GuardarCuenta(500.00);
        cliente.agregarCuenta(cuenta2);
        
        
        banco.agregarCliente("Juan", "Rodriguez");
        cliente1 = banco.getClientes(1);
        GuardarCuenta cuenta = new GuardarCuenta(300.00);
        
        cliente1.agregarCuenta(cuenta);
       
        cuenta.deposito(100.00);
         System.out.println("la cuenta del man "+cliente1.getCuenta(0));
        
        banco.agregarCliente("Juliana", "Rosa");
        cliente2 = banco.getClientes(2);
        cliente2.agregarCuenta(new GuardarCuenta(400.00));
        
        banco.agregarCliente("Alberto", "Cortes");
        cliente3 = banco.getClientes(3);
        cliente3.agregarCuenta(new GuardarCuenta(10000.00));
        
        banco.agregarCliente("Jose", "Garzon");
        cliente4 = banco.getClientes(4);
        cliente4.agregarCuenta(new GuardarCuenta(2000.00));
        
        banco.agregarCliente("Sofia", "Hernandez");
        cliente5 = banco.getClientes(5);
        GuardarCuenta cuenta1 = new GuardarCuenta(100.00);
        
        cliente5.agregarCuenta(cuenta1);
        
        cuenta1.retiros(50.00);
        cliente5.agregarCuenta(cuenta1);
        System.out.println("Retiro exitoso "+ cuenta1.getSaldo());
    }
}
