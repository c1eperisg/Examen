package pruebaexamen;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Edgar
 * @version 1
 */
public class NoCambiaLongitudTest {
    
    public NoCambiaLongitudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

 

    /**
     * Test of modificar method, of class NoCambiaLongitud.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int []vector= new int[5];
        vector[0]=0;
        vector[1]=4;
        vector[2]=6;
        vector[3]=8;
        int longitudActual = 0;
        int posicion = 0;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.modificar(vector, longitudActual, posicion);

    }
    
}
