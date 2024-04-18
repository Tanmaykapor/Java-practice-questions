import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        // Createing
        HashSet<Integer> set = new HashSet<>();
        //same as ArrayList (ArrayList<Integer> list = new ArrayList<>());

        //insert elements
        set.add(1);// list.add(element)
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); 

        // Size 
        System.out.println("size of set is : " + set.size());
        
        //print all elements

        System.out.println(set);


        //serch element
        // Search = Contains
      //  if(set.contains(1)){
       ////     System.out.println("set contains 1");

       // }
       // if(!set.contains(6)){
        //System.out.println("no it dosent contain");
        //}
        // Delete
        //set.remove(1);
       // if(!set.contains(1)) {
            System.out.println("does not contain 1 we deleted one");
       // }

       // Iterator
       Iterator it = set.iterator();
       // it has two imp functions - "hasNext; "next"
         
       while(it.hasNext()){
        System.out.print(it.next()+"  ");
       }
            

        
    }

    
}
