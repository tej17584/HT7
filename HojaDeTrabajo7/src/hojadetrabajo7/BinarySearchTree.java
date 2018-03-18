/**
 * Clase que define los metodo propios del binary search tree.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 19.03.18
 */
package hojadetrabajo7;

import static com.sun.xml.internal.ws.util.VersionUtil.compare;

public class BinarySearchTree {
    
    private Node raiz;

    /**
     * Metodo que crea un nodo vacio
     */
    public BinarySearchTree() {
        this.raiz = null;
    }
    
    /**
     * Metodo que inserta un nodo en la posicion que corresponde.
     * @param raiz: la raiz del nodo actual
     * @param nodo: el nodo a insertar en el arbol
     * @return: La referencia del nuevo nodo en el arbol.
     */
    public Node insertRec(Node raiz, Node nodo) {
        
        String valorRaiz = raiz.getKey();
        String valorNodo = nodo.getKey();
        Node valorIzquierda = raiz.getIzquierda();
        Node valorDerecha = raiz.getDerecha();
        
        if (raiz==null) {
            
            raiz = nodo;
            return raiz;            
        }
        
        else if (compare(valorRaiz, valorNodo) > 0) {
            
            raiz.setIzquierda(insertRec(valorIzquierda, nodo));
            raiz.getIzquierda().setPadre(raiz);            
            
        }
        
        else {
            
            raiz.setDerecha(insertRec(valorDerecha, nodo));
            raiz.getDerecha().setPadre(raiz);
            
        }
        
        return raiz;
        
    }
    
    public String search(String palabra) {
        
        if (raiz == null) {
            
            return "*" + palabra + "*";
            
        } else {
            
            palabra = raiz.buscar(palabra);
        }
        
        return palabra;
    }
 
}
