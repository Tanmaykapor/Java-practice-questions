import java.util.*;
public class patternlast {
    public static void main(Strings[] args){
        int n = 4;
        //uppr half
        for(int i=1; i<=n; i++){
            //spaces
            for( int j=1; j<=n-i; j++){
                System.out.print("");


            }
            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        //lower half
        for(int i=n; i>=1; i--){
            //spaces
            for( int j=1; j<=n-i; j++){
                System.out.print(" ");


            }
            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");

            }
            System.out.println();
        
    }
}
}
