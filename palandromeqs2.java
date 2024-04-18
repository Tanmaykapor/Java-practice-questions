
 /**  Definition for Single-linked list.
  public class Listnode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){this.val = val;}
  ListNode(int val, ListNode next) {this.val; this.next = next;}
  }
  */


public class palandromeqs2 {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next  = prev;
            prev = curr;
           curr = next;
        }
        return prev;

    }
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

        }
        return turtle;
    }


    public boolean isPalindrome(ListNode head) {
      if(head == null || head.next == null){
        return true;

      }  
           listNode middle = findMiddle(head); // 1st half ka end kya hai vo yae batae ga
            ListNode secondHalfStart = reverse(middle.next);

            ListNode firstHalfStart = head;
            while(secondHalfStart != null){
                if(firstHalfStart.val != secondHalfStart.val){
                   return false; 
                }
                firstHalfStart = secondHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            return true;




    }
    
}
