package danil;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */


/* BinarySearchTree class implements BST functionality including inseretion O(lgn), deletion O(lgn) and in-order traversal O(lgn) */
public class BinarySearchTree {

    PatientNode root; // Root node

    // Constructor for BST
    BinarySearchTree() {
        root = null;
    }

    /** treeInsert() O(lgn) is a function to insert a new node in the correct position of BST. */
    private void treeInsert(PatientNode z)
    {
        PatientNode y = null;
        PatientNode x = root;

        while(x != null)
        {
            y = x;
            if(z.getKey() < x.getKey())
            {
                x = x.getLeft();
            }
            else{
                x = x.getRight();
            }
        }
        z.setParent(y); //setting parent of z to y

        if(y == null)
        {
            root = z; //tree T was empty
        }
        else if(z.getKey() < y.getKey())
        {
            y.setLeft(z);
        }
        else{
            y.setRight(z);
        }
    }

    /* treeDelete() O(lgn) method implements delete functionality for 3 cases of BST node deletion. */
    private void treeDelete(PatientNode z)
    {
        if(z.getLeft() == null)
        {
            transplant(z, z.getRight());
        }
        else if(z.getRight() == null)
        {
            transplant(z, z.getLeft());
        }
        else
        {
            PatientNode y = treeMin(z.getRight());

            if(y.getParent() != z)
            {

                transplant(y, y.getRight());
                y.setRight(z.getRight());
                y.getRight().setParent(y);

            }
            transplant(z, y);
            y.setLeft(z.getLeft());
            y.getLeft().setParent(y);
        }
    }

    /* transplant() O(lgn) is a method that replaces one sub-tree as a child of another sub-tree */
    private void transplant(PatientNode u, PatientNode v)
    {
        if(u.getParent() == null)
        {
            root = v;
        }
        else if(u == u.getParent().getLeft())
        {
            u.getParent().setLeft(v);
        }
        else{
            u.getParent().setRight(v);
        }
        if(v != null)
        {
            v.setParent(u.getParent());
        }
    }

    /* treeMin() O(lgn) is a helper method used by delete function that find the smallest node in the give tree */
    private PatientNode treeMin(PatientNode x)
    {
        while(x.getLeft() != null)
        {
            x = x.getLeft();
        }
        return x;
    }

    /* treeSearch() is a private method that searches for node x, patient p in BST*/
    private PatientNode treeSearch(PatientNode x, Patient p)
    {
        if(x == null || p.getPriority() == x.getKey())
        {
            return x;
        }
        if(p.getPriority() < x.getKey())
        {
            return treeSearch(x.getLeft(), p);
        }
        else{
            return treeSearch(x.getRight(), p);
        }
    }

    /* inOrderTreeWalk method O(n) traverses the tree and prints out in the command line. */
    private void inOrderTreeWalk(PatientNode root) {
        if (root != null) {
            inOrderTreeWalk(root.getLeft()); // Traverse recursively down the left tree
            System.out.print(root.getKey()+" – "+root.getData().getName()+"; ");
            inOrderTreeWalk(root.getRight()); // Traverse recursively down the right tree
        }
    }

    /* searchPatient() O(lgn) is a public method to search a Patient in BST */
    public PatientNode searchPatient(Patient p)
    {
        return treeSearch(root, p);
    }

    /* Utility method O(lgn) to insert a new node in the tree  */
    public void insert(Patient patient) {
        PatientNode temp = new PatientNode(patient.getPriority(), patient);
        treeInsert(temp);
        System.out.printf("\nInserted a new patient in line: %d "+patient.getName(),patient.getPriority());
    }

    /* Utility method O(lgn) to delete a node in the tree */
    public void deletePatient(Patient patient) {
        PatientNode temp = searchPatient(patient);
        treeDelete(temp);
    }

    /* Utility method to sort a tree in the Increasing using In Order traversal O(n) */
    public void sort()  {
        inOrderTreeWalk(root);
    }
}
