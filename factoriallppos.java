import java.util.*;
public class factoriallppos {
    public static void CalculateFactorial(int x) {
        //loop
        if(x>0){
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for(int i =x; i >=1; i--) {
            factorial = factorial*i;

        }
        System.out.println(factorial);
        return;
    }


public static void main(Strings[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
     CalculateFactorial(x);
}
}