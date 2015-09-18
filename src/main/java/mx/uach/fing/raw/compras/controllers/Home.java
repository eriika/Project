package mx.uach.fing.raw.compras.controllers;

/**
 *
 * @author a256995 TANIA ARANDA LOPEZ
 * @author a262002 SARA RODRIGUEZ SOTO
 * @author a256820 ERIKA NAVARRO 
 * @author a256799 ROGELIO VALENZUELA
 * 
 */

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.uach.fing.raw.compras.models.MisCompras;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.post;
/**
 *
 * @author a256995 TANIA ARANDA LOPEZ
 * @author a262002 SARA RODRIGUEZ SOTO
 * @author a256820 ERIKA NAVARRO
 * @author a256799 ROGELIO VALENZUELA
 *
 */
public class Home {

    /**
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args, Object password) {
get("/home/:usuario", (Request req, Response res) -> {
            String usuario = req.params("usuario") != null ? req.params("usuario") : "no logeado";

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tienditaservice");
            EntityManager em = emf.createEntityManager();

            Query q = em.createQuery("SELECT ls FROM login");
            List<MisCompras> miscompras = q.getResultList();

            em.close();

            Configuration freeMarkerConfiguration = new Configuration();
            freeMarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(Home.class, "/"));
            StringWriter writer = new StringWriter();

            Template homeTemplate = freeMarkerConfiguration.getTemplate("usuario.ftl");
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("usuario", usuario);
            parametros.put("password", password);

            homeTemplate.process(parametros, writer);

            return writer;
                        
           });
	

post("/registrarusu", (req, res) -> {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("tienditaservice");
            EntityManager em = emf.createEntityManager();

            MisCompras ls = new MisCompras(
                    req.queryParams("usu"),
                    req.queryParams("pass"));

            em.getTransaction().begin();
            em.persist(ls);
            em.getTransaction().commit();
            em.close();

            res.redirect("/home/" + req.queryParams("usuario"));
	    res.redirect("/home/" + req.queryParams("password"));
            return null;
        });
    }

    }

    