package linklist.singly;

public class traversing {

    public static void printList(node HEAD) {
        node current = HEAD;
        while (current != null) {
            System.out.print("[" + current.getVal() + "] ==> ");
            current = current.next;
        }
        System.out.print("❌");

    }

    public static void main(String[] arg) {
        node head = new node(10);
        node second = new node(20);
        node third = new node(30);
        head.next = second;
        second.next = third;
        printList(head);
    }
}