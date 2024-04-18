public class newbuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        //sb.append("e");
        //sb.append("l");
        //sb.append("l");
        //sb.append("o");
        //System.out.println(sb.length());
        for(int i = 0; i < sb.length()/2; i++){
            int front = i ;
            int back = sb.length() -1-i ;//5-1-0 = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            

        }
        System.out.println(sb);
    }
}