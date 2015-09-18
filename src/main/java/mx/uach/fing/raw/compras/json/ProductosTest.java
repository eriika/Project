
package mx.uach.fing.raw.compras.json;

/**
 *
 * @author a256995 TANIA ARANDA LOPEZ
 * @author a262002 SARA RODRIGUEZ SOTO
 * @author a256820 ERIKA NAVARRO 
 * @author a256799 ROGELIO VALENZUELA
 * 
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductosTest {
//Función principal
    public static void main(String[] args) throws JsonParseException,
            JsonMappingException, IOException {
        /*Una manera de hacer referencia al archivo jason es 
        llamandolo directamente*/
        File jsonFile = new File("productos.json");
        /*Otra manera de hacer referencia es poniendo una url donde 
        este almacenado el archivo json*/
        URL jsonUrl = new URL("https://gist.githubusercontent.com/"
                + "TaniaArandaLopez/25f45541f8d58797566a/raw/"
                + "5bb18fb19a5c141f1ab301371b60c88f2d9974b8/productos.json");
        
        /*definimos la clase productos */
        Productos productos = null;

        ObjectMapper mapper = new ObjectMapper();/*definimos el objeto 
                                                    para el mapeo */

        
        
        //mapeamos por los dos metodos de acceso al archivo json
        productos = mapper.readValue(jsonFile, Productos.class);
        System.out.println(productos.getId_producto());
        System.out.println(productos.getProducto());
        System.out.println(productos.getPrecio());
        System.out.println(productos.getDescripcion());

        productos = mapper.readValue(jsonUrl, Productos.class);
        System.out.println(productos.getId_producto());
        System.out.println(productos.getProducto());
        System.out.println(productos.getPrecio());
        System.out.println(productos.getDescripcion());
    }

}