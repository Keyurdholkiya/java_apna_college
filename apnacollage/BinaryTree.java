import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
//    public static void prints(Node root){
//        if (root == null){
//            return;
//        }
//        System.out.println(root.data);
//        prints(root.left);
//        prints(root.right);
//    }
//    public static int prints(Node head){
//
//    }
    public static void main(String []args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        //prints(root);
    }
}
