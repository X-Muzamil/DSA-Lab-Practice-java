class DoublyLinkedList{
    class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;


    public void addFront(int value){

        Node node = new Node(value);
        if(head == null){
            head = tail = node;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    public void deletefront(){
        if(head == null){
            System.out.println("the list is empty");
            return ;
        }

        head = head.next;     
    }

    public void addBack(int value){
        Node node = new Node(value);

            if(head == null){
                head = tail = node;
            }

                tail.next = node;
                node.prev = tail;
                tail = node;
                return ;
    }
        
    

    public void deleteBack(){
        Node current = head;

        while(current.next.next != tail){
            current = current.next;
        }

                tail = current.next;
                tail.prev = current;
                return ;
    }

    public boolean search(int value){
        Node current = head;

        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int removeNode(int target){
        Node current = head;
        while(current.next != null){
            if(current.next.data == target){
                current.next = current.next.next;
                return ;
            }
            current = current.next;
        }
        if(target != current.data){
            System.out.println("Node does not found!");
        }
    }

    
    
}