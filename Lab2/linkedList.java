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
        Node node = new Node(value);
            if ( head == null){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
    }
    

    public void deletefront(){
        if(head == null){
            System.out.println("the list is empty");
            return; 
        }

        head = head.next;
    }

    public void addback(int value){
        Node node = new Node(value);
        if(head == null){
            head = tail = node;
        }else{
            tail.next  = node;
            tail = node;
        }
    }

    public void deleteBack(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return ;
        }
        if(head == tail){
            head = tail = null;
        }

        while(current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    int getbackitem(){
        return tail.data;
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
        if(head.data == value){
            head = head.next;
        }
        if(temp.next == tail){
            tail = null;
            tail = temp;
        }
        while(temp.next != null){
            if(temp.next.data == value){
                
                temp.next = temp.next.next;
            

            if (temp.next == null) {
                tail = temp;
            
            }
            return ;
            }

            temp = temp.next;
        }
    }

    public void addkeyBefore(int value,int target){
        Node node = new Node(value);
            Node current = head;
                if(head == null){
                    head = tail = node;
                    return ;
                }
                if(head.data == value){
                    node.next = head;
                    head = node;
                }

            while(current.next != null){
                if(current.next.data == target){
                    node.next = current.next;
                    current.next = node;
                    return ;
                }
                current = current.next;
            }   
            System.out.println("The targeted value does not found");
    } 

    public void addkeyAfter(int value, int target){
            Node node = new Node(value);
                Node current = head;

                if(head == null){
                    head = tail = node;
                    return;
                }

                while(current != null){
                    if(current.data == target){
                        node.next = current.next;
                        current.next = node;
                        return;
                    }
                    if(current == tail){
                        tail = node;
                    }
                    current = current.next;
                }
    }

        public void display(){
            Node current = head;

            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }

        public static void main(String[] args){

            linkedList ll = new linkedList();

    // Add elements at front
            ll.addFront(10);
            ll.addFront(20);
            ll.addFront(30);

            ll.display()

    // Add elements at back
            ll.addback(40);
            ll.addback(50);

            ll.display();

    // Search
            System.out.println("Search 40: " + ll.search(40));

            System.out.println("Last item: " + ll.getbackitem());

            ll.addkeyBefore(25, 20);

            ll.addkeyAfter(35, 30);

            ll.deletefront();

            ll.deleteBack();

            ll.removenode(40);

            ll.display();
    }
}
