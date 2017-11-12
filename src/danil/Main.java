package danil;
/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */
public class Main {

    public static void main(String[] args) {

        BinarySearchTree waitingRoomBST = new BinarySearchTree();

        PatientNode alex = new PatientNode((int)(Math.random() * 100), "Alex");
        PatientNode danil = new PatientNode((int)(Math.random() * 100), "Danil");
        PatientNode minh = new PatientNode((int)(Math.random() * 100), "Minh");
        PatientNode laura = new PatientNode((int)(Math.random() * 100), "Laura");
        PatientNode alina = new PatientNode((int)(Math.random() * 100), "Alina");
        PatientNode pranav = new PatientNode((int)(Math.random() * 100), "Pranav");
        PatientNode ari = new PatientNode((int)(Math.random() * 100), "Ari");
        PatientNode heather = new PatientNode((int)(Math.random() * 100), "Heather");
        PatientNode casey = new PatientNode((int)(Math.random() * 100), "Casey");
        PatientNode katie = new PatientNode((int)(Math.random() * 100), "Katie");
        PatientNode jeff = new PatientNode((int)(Math.random() * 100), "Jeff");
        PatientNode andrew = new PatientNode((int)(Math.random() * 100), "Andrew");
        PatientNode kevin = new PatientNode((int)(Math.random() * 100), "Kevin");
        PatientNode isaac = new PatientNode((int)(Math.random() * 100), "Isaac");
        PatientNode vivian = new PatientNode((int)(Math.random() * 100), "Vivian");
        PatientNode ahmad = new PatientNode((int)(Math.random() * 100), "Ahmad");
        PatientNode vidya = new PatientNode((int)(Math.random() * 100), "Vidya");
        PatientNode mila = new PatientNode((int)(Math.random() * 100), "Mila");
        PatientNode dima = new PatientNode((int)(Math.random() * 100), "Dima");
        PatientNode mike = new PatientNode((int)(Math.random() * 100), "Dr. Mike");

        waitingRoomBST.insert(alex);
        waitingRoomBST.insert(danil);
        waitingRoomBST.insert(minh);
        waitingRoomBST.insert(laura);
        waitingRoomBST.insert(alina);
        waitingRoomBST.insert(pranav);
        waitingRoomBST.insert(ari);
        waitingRoomBST.insert(heather);
        waitingRoomBST.insert(casey);
        waitingRoomBST.insert(katie);
        waitingRoomBST.insert(jeff);
        waitingRoomBST.insert(kevin);
        waitingRoomBST.insert(isaac);
        waitingRoomBST.insert(vivian);
        waitingRoomBST.insert(ahmad);
        waitingRoomBST.insert(andrew);
        waitingRoomBST.insert(vidya);
        waitingRoomBST.insert(mila);
        waitingRoomBST.insert(dima);
        waitingRoomBST.insert(mike);
        waitingRoomBST.sort();
        waitingRoomBST.deletePatient(vidya);
        System.out.print("\n");
        // print sort traversal of the BST
        waitingRoomBST.sort();

    }
}
