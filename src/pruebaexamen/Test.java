/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package pruebaexamen;

/**
 * @author Edgar
 * @version 1
 */
public class Test {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int []vector= new int[5];
        vector[0]=2;
        vector[1]=4;
        vector[2]=6;
        vector[3]=8; 
        CambiaLongitud posicion=new CambiaLongitud();
        posicion.setValor(10);
        posicion.borrar(vector, 0, 1);
        posicion.setValor(5);
        posicion.insertar(vector, 0, 1);
    }
}
