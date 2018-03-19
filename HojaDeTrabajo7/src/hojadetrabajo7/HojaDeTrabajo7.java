package hojadetrabajo7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HojaDeTrabajo7 {

    /**
     * @param arg
     */
    public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
       FileReader frr = null;
      BufferedReader br = null;
       BufferedReader brr = null;
      Map<String,String> mapaEnviar = new TreeMap<>();
      Node<Association<String,String>> nuevoNodo;
        BinarySearchTree<Node<Association<String, String>>> bst = new BinarySearchTree<>(); //se crea nuevo arbol null
    
      
         try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         fr= new FileReader("diccionario.txt");
         br = new BufferedReader(fr);
         
         // Lectura del fichero
          // Lectura del fichero
         String linea;
         String Key;
         String Value;
         int posicion;
         while((linea=br.readLine())!=null){
             posicion=linea.indexOf(",");
             Key=linea.substring(1, posicion);
             Value=linea.substring(posicion+2, linea.length()-1);  
             
             nuevoNodo = new Node<>(Key.toUpperCase(), Value.toUpperCase()); //se crea el "nodo" que se pondrá en el tree
             
         }
         System.out.println("Imprimiendo diccionario - InOrder: ");
            bst.inorder();
         //Iniciamos con la segunda lectura del archivo a traducir
         frr= new FileReader("texto.txt");
         brr = new BufferedReader(frr);
         String linea2=brr.readLine();
         String WordList[] = linea2.split(" ");
         
         BinarySearchTree<Node<Association<String, String>>> bt = new BinarySearchTree<>();
        
        String resultado = "";

        String word;
        for(String p: WordList){
            word = p.toUpperCase();
            resultado += bst.search(word) + " ";
            
            
        }
        //System.out.println("\n\n\n\n");
        System.out.println("----------------------------------");
        System.out.println("Traduccion del documento.");
        System.out.println(resultado);
        System.out.println("----------------------------------");
        

      }
      catch(IOException e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
         }
      } 
    }   
}
