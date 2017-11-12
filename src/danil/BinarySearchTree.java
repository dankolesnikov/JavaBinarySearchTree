package danil;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */


/* BinarySearchTree class implements BST functionality including */
public class BinarySearchTree {

    PatientNode root; // Root node

    // Constructor for BST
    BinarySearchTree() {
        root = null;
    }

    /* Delete method implements delete functionality for 3 cases of BST node deletion. O(lgn) */
    public boolean delete(int key){
        PatientNode parent = root;
        PatientNode current = root;
        boolean isLeftChild = false;
        while(current.getKey()!=key){
            parent = current;
            if(current.getKey()>key){
                isLeftChild = true;
                current = current.left;
            }
            else{
                isLeftChild = false;
                current = current.right;
            }
            if(current ==null){
                return false;
            }
        }

        // Case 1: If node is a leaf
        if(current.left==null && current.right==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild ==true){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }

        // Case 2: Node has only one child
        else if(current.right==null){
            if(current==root){
                root = current.left;
            }
            else if(isLeftChild){
                parent.left = current.left;
            }
            else{
                parent.right = current.left;
            }
        }
        else if(current.left==null){
            if(current==root){
                root = current.right;
            }
            else if(isLeftChild){
                parent.left = current.right;
            }
            else{
                parent.right = current.right;
            }
        }

        // Case 3: Node has 2 children
        else if(current.left!=null && current.right!=null){
            // Found the minimum element in the right sub tree
            PatientNode successor	 = getSuccessor(current);
            if(current==root){
                root = successor;
            }
            else if(isLeftChild){
                parent.left = successor;
            }
            else{
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    /* getSuccessor() is a subroutine called by delete method that finds and returns a successor node. O(lgn) */
    public PatientNode getSuccessor(PatientNode delelePatientNode){
        PatientNode successor = null;
        PatientNode successorParent = null;
        PatientNode current = delelePatientNode.right;
        while(current!=null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        /*check if successor has the right child, it cannot have left child for sure.
        If it does have the right child, add it to the left of successorParent.*/
        if(successor!= delelePatientNode.right){
            successorParent.left = successor.right;
            successor.right = delelePatientNode.right;
        }
        return successor;
    }

    /* insertNode() is a recursive function to insert a new node in the correct position of BST. O(lgn) */
    public PatientNode insertNode(PatientNode root, int key, String name) {

        // Edge case: if the tree is empty, return a new node.
        if (root == null) {
            root = new PatientNode(key,name);
            return root;
        }

        // Recur down the tree
        if (key < root.getKey()){
            root.left = insertNode(root.left, key, name);
        }
        else if (key > root.getKey()){
            root.right = insertNode(root.right, key,name);
        }

        return root;
    }

    /* inOrderTraversal() method traverses the tree and prints out in the command line. O(n) */
    public void inOrderTraversal(PatientNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.getKey()+" ("+root.getPatientName()+") ");
            inOrderTraversal(root.right);
        }
    }

    /* Utility method to insert a new node in the tree O(lgn) */
    public void insert(PatientNode patient) {
        int key = patient.getKey();
        String name = patient.getPatientName();
        root = insertNode(root, key, name);
    }

    /* Utility method to insert a new node in the tree O(lgn) */
    public void deletePatient(PatientNode patient) {
        delete(patient.getKey());
    }

    /* Utility method to sort a tree in the Increasing using In Order traversal O(n) */
    public void sort()  {
        inOrderTraversal(root);
    }
}
