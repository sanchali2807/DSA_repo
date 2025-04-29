import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Handler;

public class tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx =-1;//
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;

        }
    }
    public static void preorder(Node root){
        if(root == null)return ;
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void traversal(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);   
                }
            }
        }
    }public static int Sum(Node root){
        if(root == null)return 0;
        int leftNodes = Sum(root.left);
        int rightNodes = Sum(root.right);
        return leftNodes+rightNodes+root.data;
    }
    public static int ToCount(Node root){
        if(root == null)return 0;
        int leftNodes = ToCount(root.left);
        int rightNodes = ToCount(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int height(Node root){
        if(root==null)return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }
    public static int diameter(Node root){
        if(root==null)return 0;
        int leftSub = diameter(root.left);
        int rightSub = diameter(root.right);
        int rootSub = height(root.left)+height(root.right)+1;
        int total = Math.max(rootSub,Math.max(rightSub,leftSub));
        return total;
    }

    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        traversal(root);
        System.out.println();
        System.out.println(ToCount(root));
        System.out.println();
        System.out.println(Sum(root));
        System.out.println();
        System.out.println(height(root));
        System.out.println();
        System.out.println(diameter(root));
    }
} 
