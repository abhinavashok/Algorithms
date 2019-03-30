class SingleLinkedList<T>{
    private Node head = null;

    private class Node{
        T item;
        Node next;
    }
    
    private Node createNewNode(T item) {
        Node node = new Node();
        node.item = item;
        node.next = null;

        return node;
    }
    /**
     * This method inserts the inserted item at the end of the linked list if the linked list is not empty.
     * Else it assigns the new item as the head.
     * 
     * @param item
     */
    public void insert(T item){
        Node newNode = createNewNode(item);
        
        //there is no head so make this item as head.
        if(head == null){
            head = newNode;
            return;
        }

        Node cur = head;
        while(cur.next !=null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public void printList(){
        Node cur = head;

        if(cur == null){
            System.out.println("list is empty");
            return;
        }

        while(cur!=null){
            System.out.print(cur.item+"-->");
            cur = cur.next;
        }
        System.out.println("null");
    }



}