
package mx.uach.fing.compras.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 
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
}
