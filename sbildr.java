public class sbildr {
    public static void main(String[] args){
       StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0


        //System.out.println(sb.charAt(0) );

        //set character at index
      //sb.setCharAt(0, 'p');
      ///System.out.println(sb);
      sb.insert(3, 'S');
      System.out.println(sb);
      //delete 's'
      sb.delete(2,4);// character at index 2 &3 got deleted 

      System.out.println(sb);
      
    }
    
}
