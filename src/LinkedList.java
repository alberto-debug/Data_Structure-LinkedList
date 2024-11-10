class LinkedList {

    Node head; // first node

    // insert elements into
    public void insert (int x) {

// create an object of class Node
        Node newnode = new Node();
        newnode.data = x;
        newnode.next = null;
        if (head == null) {
            head = newnode;}
        else
        {
            Node n = head;
            while (n.next !=null)
            {
                n = n.next; //move to the next node
            }
            n.next = newnode; // inserted our node at the end
        }
    }

    // insert node at the start
    public void insertAtStart(int z)
    {Node g = new Node();
        g.data =z;
        g.next = head;// pointing to the current head node
        head =g;
    }


    // inserting at a specific position
    public void insertAtIndex(int pos, int p)
    {
        Node newnode = new Node ();//create new node
        newnode.data =p; // assign data to new node
//node at pos-1 to point to new node
        Node k = head;
        for (int i =0; i<pos-1; i++)
        {
            k =k.next; }
        newnode.next =k.next; // rest remains
//new node to point to node at pos+1
        k.next = newnode;
    }


    // traversal method
    public void traverse () {
        Node y = head;
        while (y.next !=null) {
            System.out.println (y.data);
            y = y.next; // move to the next node
        }
        System.out.println("Tail node: "+ y.data);
    }


    // delete a node at index position
    public void deleteAtIndext(int pos)
    {
        Node x = head;
        Node b =  null; // node am deleting
        if (pos == 0)
        {head = head.next;}
        else
        {
            for ( int r =0; r<pos-1; r++)
            {
                x =x.next;
            }
            b =x. next;
            x.next = b.next;
            System.out.println("The node to be deleted ="+ b.data);
        }
    }


}
