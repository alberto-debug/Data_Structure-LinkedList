public class Main {
    public static void main(String[] args) {

        // TODO code application logic here
// create object of class LinkedList
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtStart(90);
        list.insertAtIndex(3,67);
        list.insert (9);
        System. out.println ("List before deletion:");
        list.traverse();

        list.deleteAtIndext(2);
        System. out.println ("List after deletion:");
        list.traverse();
    }
}
