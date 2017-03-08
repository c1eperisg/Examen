
package pruebaexamen;

/**
 *
 * @author alumno
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class CambiaLongitud extends Vector {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }


//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar (int[] vector, int longtiudActual, int posicion){
        int i = 0;	  
        //mostramos su contenido
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
//+++++++++++++++++++++++++++++++++++
