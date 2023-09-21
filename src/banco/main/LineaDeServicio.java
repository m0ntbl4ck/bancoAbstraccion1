
package banco.main;

/**
 *
 * @author mont_
 */
public enum LineaDeServicio {
    VISA("Clasica"),
    MASTERCARD("Gold"),
    AMERICANEXPREES("Platino");

    public String getLineaDeServicio() {
        return lineaDeServicio;
    }
    
    private String lineaDeServicio;

    private LineaDeServicio(String lineaDeServicio) {
        this.lineaDeServicio = lineaDeServicio;
    }
    
    
}
