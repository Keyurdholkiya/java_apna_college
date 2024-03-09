public class ZigZagInLinkList {
    static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node getMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node zigZag(Node head){
        //find middle
        Node middle = getMiddle(head);
        //reverse half part
        Node prev = null;
        Node curr = middle.next;
        middle.next = null;
        Node nextNode;
        while (curr != null){
            nextNode = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = nextNode ;
        }
        Node leftHead = head ;
        Node rightHead = prev;
        Node left ;
        Node right ;
        while (leftHead != null && rightHead != null){
            left = leftHead.next;
            leftHead.next = rightHead;
            right = rightHead.next ;
            rightHead.next = left ;
            leftHead = left ;
            rightHead = right;
        }
        return head;
    }
    public static void main(String []args){
       Node head = new Node(1);
       Node newNode = new Node(11);
        head.next = newNode;
        newNode = new Node(9);
        head.next.next = newNode;
        newNode = new Node(10);
        head.next.next.next = newNode;
        System.out.println();
       Node result = zigZag(head);
        while (result != null){
            System.out.println(result.data);
            result = result.next;
        }
    }
}
