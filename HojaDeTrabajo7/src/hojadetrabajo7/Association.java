/**
 * Clase que define el valor de los nodos que se estara implementando en el programa
 * Estos se usan como 'valor - llave'.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 19.03.18
 */
package hojadetrabajo7;
import java.util.Map;

public class Association<K,V> implements Map.Entry<K,V>{
    
    protected K theKey;
    protected V theValue;

    public Association(K key, V value) {
        this.theKey = key;
        this.theValue = value;
    }        
    
    public Association(K llave) {
        this(llave, null);        
    }

    Association() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public K getKey() {
        return theKey;
    }

    @Override
    public V getValue() {
        return theValue;
    }

    @Override
    public V setValue(V nuevoValor) {
        V valorViejo = theValue;
        theValue = nuevoValor;
        return valorViejo;
    }
    
}
