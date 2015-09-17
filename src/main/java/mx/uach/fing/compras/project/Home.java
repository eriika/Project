package mx.uach.fing.compras.project;

import freemarker.cache.ClassTemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
           
                Configuration freeMarkerConfiguration = new Configuration();
                freeMarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(Home.class, "/"));
                StringWriter writer = new StringWriter();

                try {
                    Template homeTemplate = freeMarkerConfiguration.getTemplate("home.ftl");
                } catch (ParseException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }

    }
}

        
