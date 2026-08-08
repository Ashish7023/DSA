package linklist.doubly;

import linklist.singly.node;

public class traverse {
    
        public static void printList(doublyNode HEAD) {
            doublyNode current = HEAD;
            while (current != null) {
                System.out.print("[" + current.getVal() + "] <---> ");
                current = current.next;
            }
            System.out.println("❌");
    
        }

    }
