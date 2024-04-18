import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        //country population
        HashMap<String, Integer> map = new HashMap<>();


        // insertion
        map.put("India", 120);
        map.put("US", 100);
        map.put("china", 150);
        System.out.println(map);

        //map.put("china ", 180);
        //System.out.println(map);

        // Search operation
        if(map.containsKey("India")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");

        }
       // System.out.println(map.get("India")); // key is present in the map
        //System.out.println(map.get("hindustan")); // key is not present in the map

        //int arr[] = {12 , 15, 18};
        //for(int i = 0; i <3; i++){
          //  System.out.print(arr[i]+ " ");
        //}
        //System.out.println();

        //for(int val : arr){
          //  System.out.print(val+ " ");
        //}
       // System.out.println();

       //for( Map.Entry<String, Integer> e :map.entrySet()){
        //System.out.println(e.getKey());
        //System.out.println(e.getValue());
       //}
       //Set<String> keys = map.keySet();
       //for(String key : keys) {
        //System.out.println(key+ "" + map.get(key));

       //}

       //remove
       map.remove("china");
       System.out.println(map);
    }
    
}
