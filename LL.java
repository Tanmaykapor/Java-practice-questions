 class LL {
    Node  head;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }


    }

    //add - first , last

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    // add last
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;

        }

        Node currNode = head; // creating a current node .
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;



    }

    // print list 
   // NULL - C++ ka null haia yae .         null -  yae c++ wala null hai
    public void printList(){
        if(head == null){

            System.out.print("list is empty");
            return;

        }

        Node currNode = head; // creating a current node .
        while(currNode!= null){
            System.out.print(currNode.data  + " ->  ");
            currNode = currNode.next;
        }

        System.out.println("NULL");


    }

    //delete first 
    public void deleteFirst() {
        if(head == null){
            System.out.println("the list is empty");
            return;

        }

         size--;
        head = head.next;
    }

    //delete last 
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;

        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;// head.next = null or lastnode = null
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

     Node prevNode = head;
     Node currNode = head.next;
     while(currNode != null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        //update
        prevNode = currNode;
        currNode = nextNode;

     }
     head.next = null;
     head = prevNode;

    }
    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }
         Node newHead = reverseRecursive(head.next);
         head.next.next = head;
         head.next = null;

         return NewHead;

    }



    public static void main(String[] args){
       // LL list = new LL();
        //list.addFirst("a");
        //list.addFirst("is");
        //list.printList();

        //list.addLast("list");
        //list.printList();

        //list.addFirst("this");
        //list.printList();

        //l//ist.deleteFirst();
        //list.printList();

        //list.deleteLast();
        //list.printList();

        //System.out.println(list.getSize());
        //list.addFirst("this");
        //System.out.println(list.getSize());

        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

       list.head =  list.reverseRecursive(list.head);
        list.printList();
    }
    
}
