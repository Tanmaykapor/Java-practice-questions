import java.util.*;
public class QuesoneCountofnode {
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
       public static int countOfNodes(Node root){
        if( root == null ){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
       } 

    
    public static void main(String[] args){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        

       System.out.println(countOfNodes((root)));
    }
    
}





    


    

