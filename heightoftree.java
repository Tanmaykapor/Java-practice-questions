import java.util.*;
public class heightoftree {
    

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this .right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes [idx]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;


        }
    }
    public static void preorder (Node root){
        if(root == null){
            return;


        }
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void levelOrder(Node root) {
        if(root  == null) {
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty ()){
            Node currNode = q.remove ();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode != null){
                    q.add(currNode.right);
                }

            }
                }
            }
       // }
       public static int sumOfNodes(Node root){
        if( root == null ){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
       } 

       public static int height(Node root){

        if(root == null){
            return 0;
        }



        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;

       }

    
    public static void main(String[] args){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        

       System.out.println(height((root)));
    }
    
}
    

