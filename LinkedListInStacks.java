import java.util.Stack;

public class LinkedListInStacks {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }

    }
    public static class Stack{
        Node head = null;
        private int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;\
            size++;
        }
        void displayRec(Node h){
            if(h==null)return;
            displayRec(h.next);
            System.out.print(h.value);
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayrev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value);
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.value;
            head = head.next;
            size--;
            return x;
        }
        int peek(){
            return head.value;
        }
        boolean isEmpty(){
            if(size==0)return true;
            return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();//4 5 1 
        System.out.println(st.size());
        st.pop();
        st.display();//4 5
        System.out.println(st.size());
        st.push(2);
        st.push(8);
        st.push(6);
        st.push(2);
        st.display();
        System.out.println(st.peek());


    }
    
}
