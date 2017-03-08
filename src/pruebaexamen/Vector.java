/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

/**
 *
 * @author alumno
 */
public class Vector {
    
    protected int valor;

    public int Visualizar(int[] vector, int i) {
        //Mostramos los elementos del array
        System.out.print("vector={");
        final int longitud = vector.length;
        for (i = 0; i < longitud - 1; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        return longitud;
    }
    
}
