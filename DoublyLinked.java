public class DoublyLinked {
    // head.prev =null;
    // tail.next =null
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
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev; 
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp = random;
        //move this temp backwards to head
        while(temp.prev!=null){
            temp=temp.prev; // now temp is at the head
        }
        // first it will go backward till head then print from there
        //print the list
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next; 
        }
        System.out.println();

    }
    public static void main(String[] args) {
        //4 10 2 99 13
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
        displayrev(e);
        displayRandom(c);


    }
}
