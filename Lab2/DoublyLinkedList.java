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
                return -1;
            }
            current = current.next;
        }
        if(target != current.data){
            System.out.println("Node does not found!");
        }
        return 0;
    }

    public void addkeyAfter(int value, int target){
        Node node = new Node(value);
        Node current = head;
        while(current != null){
            if(current.data == target){
                node.next = current.next;
                node.prev = current;
                current.next = node;
                
                if(current == tail){
                    node = tail.next;
                    node.prev = tail;
                    tail = node;
                    tail.next = null;
                    return ;
                }
                return ;
            }
        }
    }

    public void addkeyBefore(int value, int target){
        Node node = new Node(value);
        Node current = head;
        if(head.data == target){
            node.next = head;
            head.prev = node;
            head = node;
            return ;
        }

        while(current != null){
            if(current.data == target){
                node.prev = current.prev ;
                current.prev.next = node;
                node.next = current;
                current.prev = node;    
                return;
            }
            current = current.next;
        }
        
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
        DoublyLinkedList dl = new DoublyLinkedList();
            dl.addFront(3);
            dl.addFront(5);
            dl.addFront(7);
            dl.addFront(11);
            dl.addFront(13);
            dl.addFront(17);
            System.out.println("LinkedList Values");
            dl.display();

            dl.deletefront();
            System.out.println();
            System.out.println("LinkedList Values deleteFront");
            dl.display();

            dl.addback(5);
            dl.addback(35);
            dl.addback(33);
            dl.addback(21);
            dl.addback(77);
            System.out.println();
            System.out.println("LinkedList Values addBack");
            dl.display();

            dl.deleteBack();
            System.out.println();
            System.out.println("LinkedList Values deleteBack");
            dl.display();

            dl.addkeyAfter(17, 33);
            System.out.println();
            System.out.println("LinkedList Values addafter 33 to 17");
            dl.display();

            dl.addkeyBefore(17, 33);
            System.out.println();
            System.out.println("LinkedList Values addkeyBefore 33 to 17");
            dl.display();

            System.out.println();
            System.out.println("search Node " + dl.search(5));

            dl.removenode(17);
            System.out.println();
            System.out.println("LinkedList Values removenode  17");
            dl.display();
        

    }


    
}