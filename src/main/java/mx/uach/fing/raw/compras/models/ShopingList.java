package mx.uach.fing.raw.compras.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author a256995 TANIA ARANDA LOPEZ
 * @author a262002 SARA RODRIGUEZ SOTO
 * @author a256820 ERIKA NAVARRO 
 * @author a256799 ROGELIO VALENZUELA
 * 
 */

@Entity
@Table(name="compras")

public class ShopingList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer compra;
    private Date fecha;
    private String estatus;
    
    public ShopingList(Integer compra, Date fecha, String estatus){
    
        this.compra = compra;
        this.fecha= fecha;
        this.estatus = estatus;
        
    
    }

    /**
     * @return the compra
     */
    public Integer getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(Integer compra) {
        this.compra = compra;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
