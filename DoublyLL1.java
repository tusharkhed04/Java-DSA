public class DoublyLL1 {
    
    Node head;
        class Node{
            int data;
            Node next , prev ;

            Node(int data){
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        // Add to head

        public void insertAtHead(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

        // Add to tail giving head
        public void insertAtTail(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
            newNode.prev = currNode;
        }

        // Insert at index giving index
        public void insertAtIndex(int index, int data){
            Node newNode = new Node(data);
            Node currNode = head;
            for(int i = 0; i < index -1; i++){
                currNode = currNode.next;
            }

            currNode.next.prev = newNode;
            newNode.prev = currNode;
            newNode.next = currNode.next;
            currNode.next = newNode;
        }

        // Delete node from head
        public void deleteHead(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            head = head.next;
            head.prev = null;
        }

        // Delete node from tail 
        public void deleteTail(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode = currNode.prev;
            currNode.next = null;
        }

        // Delete node from index
        public void deleteAtIndex(int index){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            Node currNode = head;
            for(int i = 0; i < index-1; i++){
                currNode = currNode.next;
            }

            currNode.next = currNode.next.next;
            currNode.next.prev = currNode;
        }


        // Printing list
        public void displayList(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }

            System.out.println("null");
        }

    public static void main(String[] args) {
       DoublyLL1 list = new DoublyLL1();

       list.insertAtHead(30);
       list.insertAtHead(45);
       list.insertAtHead(20);
       list.displayList();
       list.insertAtIndex(1, 90);
       list.displayList();
      list.deleteAtIndex(1);
      list.displayList();
       
    }
}
