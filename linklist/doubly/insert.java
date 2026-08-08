package linklist.doubly;

import linklist.singly.node;

public class insert {

    public static doublyNode insert_at_beginning(int element, doublyNode head) {

        doublyNode newNode = new doublyNode(element);

        if (head == null)
            return newNode;

        newNode.next = head;

        head.prev = newNode;

        return newNode;
    }

    public static doublyNode insert_at_end(int element, doublyNode head) {

        doublyNode newNode = new doublyNode(element);

        if (head == null)
            return newNode;

        doublyNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;

        return head;

    }

}
