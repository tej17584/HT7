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
    
    protected K key;
    protected V value;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }        
    
    public Association(K llave) {
        this(llave, null);        
    }  

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V nuevoValor) {
        V valorViejo = value;
        value = nuevoValor;
        return valorViejo;
    }
    
    @Override
    public boolean equals (Object objeto) {
        Association otroObjeto = (Association)objeto;
        return getKey().equals(otroObjeto.getKey());
    }
    
}
