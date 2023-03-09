import java.util.*;

public class LinkedListWithoutInbuiltFunctions {
    Node head,tail;
    
    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
        }
    }
    
    void insertElement (int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            tail=newNode;
            //tail.next=newNode;
        }
        else{
            tail.next=newNode;
            tail = newNode;
            //tail.next = head;
        }
    }

    void displayElements(){
        Node n1 = head;
        if(tail == null && head ==null){
            System.out.println("linked list is empty");
        }
        else{
            do {
                System.out.println(n1.data);
                n1=n1.next;
            }while(n1!=null);
        }
    }

    void deleteElements(){
        
    }

    public static void main(String[] args) {
        LinkedListWithoutInbuiltFunctions lk =new LinkedListWithoutInbuiltFunctions();
        lk.insertElement(2);
        lk.insertElement(4);
        lk.insertElement(9);
        lk.insertElement(8);

        lk.displayElements();
    }
}
