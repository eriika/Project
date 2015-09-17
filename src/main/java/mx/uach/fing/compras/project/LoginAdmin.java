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
@Table(name="loginadmin")
public class LoginAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private String adm;
    private String pass;
    
    public LoginAdmin(String adm, String pass){
    
        this.adm = adm;
        this.pass= pass;

    }

    /**
     * @return the adm
     */
    public String getAdm() {
        return adm;
    }

    /**
     * @param adm the adm to set
     */
    public void setAdm(String adm) {
        this.adm = adm;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
}
