package linklist.singly;

public class node {
    private int value;
    public node next;
    protected node(int val){
        this.value=val;
        next=null;
        
    }
    public int getVal(){
        return this.value;
    }
}