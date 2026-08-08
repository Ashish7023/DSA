package linklist.singly;

public class search {

    public static int search_ele(int target,node head){

        node currentNode = head;

        int index = 0;

        while(currentNode!=null){
            if(target==currentNode.getVal()){
                return index+1;
            }
            currentNode= currentNode.next;
            index++;
        }
        
        return -1;
    }
    
}
