public class Insertion_In_Doubly {
    // In Singly linked List 
    // we used t.next = head
    // t is the new element
    // and then head = t;

/*
 * Return head if the head might change (InsertAtHead).

Don't return head if the head remains unchanged (InsertAtTail).

Return tail only if tail management is necessary.
 */
    public static class Node{
        int data;
        Node next ;//null
        Node prev;//null
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node InsertAtHead(Node head,int x){
        Node t = new Node (x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void InsertAtTail(Node head , int x){
        Node temp = head ; // temp head
        while(temp.next!=null){//if we write only temp 
            // temp null tk chla jayega but i want it to go till tail
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void InsertAtIdx(Node head , int idx , int x){
        Node temp = head;
        for(int i=1 ;i<=idx-1;i++){
            temp=temp.next;
        }
        Node t = new Node(x);
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
    }
    public static Node DeleteAtIdx(Node head , int idx){
        if(idx==0){
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Node temp =head;
        for(int i=1 ;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b; // a pointing b
        b.prev = a; // b ponting a 
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        Node newHead = InsertAtHead(a,35); //a is the head
        display(newHead);
        InsertAtTail(a,90);
        display(a);
        InsertAtIdx(a, 3, 65);
        display(a);
        DeleteAtIdx(a, 0);
        display(a);
    }
}
