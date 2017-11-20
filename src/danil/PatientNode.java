package danil;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */
public class PatientNode {
    private int key;
    private Patient patient;
    private PatientNode parent, left, right;

    public PatientNode(int key, Patient patient) {
        this.patient = patient;
        this.key = key;
        parent = null;
        left = null;
        right = null;
    }

    /** Getters */
    public int getKey(){
        return key;
    }
    public Patient getData(){
        return patient;
    }

    public PatientNode getLeft(){
        return left;
    }

    public PatientNode getRight(){
        return right;
    }

    public PatientNode getParent(){
        return parent;
    }

    /** Setters */
    public void setLeft(PatientNode l){
        this.left = l;
    }

    public void setRight(PatientNode r){
        this.right = r;
    }
    public void setParent(PatientNode p){
        this.parent = p;
    }


}
