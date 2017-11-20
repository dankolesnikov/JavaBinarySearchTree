package danil;
/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */
public class TestBST {

    public static void main(String[] args) {

        System.out.print("*** Binary Search Tree (BST) in Java ***\n");
        BinarySearchTree waitingRoomBST = new BinarySearchTree();
        Patient alex = new Patient((int) (Math.random() * 100), "Alex");
        Patient danil = new Patient((int) (Math.random() * 100), "Danil");
        Patient minh = new Patient((int) (Math.random() * 100), "Minh");
        Patient laura = new Patient((int) (Math.random() * 100), "Laura");
        Patient alina = new Patient((int) (Math.random() * 100), "Alina");
        Patient pranav = new Patient((int) (Math.random() * 100), "Pranav");
        Patient ari = new Patient((int) (Math.random() * 100), "Ari");
        Patient heather = new Patient((int) (Math.random() * 100), "Heather");
        Patient casey = new Patient((int) (Math.random() * 100), "Casey");
        Patient katie = new Patient((int) (Math.random() * 100), "Katie");
        Patient jeff = new Patient((int) (Math.random() * 100), "Jeff");
        Patient andrew = new Patient((int) (Math.random() * 100), "Andrew");
        Patient kevin = new Patient((int) (Math.random() * 100), "Kevin");
        Patient isaac = new Patient((int) (Math.random() * 100), "Isaac");
        Patient vivian = new Patient((int) (Math.random() * 100), "Vivian");
        Patient ahmad = new Patient((int) (Math.random() * 100), "Ahmad");
        Patient vidya = new Patient((int) (Math.random() * 100), "Vidya");
        Patient mila = new Patient((int) (Math.random() * 100), "Mila");
        Patient dima = new Patient((int) (Math.random() * 100), "Dima");
        Patient mike = new Patient((int) (Math.random() * 100), "Dr. Mike");

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
        System.out.print("\n\nPatients (sorted) in-order after insertion: \n");
        waitingRoomBST.sort();

        System.out.print("\n\nDeleted patient Isaac with priority: " + isaac.getPriority());
        waitingRoomBST.deletePatient(isaac);
        System.out.print("\n\nPatients after deleting Isaac: \n");
        waitingRoomBST.sort();

        Patient michael = new Patient((int) (Math.random() * 100), "Michael");
        waitingRoomBST.insert(michael);
        System.out.print("\n\nInserted patient Michael with priority: " + michael.getPriority());
        System.out.print("\n\nPatients after inserting Michael: \n");
        waitingRoomBST.sort();
    }
}
