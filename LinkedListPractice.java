//Palidrome linked list in doubly linked list

// public class LinkedListPractice {
//     public static class Node{
//         int data;
//         Node next ;//null
//         Node prev;//null
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static void display(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static boolean IsPalidrome(Node head ){
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         Node h = head;
//         Node t = temp; // as temp is now tail
//         while(h!=t){
//             if(h.data != t.data){
//                 return false;
//             }
//             h=h.next;
//             t=t.prev;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Node a = new Node(4);
//         Node b = new Node(10);
//         Node c = new Node(2);
//         Node d = new Node(10);
//         Node e = new Node(4);
//         a.prev = null;
//         a.next = b; // a pointing b
//         b.prev = a; // b ponting a 
//         b.next = c;
//         c.prev = b;
//         c.next = d;
//         d.prev = c;
//         d.next = e;
//         e.prev = d;
//         e.next = null;
//         boolean isPal = IsPalidrome(a);
//         System.out.println(isPal);
//     }
// }


// Two sum in a doubly linked list

// public class LinkedListPractice{
//     public static class Node{
//         int data;
//         Node next ;//null
//         Node prev;//null
//         Node(int data){
//             this.data=data;
//         }
//     }
//         public static void TwoSum(Node head , int k){
//             Node temp = head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             Node h = head;
//             Node t = temp;
//             while(h.data < t.data){
//                 if(h.data+t.data == k){
//                     System.out.println(h.data+","+t.data);
//                     return;
//                 }else if (h.data + t.data > k){
//                     t = t.prev;
//                 }else if(h.data + t.data < k){
//                     h = h.next;
//                 }else{
//                     return;
//                 }
//             }
        
//     }    public static void main(String[] args) {
//         Node a = new Node(1);
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(5);
//         a.prev = null;
//         a.next = b; // a pointing b
//         b.prev = a; // b ponting a 
//         b.next = c;
//         c.prev = b;
//         c.next = d;
//         d.prev = c;
//         d.next = e;
//         e.prev = d;
//         e.next = null;
//         int target = 5;
//         TwoSum(a, target);

//     }
// }


// public class LinkedListPractice{
//     public static class Node{
//         int data;
//         Node next ;//null
//         Node prev;//null
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a = new Node(4);
//         Node b = new Node(10);
//         Node c = new Node(2);
//         Node d = new Node(99);
//         Node e = new Node(13);
//         a.prev = null;
//         a.next = b; // a pointing b
//         b.prev = a; // b ponting a 
//         b.next = c;
//         c.prev = b;
//         c.next = d;
//         d.prev = c;
//         d.next = e;
//         e.prev = d;
//         e.next = null;
// }
// }



public class LinkedListPractice{
    public static class Node{
        int data;//value
        Node next;//next have the address of the next node
        Node(int data){
            this.data = data;
        }
    }
    public static Node Nth_Node(Node head,int idx){
        int size  = 0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int a = size - idx + 1;
        temp = head;// kyunki temp null pe ja chuka tha
        // m th node from start
        for(int i = 1 ; i<= a-1 ;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static Node NthNodeInOneTransversal(Node head , int idx){
        Node slow = head;
        Node fast = head ;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow; 
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        if(head.next==null)return head;
        Node newHead = reverse(head.next);
        head.next.next=head;//interchanging the connection
        head.next=null;
        return newHead;
    }
    
    public static Node removeNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;//f fast becomes null after this loop, it means n is equal to the length of the list.
            if(fast == null){// beacause it means ypou want to remove the first node
                head=head.next;
                return head;
            }
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next; 
        }
       // slow.data = slow.next.data;
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node x1 = new Node(5);
        Node x2 = new Node(15);
        Node x3 = new Node(2);
        Node x4 = new Node(3);
        Node x5 = new Node(9);
        Node x6 = new Node(10);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        // Node temp = Nth_Node(x1,3);
        // System.out.println(temp.data);
        System.out.println();
        Node t = NthNodeInOneTransversal(x1, 3); 
        System.out.println(t.data);
        x1=removeNthFromEnd(x1,6);
        display(x1);
        Node r = reverse(x1);
        display(r);
}
}