import java.util.LinkedList;

public class InsertAtSTart {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtHead(int value){
            Node temp = new Node(value);
            if(head==null){
               head=temp;   
                tail=temp;
            }else{
                temp.next=head;
                head= temp;
            }
        }void InsertAtEnd(int val){
                Node temp = new Node(val);//new node
                if(head==null){//if the list is empty
                    head = temp;
                    tail = temp;//tail temp pe chla jayega
                   
                }else{//non empty
                    tail.next = temp;//existing tail now points to temp
                    tail = temp;//tail temp pe chla jayega
                }
                
                }
        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                InsertAtEnd(val);
                return;
            }
            else if( idx == 0){
                insertAtHead(val);
                return;
            }
            for(int i=0;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t ;
            if(t.next == null){//update t if added at the end
                tail = t ;
            }
            
        }
        void DeleteAt(int idx){
            Node temp = head;
            for(int i=1 ;i<idx;i++){
                temp=temp.next;//transverse the list till idx
            }
            if(idx==0){
                head=head.next;  // removes the first element         
              }
            temp.next=temp.next.next;
            tail=temp;//so that the tail pointing to the last elemnts move to the second last
            // if (temp.next.next == null) {
            //     tail = temp;
            // }
            

        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void display(){
            Node temp = head ;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        // get element
        int getAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtHead(4);
        l1.display();
        System.out.println();
        l1.insertAtHead(5);
        l1.display();
        System.out.println();
        l1.insertAtHead(7);
        l1.display(); 
        
        System.out.println();
        l1.insertAt(2,10);
        l1.display();
        System.out.println();
        System.out.println(l1.tail.data);
        //but even after inserting 10 at very end we get 4 as tail
        System.out.println();
        l1.insertAt(0,11);
        l1.display();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println();
        System.out.println(l1.getAt(0));//index is being passed

        System.out.println();
        l1.DeleteAt(0);
        l1.display();
        System.out.println();
        System.out.println(l1.tail.data);
    }
}


// insert at any given index