
package pruebaexamen;

/**
 *
 * @author alumno
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class NoCambiaLongitud extends Vector{

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
    
    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
   public void modificar(int[] vector, int longitudActual, int posicion){
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
//+++++++++++++++++++++++++++++++++++
