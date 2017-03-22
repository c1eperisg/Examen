
package pruebaexamen;

/**
 * @author Edgar
 * @version 1
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class CambiaLongitud extends Vector {

    /**
     * @return el valor del vector
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor set del valor del vector
     */
    public void setValor(int valor) {
        this.valor = valor;
    }


//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos
    public void borrar (int[] vector, int longtiudActual, int posicion){
     /**
     * @param i iniciamos una variable que utilizaremos como contador
     */
        int i = 0;	  
        //Mostramos los elementos del array
        int longitud = Visualizar(vector, i);
         //Borramos el elemento
       	 if(posicion<longitud){ 
             System.out.println("Elemento a borrar=" + vector[posicion]);                                       
            for (i = posicion; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
          }
   //Mostramos los elementos del array  
       System.out.print("vector={");
         for (i=0;i<longitud-1;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");         
      }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void insertar (int[] vector, int longitudActual, int posicion){
    /**
     * @param i iniciamos una variable que utilizaremos como contador
     */
    int i;	  
        int longitud = Visualizar(vector, i=0);
         //Borramos el elemento
       	 if(posicion<longitud){ 
             System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
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
