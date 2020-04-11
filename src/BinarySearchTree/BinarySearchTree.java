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
public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public void insert(T newData) {
        Node<T> newNode = new Node<>(newData);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node<T> tmp = root;
            while (tmp != null) {
                //saga gidecek
                if (newData.compareTo(tmp.data) > 0) {
                    if (tmp.rightChild == null) {
                        tmp.rightChild = newNode;
                        return;
                    }
                    tmp = tmp.rightChild;
                }//sola gidecek
                else if (newData.compareTo(tmp.data) < 0) {
                    if (tmp.leftChild == null) {
                        tmp.leftChild = newNode;
                        return;
                    }
                    tmp = tmp.leftChild;
                } else {
                    return;
                }
            }
        }
    }

    public void insertRecursive(T newData) {
        root = insertRecursive(root, newData);
    }

    private Node<T> insertRecursive(Node<T> node, T newData) {

        if (node == null) {
            return new Node<T>(newData);
        } else {

            if (newData.compareTo(node.data) > 0) {
                node.rightChild = insertRecursive(node.rightChild, newData);
            } else if (newData.compareTo(node.data) < 0) {
                node.leftChild = insertRecursive(node.leftChild, newData);
            } else {

            }
            return node;
        }
    }

    private boolean search(T searchData) {

        if (isEmpty()) {
            System.out.println("eleman yok");
        } else {

            Node<T> tmp = root;
            while (tmp != null) {
                //saga gidecek
                if (searchData.compareTo(tmp.data) > 0) {

                    tmp = tmp.rightChild;

                }//sola gidecek
                else if (searchData.compareTo(tmp.data) < 0) {

                    tmp = tmp.leftChild;

                } else {
                    return true;
                }

            }

        }

        return false;

    }

    public void preorder() {
        System.out.println("preorder: ");
        preorder(root);
        System.out.println("");
    }

    private void preorder(Node<T> node) {

        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.leftChild);
            preorder(node.rightChild);
        }

    }

    public void inorder() {
        System.out.println("ineorder: ");
        ineorder(root);
        System.out.println("");
    }

    private void ineorder(Node<T> node) {

        if (node != null) {
            ineorder(node.leftChild);
            System.out.print(node.data + " ");
            ineorder(node.rightChild);
        }

    }

    public void postorder() {
        System.out.println("postorder: ");
        postorder(root);
        System.out.println("");
    }

    private void postorder(Node<T> node) {

        if (node != null) {
            postorder(node.leftChild);
            postorder(node.rightChild);
            System.out.print(node.data + " ");
        }

    }

    public boolean isEmpty() {
        return root == null;
    }

    public int sumRecursive() {
        return sumRecursive(root);
    }

    public int sumRecursive(Node<T> node) {
        int sonuc = 0;
        if (node == null) {
            return 0;
        } else {
            sonuc = (int) (Object) node.data;
            sonuc += sumRecursive(node.leftChild);
            sonuc += sumRecursive(node.rightChild);
        }
        return sonuc;
    }

    public int sizeRecursive() {
        return sizeRecursive(root) - 1;
    }

    public int sizeRecursive(Node<T> node) {
        int sonuc = 0;
        if (node == null) {
            return 1;
        } else {

            sonuc += sizeRecursive(node.leftChild);
            sonuc += sizeRecursive(node.rightChild);
        }
        return sonuc;
    }

    public int fullNodeCountRecursive() {
        return fullNodeCountRecursive(root);
    }

    public int fullNodeCountRecursive(Node<T> node) {
        int sonuc = 0;
        if (node == null) {
            return 1;
        } else {

            if (node.leftChild != null && node.rightChild != null) {
                sonuc++;
                sonuc += fullNodeCountRecursive(node.leftChild);
                sonuc += fullNodeCountRecursive(node.rightChild);

            } else {
                fullNodeCountRecursive(node.leftChild);
                fullNodeCountRecursive(node.rightChild);
            }
        }
        return sonuc;
    }

}
