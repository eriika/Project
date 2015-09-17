
package mx.uach.fing.raw.compras.models;

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
 * @author a       ROGELIO VALENZUELA
 * 
 */
@Entity
@Table(name="usuarios")
public class CreateMyAccount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String name;
    private String username;
    private Integer password;
    private Integer repeatpassword;
    private Long id;
    
    public CreateMyAccount (String name, String username, Integer password, 
            Integer repeatpassword){
        this.name= name;
        this.username=username;
        this.password= password;
        this.repeatpassword=repeatpassword;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(Integer password) {
        this.password = password;
    }

    /**
     * @return the repeatpassword
     */
    public Integer getRepeatpassword() {
        return repeatpassword;
    }

    /**
     * @param repeatpassword the repeatpassword to set
     */
    public void setRepeatpassword(Integer repeatpassword) {
        this.repeatpassword = repeatpassword;
    }

    /**
     * @return the id que se asignara al usuario al ser guardado en 
     *         la base de datos.
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
