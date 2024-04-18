import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data>val) {
            //left subtree
           root.left = insert(root.left, val);
        }

       else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);

    }

    public static boolean search(Node root, int key) { // time complexity = O(H) H =  height of tree
        if(root == null){
            return false;
        }
        if(root.data > key){ //left subtree
            return search(root.left, key);

        }
        else if(root.data == key) {
            return true ;

            
        }

        else  {
            return search(root.right, key);
        }
    }

    public static Node  delete(Node root , int val) {
        if(root.data > val) {
             root.left = delete(root.left, val);
        }
        else if (root.data < val ){
            root.right = delete(root.right, val);
        }

        else { // root . data == val
            // case1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
              return root.right;

            }
            else if (root.right == null){
                return root.left;
            }
            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
             root.right =  delete(root.right, IS.data);


        }
        return root;

    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
         return root;
    }

    public static void printInRange(Node root, int X, int Y){
        // case1
        if(root == null){
            return;
        }
        if(root.data>= X && root.data<= Y){
            printInRange(root.left,X,Y);
            System.out.println(root.data+"  ");
            printInRange(root.right, X, Y);

        }
        //case2
        else if(root.data >= Y){
            printInRange(root.left,X,Y);
        }
        else{
            printInRange(root.right, X,Y);
        }


    }
       public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
           System.out.print(path.get(i)+" -> "); 
        }
        System.out.println();

       }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);


        //leaf node condition
        if(root.left == null && root.right == null) {
          printPath(path);

        } else{ // non leaf nodes 
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        
        path.remove(path.size() - 1);
    }

    public static void main(String args[]){
        int values[] =  { 8,5,3,6,10,11,14};  //{8,5,3,1,4,6,10,11,14};//{5,1,3,4,2,7};
        Node root = null;

        for(int i =0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();


        printRoot2Leaf(root, new ArrayList<>());

       //// delete(root, 5 );
        ///inorder(root);

       // printInRange(root, 6 ,10);
 

       // if(search(root, 1)) {
         //   System.out.println("found");
        //} else{
          //  System.out.println("not found");
        //}
        }

        }

    

