import java.util.*;

import javax.swing.tree.TreeNode;
public class CollegeWallah_BinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }   
    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val + "->" +" ");
        if(root.left!=null) System.out.print(root.left.val +" ,");
        else System.out.print("n ,");
        if(root.right!=null)System.out.print(root.right.val);
        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);

    }
    public static int MaxVal(Node root){
       if(root == null) return Integer.MIN_VALUE;
       int a = root.val;
       int b = MaxVal(root.left);
       int c = MaxVal(root.right);
       return Math.max(a , Math.max(b,c));   
    }
    public static int minVal(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val , Math.min (minVal(root.left) , minVal(root.right)));
    }
    public static int size(Node root){
        if(root == null )return 0;
        return 1 + size(root.left) + size(root.right);
           
    }
    public static int sum (Node root){
        if(root == null) return 1;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static int Product(Node root){
        if(root == null) return 1;
        return root.val * Product(root.left) * Product(root.right);
    }

    public static void preOrder(Node root){
        if(root == null)return ;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void NthLevel(Node root , int n){ // left to right
        if(root == null) return ;
        if( n==1 ) System.out.print(root.val +" ");
        NthLevel(root.left,n-1);
        NthLevel(root.right,n-1);
    }
    public static void NthLevel2(Node root , int n){ // right to left
        if(root == null) return ;
        if( n==1 ) System.out.print(root.val +" ");
        NthLevel2(root.right,n-1);
        NthLevel2(root.left,n-1);
    }
     public boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null)return false;
        if(q==null)return false;// if we do not write these cases it will compare null with value
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void bfs(Node root){ // breadth first search
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if ( temp.left != null){
                q.add(temp.left);
            }if ( temp.right != null){
                q.add(temp.right);
            } 
            System.out.print(temp.val + " ");
            q.remove();
        }


        public static int diameterOfBinaryTree(Node root){
            if(root==null)return 0;
        if(root.left==null && root.right==null)return 0;
        int leftSub = diameterOfBinaryTree(root.left);
        int rightSub = diameterOfBinaryTree(root.right);
        int rootSub = height(root.left)+height(root.right);
        if(root.left!=null) rootSub++;
        if(root.right!=null) rootSub++;
        int total = Math.max(leftSub,Math.max(rightSub,rootSub));
        return total;    
        }


        public boolean BalancedTree(Node root){
        if(root==null)return true;
        int lh = height(root.left);
        int rh = height(root.right);
        int d = rh - lh;
        if (d<0) d = -d;
        if(d>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
        }

    }
     public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6); 
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        //display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(MaxVal(root));
        System.out.println(height(root)); 
        System.out.println(minVal(root));
        System.out.println(Product(root));
        //preOrder(root);
        int level = height(root)+1;
        NthLevel(root, 2);
        System.out.println();
        for(int i=1;i<=level;i++){
            NthLevel(root, i);
            System.out.println();
        }

        System.out.println();
        System.out.println();
        bfs(root);


    }
}
