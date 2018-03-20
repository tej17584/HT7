package hojadetrabajo7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
        String linea;
        String Key;
        String Value;
        int posicion;
        while((linea=br.readLine())!=null){
            posicion=linea.indexOf(",");
            Key=linea.substring(1, posicion);            
            Value=linea.substring(posicion+2, linea.length()-1);              

            nuevoNodo = new Node<>(Key.toUpperCase(), Value.toUpperCase()); //se crea el "nodo" que se pondrá en el tree             
            bst.insert(nuevoNodo);
            
         }
        
         System.out.println("Imprimiendo diccionario - InOrder: \n");         
         bst.inorder();
         
         //Iniciamos con la segunda lectura del archivo a traducir
         frr= new FileReader("texto.txt");
         brr = new BufferedReader(frr);
         Scanner scr = new Scanner(brr);  
         
         String linea2="";   
         String string="";
         
          while (scr.hasNextLine()) {
            linea2 += scr.nextLine();                        
        }                    
         
          string = linea2.replaceAll("\n", " ");
            System.out.println(string);
          
         String WordList[] = string.split(" ");
         
         String resultado = "";

        String palabra;
        
        for(String p: WordList){
            palabra = p.toUpperCase();
            resultado += bst.search(palabra) + " ";                        
        }
         
        BinarySearchTree<Node<Association<String, String>>> BinarySearchTree = new BinarySearchTree<>();                
        
        System.out.println("\n Traduccion:\n");        
        System.out.println(resultado);                

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
