import java.util.*;

public class pattern 7{
    public static void main (String arge[]){
        int n = 5;
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
