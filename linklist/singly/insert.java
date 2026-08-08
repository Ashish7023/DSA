package linklist.singly;

import java.util.*;

class insert {

    public static node insert_at_beginning(int element, node head) {
        // Allocate the memory to the new node that we are going to insert in linkList.
        node newNode = new node(element);
        // assign newly created node next value to the exiting head
        newNode.next = head;
        // Return the new head
        return newNode;
    }

    public static node insert_at_end(int element, node head) {
        // Allocate the memory to the new node that we are going to insert in linkList.
        node newNode = new node(element);

        node current = head;
        // Traverse list till we reach the last node.
        while (current.next != null) {
            current = current.next;
        }
        // After reaching to the last node just last node should point to the newly
        // created node.
        current.next = newNode;
        // Return the head.
        return head;
    }

    public static node insert_at_position(int position, int val, node head) {

        if (head == null)
            return null;

        if (position == 1) {
            return insert_at_beginning(val, head);
        }

        node newNode = new node(val);

        node currentNode = head;

        for (int i = 1; i <= position - 2; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode == null)
            return head;
        
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        node head = new node(10);
        node second = new node(20);
        node third = new node(30);
        head.next = second;
        second.next = third;
        System.out.println(search.search_ele(40, head));

    }

}