public class recursionsumofnnaturalnumb {
    public static void printSum(int i, int n, int Sum) {
        if ( i == n ) {
            
            Sum += i;
            System.out.println(Sum);
            return;
        }
        Sum += i;
        printSum(i+1, n, Sum);
        System.out.println(i);

    }  
    public static void main(String[] args){
        printSum(1 ,5 , 0);

     }
    
}
