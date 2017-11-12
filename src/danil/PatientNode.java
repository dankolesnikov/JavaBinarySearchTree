package danil;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */
public class PatientNode {
    private String patientName; // name of the Patient
    private int key;
    PatientNode left, right;

    public int getKey(){
        return key;
    }
    public String getPatientName(){
        return patientName;
    }
    public PatientNode(int item, String name) {
        key = item;
        patientName = name;
        left = right = null;
    }
}
