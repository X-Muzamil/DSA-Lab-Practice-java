class linkedList{
    class Node{
        Node next;
        int data;
        


        Node(int data){
            this.next = null;
            this.data = data;
        }      
    }

    int size = 0;
    Node head;
    Node tail;

    public void addFront(int value){
        Node node = new Node(value);
            if ( head == null){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
                size++;
            }
    }
    

    public void deletefront(){
        if(head == null){
            System.out.println("the list is empty");
            return; 
        }

        head = head.next;
        size--;
    }

    public void addback(int value){
        Node node = new Node(value);
        if(head == null){
            head = tail = node;
        }else{
            tail.next  = node;
            tail = node;
            size++;
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
        size--;
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
                size--;
            if (temp.next == null) {
                tail = temp;
            
            }
            }
            else{
                temp = temp.next;
            }
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
            size++;
    } 

    public void deleteBefore(int target){
        
        if (head == null || head.next == null) {
            System.out.println("Not enough nodes");
            return;
        }

    // Target is at head or second position
        if (head.next.data == target) {
            System.out.println("No node exists before target");
            return;
        }

        Node current = head;
        while(current.next.next != null){
            if(current.next.next.data == target){
                current.next = current.next.next;
                size--;
                return ;
            } 
            current = current.next;
        }
        System.out.println("List does not found");
        
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
                size++;
    }

    int getSize(){
        return size;
    }

    int getindex(int index){
        Node current = head;
        int count = 0;

        if(index < 0 || index >= size){
            System.out.println("Index is out of box!");
            return -1;
        }
        while(current != null){
            if(count == index){
                System.out.println("The node on index - " + index + " - : " + current.data);
            }
            current = current.next;
            count++;
        }
        
        return -1;
    }

    public void ReverseList(){
        Node next = null;
        Node current = head;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current ;
            current = next;
        }
        head = tail;
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
            ll.addFront(3);
            ll.addFront(5);
            ll.addFront(7);
            ll.addFront(11);
            ll.addFront(13);
            ll.addFront(17);
            System.out.println("LinkedList Values");
            ll.display();

            ll.deletefront();
            System.out.println();
            System.out.println("LinkedList Values deleteFront");
            ll.display();

            ll.addback(5);
            ll.addback(35);
            ll.addback(33);
            ll.addback(21);
            ll.addback(77);
            System.out.println();
            System.out.println("LinkedList Values addBack");
            ll.display();

            ll.deleteBack();
            System.out.println();
            System.out.println("LinkedList Values deleteBack");
            ll.display();

            ll.addkeyAfter(17, 33);
            System.out.println();
            System.out.println("LinkedList Values addafter 33 to 17");
            ll.display();

            ll.addkeyBefore(17, 33);
            System.out.println();
            System.out.println("LinkedList Values addkeyBefore 33 to 17");
            ll.display();

            ll.deleteBefore(17);
            System.out.println();
            System.out.println("LinkedList Values deletebefore 33 to 17");
            ll.display();

            ll.removenode(17);
            System.out.println();
            System.out.println("LinkedList Values removenode  17");
            ll.display();
            System.out.println();
            System.out.println("Total number of  linkedlist nodes : " + ll.getSize());
            System.out.println();
            System.out.println(ll.getindex(5));

            System.out.println();
            System.out.println("search Node " + ll.search(5));

            ll.ReverseList();
            System.out.println("Reversed LinkedList ");
            ll.display();

            




    }
}
