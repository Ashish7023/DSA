package linklist.singly;

public class delete {
    public static node delete_at_beginning(node head) {
        // Return immediately when you find there is no linkList is passed.
        if (head == null)
            return null;
        // Store the head next and pass to this as a new node.
        node newHead = head.next;
        return newHead;
    }

    public static node delete_at_last(node head) {

        if (head == null)
            return null;
        if (head.next == null)
            return null;
        // Search till we reach the second last node (Why we need to read till second
        // last not last?)(cuz listList is UniDirectional)
        node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return head;

    }
}
