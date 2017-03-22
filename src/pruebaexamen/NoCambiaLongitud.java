
package pruebaexamen;

/**
 * @author Edgar
 * @version 1
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class NoCambiaLongitud extends Vector{

    /**
     * @return devolvemos la variable valor del vector
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor fijamos un valor a la variable valor del vector
     */
    public void setValor(int valor) {
        this.valor = valor;
    }   
    
    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
   public void modificar(int[] vector, int longitudActual, int posicion){
     /**
     * @param i iniciamos una variable que utilizaremos como contador
     */
     	int i=0;  
        int longitud = Visualizar(vector, i);
         //Modificamos el array
       	  if(posicion<longitud){ 
              //mostramos su contenido
              System.out.println("Elemento a modificar=" + vector[posicion]);
              vector[posicion] = this.getValor();
             }
       //Mostramos los elementos del array  
       System.out.print("vector={");
       for (i=0;i<longitud-1;i++){
           System.out.print(vector[i]+",");
       }    
         System.out.println("}");  
    }
}
