/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CambiaLongitudTest {
    
    public CambiaLongitudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of borrar method, of class CambiaLongitud.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int []vector= new int[5];
        vector[0]=2;
        vector[1]=4;
        vector[2]=6;
        vector[3]=8; 
        int longtiudActual = 4;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(vector, longtiudActual, posicion);
        int []vector2= new int[5];
        vector2[0]=4;
        vector2[1]=6;
        vector2[2]=8; 
        Assert.assertArrayEquals(vector, vector2);
      
    }

    /**
     * Test of insertar method, of class CambiaLongitud.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int []vector= new int[5];
        vector[0]=0;
        vector[1]=4;
        vector[2]=6;
        vector[3]=8;
        int []vector2= new int[5];
        vector2[0]=4;
        vector2[1]=6;
        vector2[2]=8; 
        int longitudActual = 3;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.insertar(vector2, longitudActual, posicion);
        
        Assert.assertArrayEquals(vector2, vector);
    }
    
}
