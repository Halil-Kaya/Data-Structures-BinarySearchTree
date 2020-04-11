/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author minter
 */
public class Test {
    
    public static void main(String[] args) {
        
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
      

        bst.insertRecursive(9);
        bst.insertRecursive(4);
        bst.insertRecursive(15);
        bst.insertRecursive(2);
        bst.insertRecursive(6);
        bst.insertRecursive(12);
        bst.insertRecursive(17);
        bst.insertRecursive(1);
       

        bst.preorder();
        bst.inorder();
        bst.postorder();
        
        
        System.out.println("sum: "+bst.sumRecursive());
        System.out.println("size: "+bst.sizeRecursive());
        System.out.println("full node count:"+bst.fullNodeCountRecursive());
    }
    
    
    
    
    
}
