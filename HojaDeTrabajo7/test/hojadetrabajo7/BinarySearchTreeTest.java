/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Tejada
 */
public class BinarySearchTreeTest {
   

    /**
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert() {
        System.out.println("Insertar");
        Node nuevoNodo = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.insert(nuevoNodo);
       
    }


    /**
     * Test of search method, of class BinarySearchTree.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String palabra = "casa";
        BinarySearchTree instance = new BinarySearchTree();
        String expResult = "*casa*";
        String result = instance.search(palabra);
        assertEquals(expResult, result);
      
    }


    
}
