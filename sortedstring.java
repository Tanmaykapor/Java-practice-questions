public class sortedstring {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1 ) {
            return true;
        }
        if(arr[idx] < arr[idx+1]) {
            //arry is sorted till now
             return isSorted (arr, idx+1);
        }else{
            return false;
        }
        }
        public static void main(String[] args){
            int arr[] = {1,3,5};
             System.out.println(isSorted(arr, 0));
        }
    }
    //as we return true or false use boolean
    

