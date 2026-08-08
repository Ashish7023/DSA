package linklist.doubly;

import linklist.singly.node;

public class doublyNode extends node {

    public doublyNode prev;
    public doublyNode next;

    public doublyNode(int val) {
        super(val);
        prev=null;
        next=null;
        
    }

}
