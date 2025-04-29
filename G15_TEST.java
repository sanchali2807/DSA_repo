import java.util.*;

public class G15_TEST {
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
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);
        inorder(root); 
    }
}

