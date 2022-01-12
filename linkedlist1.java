// Linked List Class
class linkedlist1
{
    Node head;  // head of list

    /* Node Class */
    class Node
    {
        int data;//data part
        Node next;//next node address part
         
        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
}