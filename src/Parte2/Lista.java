
package Parte2;

/**
 *
 * @author OROZCO
 */
public class Lista {
    private Nodo nodoActual, nodoNuevo;
    String Cola = "";

    public Lista() {
        nodoActual = null;
        nodoNuevo = null;
    }

    public boolean Listavacia() {
        if (nodoActual == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para insertar
    public void insertar(String informacion) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.info = informacion;
        
        nuevo_nodo.siguiente = null;

        if (Listavacia()) {
            nodoActual = nuevo_nodo;
            nodoNuevo = nuevo_nodo;
        } else {
            nodoNuevo.siguiente = nuevo_nodo;
            nodoNuevo = nuevo_nodo;
        }

    }
}
    
    
    
/*    
    public void InsertarRecursivo(String nodoActual, String nodoNuevo){
        if (nodoActual.siguiente == null){
            nodoActual.siguiente = nodoNuevo;

        }else{
            InsertarRecursivo(nodoActual.siguiente, nodoNuevo);
    }
    
    public String dividir_frase(frase){
        return frase.split(" ");
    }

    public String guardar_palabras_en_lista(lista, palabras, n){
        if (n == len(palabras)){
            return Lista;
        }else{
    Lista.append(palabras[n]);
    return guardar_palabras_en_lista(lista, palabras, n + 1);
  }

    public void guardar_palabras_en_lista(frase){
        palabras = dividir_frase(frase);
        lista = guardar_palabras_en_lista(lista, palabras, 0);
    }*/

