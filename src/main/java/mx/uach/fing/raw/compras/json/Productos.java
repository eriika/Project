
package mx.uach.fing.raw.compras.json;

/**
 *
 * @author a256995 TANIA ARANDA LOPEZ
 * @author a262002 SARA RODRIGUEZ SOTO
 * @author a256820 ERIKA NAVARRO 
 * @author a256799 ROGELIO VALENZUELA
 * 
 */
public class Productos {
    private int id_producto;
    private String producto;
    private int precio;
    private String descripcion;
    
    public static void main(String[] args) {
        
        
    }

    /**
     * @return the id_producto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
