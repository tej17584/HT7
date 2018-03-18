/**
 * Clase que define los nodos que se estaran usando en el programa
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 19.03.18
 */
package hojadetrabajo7;

public class Node<E> {
    
    private Association<String, String> valor;
    private Node<E> padre;
    private Node<E> izquierda, derecha;

    public Node(Association<String, String> valor) {
        this.valor = valor;
        padre = null;
        izquierda = null;
        derecha = null;
    }
    
    public Node(){}
    
//    public Association<String,String> getValue(){        
//        
//        return valor;        
//    }
    
    /**
     * Metodo que retorna la llave del nodo.
     * @return: La palabra en ingles.
     */
    public String getKey(){
        return valor.key;
    }
    
    /**
     * Metodo que retorna la palabra en el valor del nodo.
     * @return: La palabra en espanol.
     */
    public String getValue(){
        return valor.value;       
    }        

    /**
     * Metodo que retorna la referencia al padre del nodo
     * @return: El nodo del pabre
     */
    public Node<E> getPadre() {
        return padre;
    }

    /**
     * Metodo que retorna la referencia al lado izquierdo del nodo.
     * @return: El lado izquierdo del nodo.
     */
    public Node<E> getIzquierda() {
        return izquierda;
    }
    
    /**
     * Metodo que retorna la referencia al lado derecho del nodo.
     * @return: El lado derecho del nodo.
     */
    public Node<E> getDerecha() {
        return derecha;
    }

    /**
     * Metodo que crea la referencia al padre del nodo
     * @param padre: El padre del nodo actual.
     */
    public void setPadre(Node<E> padre) {
        this.padre = padre;
    }

    /**
     * Metodo que crea la referencia al lado derecho del nodo
     * @param derecha: El lado derecho del nodo actual.
     */
    public void setDerecha(Node<E> derecha) {
        this.derecha = derecha;
    }
    
    /**
     * Metodo que crea la referencia al lado izquierdo del nodo.
     * @param izquierda: El lado izquierdo del nodo actual.
     */
    public void setIzquierda(Node<E> izquierda) {
        this.izquierda = izquierda;        
    }
    
    /**
     * Metodo que busca si el nodo contiene la palabra a evaluar
     * @param palabra: la palabra en ingles.
     * @return: Dependiendo si encuentra la palabra, devuelve la misma pero traducida
     * de lo contario, devuelve la misma palabra ingresada.
     */
    public String buscar(String palabra) {
        
        String palabraIngles = this.valor.getKey();
        String palabraEspanol = this.valor.getValue();
        
        if (palabra.equals(palabraIngles)) {
            return palabraEspanol;
            
        } else {
            
            return "*" + palabra + "*";
            
        }
        
    }

    @Override
    public String toString() {
        String palabraIngles = this.valor.getKey();
        String palabraEspanol = this.valor.getValue();
        
        return "( " + palabraIngles + ", " + palabraEspanol + ")";
    }
    
    
    
}
