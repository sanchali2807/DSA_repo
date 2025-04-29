public class InsertInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

        public static class Linkedlist{
            Node head = null;
            Node tail = null;
            void InsertAtEnd(int val){
                Node temp = new Node(val);//new node
                if(head==null){//if the list is empty
                    head = temp;
                   
                }else{//non empty
                    tail.next = temp;//existing tail now points to temp
                    
                }
                tail = temp;//tail temp pe chla jayega
                }
                void display(){
                    Node temp = head;
                    while(temp!=null){ 
                        System.out.println(temp.data);
                        temp = temp.next;
                    }
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
        }
    
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(5);
        ll.InsertAtEnd(6);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        System.out.println();
        ll.InsertAtEnd(12);
        ll.display();

    }
}
