/**
 * Clase que define los metodo propios del binary search tree.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 19.03.18
 */
package hojadetrabajo7;

import static com.sun.xml.internal.ws.util.VersionUtil.compare;

public class BinarySearchTree<E> {
    
    private Node raiz;

    /**
     * Metodo que crea un nodo vacio
     */
    public BinarySearchTree() {
        this.raiz = null;
    }
    
    /**
     * Metodo que inserta un nodo.
     * @param nuevoNodo: El nodo a insertar
     */
    public void insert(Node nuevoNodo) {
        
        raiz = insertRec(raiz, nuevoNodo);
        
    }
    
    /**
     * Metodo que inserta un nodo en la posicion que corresponde.
     * @param raiz: la raiz del nodo actual
     * @param nodo: el nodo a insertar en el arbol
     * @return: La referencia del nuevo nodo en el arbol.
     */
    public Node insertRec(Node raiz, Node nodo) 
    {
         
        if (raiz == null) {
            raiz = nodo;
            return raiz;
        }
         
        else if ((raiz.getKey()).compareTo(nodo.getKey()) > 0){
            raiz.setIzquierda(insertRec(raiz.getIzquierda(), nodo)); 
            raiz.getIzquierda().setPadre(raiz); 
        }
        
        else {
            raiz.setDerecha(insertRec(raiz.getDerecha(), nodo));
            raiz.getDerecha().setPadre(raiz);
        }
         
      return raiz;    
        
    }
    
    /**
     * Metodo que busca una palabra en todo el nodo.
     * @param palabra: La palabra a buscar.
     * @return: El valor del nodo, en este caso, la palabra en espanol
     */
    public String search(String palabra) {
        
        if (raiz == null) {
            
            return "*" + palabra + "*";
            
        } else {
            
            palabra = raiz.buscar(palabra);
        }
        
        return palabra;
    }
            
    
    /**
     * Metodo que imprime el arbol en orden L-N-R.
     * @param raiz: La raiz del arbol
     */
    public void inorderRec(Node raiz) {
        if (raiz != null) {
            
            inorderRec(raiz.getIzquierda());
            System.out.println(raiz.toString());
            inorderRec(raiz.getDerecha());
        }
    }
    
    /**
     * Imprime la raiz en la forma L-N-R.
     */
    public void inorder()  {
       inorderRec(raiz);
    }
 
}