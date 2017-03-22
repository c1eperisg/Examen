package pruebaexamen;

/**
 * @author Edgar
 * @version 1
 */
public class Vector {
    
    protected int valor;

    public int Visualizar(int[] vector, int i) {
        //Mostramos los elementos del array
        System.out.print("vector={");
     /**
     * @param longitud creamos la variable longitud para evitar asi escribir la funcion
     */
        final int longitud = vector.length;
        for (i = 0; i < longitud - 1; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        return longitud;
    }
    
}
