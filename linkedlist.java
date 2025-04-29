public class linkedlist {
    public static void insertAtEnd(Node head ,int val){
        Node temp =new Node(val);
        Node t = head;
       while(t.next!=null){ //t.next is null means it is tail
        t = t.next;//t is at the tail
       }
       t.next = temp;//now the next of tail 
    }
    public static void Display(Node head) {
        if(head==null)return;
        System.out.println(head.data);
        Display(head.next);
    }
    public static void Display_reverse(Node head) {
        if(head==null)return;
        Display(head.next);
        System.out.println(head.data);
    }
    public static int LengthOf(Node head) {
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;//value
        Node next;//next have the address of the next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node x1 = new Node(5);
       // System.out.println(x1.next);
        Node x2 = new Node(15);
        Node x3 = new Node(2);
        Node x4 = new Node(3);
        Node x5 = new Node(9);
        Node x6 = new Node(10);
        // created nodes but are not linked together
        // linked like 5 -> 15 -> 2 etc
       /*
         x1.next = x2;
        System.out.println(x1);//linkedlist$Node@2a139a55
        System.out.println(x1.next) ;//linkedlist$Node@15db9742
        //linkedlist$Node@2a139a55
        System.out.println(x2);//linkedlist$Node@15db9742
        System.out.println(x3);//linkedlist$Node@6d06d69c


        x1.next = x2;
        System.out.println(x2.data);
        System.out.println(x1.next.data);
        // printing value of b using a as a is linked to b
*/
          
x1.next = x2;
x2.next = x3;
x3.next = x4;
x4.next = x5;
x5.next = x6;
//System.out.println(x1.data);
//System.out.println(x1.next.next.data);
Node temp = x1; // this means temp points at a
//if we make an object it will make a new node
// for(int i=1;i<7;i++){
//     System.out.println(temp.data);
//     temp=temp.next;
// } 

// while(temp!=null){
//     System.out.println(temp.data);
//     temp=temp.next;
// }
Display(temp);
System.out.println();
Display_reverse(temp);
System.out.println();
System.out.println(LengthOf(temp));
System.out.println();
insertAtEnd(x1,87);
Display(x1);

    }
}



/* Copy Of the List
  static Node copyList(Node head) {
    if(head == null)return null;
    Node temp = new Node (head.data);// copies the first element
    Node orig = head.next;//orig points to the sec element
    Node newnum = temp; // now newnum points at the first elemnt
    while(orig!=null){
        newnum.next = new Node (orig.data);//creating a new list containing elements of the original list
        //newnum.next points to the second position
        newnum = newnum.next;
        orig = orig.next;
    }
  return temp;
  
}
 */