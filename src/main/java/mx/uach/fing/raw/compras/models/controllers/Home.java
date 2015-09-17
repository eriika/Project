package mx.uach.fing.raw.compras.models.controllers;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;

/* 
 * @author a256995 TANIA ARANDA LOPEZ
 * @author a262002 SARA RODRIGUEZ SOTO
 * @author a256820 ERIKA NAVARRO 
 * @author a256799 ROGELIO VALENZUELA
 * 
  Controlador principal de la aplicación
*/
public class Home {
    public static StringWriter main(String[] args, Object usuario, Object password) throws TemplateException, IOException {
        Configuration freeMarkerConfiguration = new Configuration();
            freeMarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(Home.class, "/"));
            StringWriter writer = new StringWriter();

            Template homeTemplate = freeMarkerConfiguration.getTemplate("usuario.ftl");
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("usuario", usuario);
            parametros.put("password", password);

            homeTemplate.process(parametros, writer);

            return writer;
    }
    
}
