class linkedList{
    class Node{
        Node next;
        int data;


        Node(int data){
            this.next = null;
            this.data = data;
        }      
    }

    Node head;
    Node tail;

    public void addFront(int value){
        Node node = new Node(values);
            if ( head == null){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
        }
    }

    public void deletefront(){
        if(head == null){
            System.out.println("the list is empty");
        }

        head = head.next;
    }

    public void addback(int value){
        Node node = new Node();
        if(head == null){
            head = tail = node;
        }else{
            tail.next  = node;
            tail = node;
        }
    }

    public void deleteBack(){
        Node current = head;

        while(current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    Node getbackitem(){
        return tail;
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

    public void removenode(int value){
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == value){
                temp.next = null;
                temp.next = temp.next;
            }

            temp = temp.next;
        }
    }

    public void addkeyBefore(int value,int target){
                

    public statc void main(String args[]){
        linkedList ll = new linkedList(); 
    }
}
