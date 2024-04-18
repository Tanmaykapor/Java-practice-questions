 /**  Definition for Single-linked list.
  public class Listnode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){this.val = val;}
  ListNode(int val, ListNode next) {this.val; this.next = next;}
  }
  */

public class lastques {
    public boolean hasCycle(ListNode head){

        if(head == null){
            return false;
        }
        ListNode hare = head; // fast
        ListNode turtle = head; //slow

        while( hare != null && hare.next != null){
            hare == hare.next.next;
            turtle == turtle.next ;

            if(hare == turtle){
                return true;

            }

        }
        return false;


    }
}
