package linklist.doubly;

public class reverse {

    public static doublyNode reverse_list(doublyNode head) {
        if (head == null)
            return null;

        doublyNode currentNode = head;

        while (currentNode != null) {

            if (currentNode.next == null) {
                doublyNode temp = currentNode.next;
                currentNode.next = currentNode.prev;
                currentNode.prev = temp;
                return currentNode;
            }

            doublyNode temp = currentNode.next;
            currentNode.next = currentNode.prev;
            currentNode.prev = temp;
            currentNode = temp;
        }

        return head;
    }

    public static void main(String[] arg) {

        doublyNode head = new doublyNode(10);
        doublyNode first = new doublyNode(20);
        doublyNode second = new doublyNode(30);
        doublyNode third = new doublyNode(40);

        // Connect nodes
        head.next = first;
        first.prev = head;

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        System.out.println("Original List:");
        traverse.printList(head);

        head = reverse_list(head);

        System.out.println("Reversed List:");
        traverse.printList(head);
    }

}
