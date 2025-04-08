import java.util.*;


public class singleLinkedList {
    Node head;
    private int size;
   singleLinkedList(){
        this.size =0;
   }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size ++;
        }

    }

    //------------------------------------- Add -First

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //------------------------------------- Add Last
    public void addlast(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null){
            head = newNode;
            return;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next= null;
    }

    //-------------------------------------  Print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    //------------------------------------- Delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }


    //------------------------------------- Delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        
        secondLast.next = null;
    }

    //------------------------------------- Size of list
    public int getSize(){
        return size;
    }


    //------------------------------------- Insert at a index
    public void insertAtIndex(int index, int data){
        if(index > size || index < 0){
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);
        if(head == null || index ==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i= 0; i<size;i++){
            if(i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
        }

        currNode = currNode.next;
    }


    //------------------------------------- Reverse LinkedList
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }

        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            preNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = preNode;
    }

    //-------------------------------------Reverse LinkedList using recurtion
    public Node revRecurtionList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = revRecurtionList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



    //---------------------------------------Using Collection Framework's
   

    public static void main(String[] args) {
        // singleLinkedList list = new singleLinkedList();
        // list.addlast(1);
        // list.addlast(2);
        // list.addlast(3);
        // list.addlast(4);
        // list.printList();
        // list.head = list.revRecurtionList(list.head);
        // list.printList();

        LinkedList<Integer> list  = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        
        
    }
}
