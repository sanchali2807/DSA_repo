import java.util.LinkedList;
import java.util.Queue;
public class insertInATree {
        static class TreeNode {
            int data;
            TreeNode left, right;
    
            TreeNode(int val) {
                data = val;
                left = right = null;
            }
        }
        // Insert function
        public static void insert(TreeNode root, int key) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
    
            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
    
                if (temp.left == null) {
                    temp.left = new TreeNode(key);
                    break;
                } else {
                    queue.add(temp.left);
                }
    
                if (temp.right == null) {
                    temp.right = new TreeNode(key);
                    break;
                } else {
                    queue.add(temp.right);
                }
            }
        }
        // Inorder Traversal function
        public static void inorder(TreeNode root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public static void main(String[] args) {
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(11);
            root.left.left = new TreeNode(7);
            root.right = new TreeNode(9);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(8);
    
            System.out.print("Inorder traversal before insertion: ");
            inorder(root);
    
            int key = 12;
            insert(root, key);
    
            System.out.println();
            System.out.print("Inorder traversal after insertion: ");
            inorder(root);
        }
    }
    

