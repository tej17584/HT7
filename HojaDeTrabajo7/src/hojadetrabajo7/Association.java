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

    /**
     * El contructor de la clase
     * @param key: La llave de la clase
     * @param value: El valor de la clase
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }        
    
    /**
     * Crea un par a partir de una llave
     * @param llave: la llave
     */
    public Association(K llave) {
        this(llave, null);        
    }  

    /**
     * La llave del objeto
     * @return: La llave
     */
    @Override
    public K getKey() {
        return key;
    }

    /**
     * Retorna el valor del objeto
     * @return: el valor
     */
    @Override
    public V getValue() {
        return value;
    }

    /**
     * Hace un set a un nuevo valor del objeto
     * @param nuevoValor: El valor a insertar
     * @return: El valor previo
     */
    @Override
    public V setValue(V nuevoValor) {
        V valorViejo = value;
        value = nuevoValor;
        return valorViejo;
    }
    
    /**
     * Metodo que permite comparar objetos
     * @param objeto: El objeto a comparar
     * @return: valor booleano para saber si es igual o no
     */
    @Override
    public boolean equals (Object objeto) {
        Association otroObjeto = (Association)objeto;
        return getKey().equals(otroObjeto.getKey());
    }
    
}
