package Recursion;

class SinglyLinkedList<T>
{
    private int currentLength = 0;

    class Node<T>
    {
        T data;
        Node next;
    }

    public Node remove(Node head, int k)
    {

        Node node = head;
        Node current = new Node();
        Node previous = head;

        int count = 0;

        while(count < currentLength){
            if(count == k-1){
                current = previous.next;
                break;
            }
            else{
                previous = previous.next;
                count++;
            }
        }
        previous.next = current.next;
        return node;
    }

    public Node push(Node head, T new_data)
    {
        Node node = new Node();
        node.data = new_data;

        if(head == null){
            return node;
        }
        else {
            node.next = head;
            head = node;
        }

        currentLength++;

        return head;
    }

    public String toString(Node head)
    {
        Node position = head;

        String str = "";
        while(position != null){
            str += position.data + " ";
            position = position.next;
        }

        return str;
    }
}
