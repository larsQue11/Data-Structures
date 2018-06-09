// Name:          <William Stone>
// Class:         CS 5040
// Term:          Summer 2018
// Instructor:    Dr. Haddad
// Assignment:    1

// This class defines a linked list that stores integer values.

public class LinkedList
    {
    private Node head, tail;
    private int size;

    //constructor method to create a list object with head, tail, and size.
    public LinkedList()
        {
        head = null;  // list head pointer
        tail = null;  // list tail pointer
        size = 0;     // list size
        }

    //method to add a node to the end of list
    public void addLastNode(int data)
        {
        if (tail == null)
            head = tail = new Node(data); //empty list
        else
            {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to new last node
            }
        size++; //increase list size by one
        }


    //================= your part to complete for assignment 1 =============

    //method to add a new node as the first node in the list
    public void addFirstNode(int data)
        {
        Node newNode = new Node(data);  //creates new node
        newNode.next = head;  //link new node as first in the list
        head = newNode;  //point head to the new node
        size++;  //increase size of link list by 1

        //check if the list is empty, if so, point the tail to the head
        if (tail == null)
            tail = head;
        }

    //method to add a node at specific position, namely index
    public void addAtIndex(int index, int data)
        {
        if(index < 0)
            System.out.println("Invalid index.");

        //if the index is 0, call addFirstNode
        if(index == 0)
            addFirstNode(data);
        //if the index is not within the current range, call addLastNode
        else if (index >= size)
            addLastNode(data);
        else
            {
            Node current = head;
            Node temp = head.next;
            for (int i = 1; i < index; i++)
                {
                current = current.next;
                temp = temp.next;
                }
            current.next = new Node(data);
            (current.next).next = temp;
            size++;
            }
        }

    //method to remove the first node from the list
    public void removeFirstNode()
        {
        //check to see if list is empty
        if(size == 0)
            System.out.println("Nothing to remove, the current list is empty.");

        else
            {
            head = head.next;  //head now points to the second node
            size--;  //decrease the size of the node by 1
            //check to see if the deleted node was the only node in the list
            if(head == null)
                {
                tail = null;
                System.out.println("The removed node was the only node in the list.");
                }
            }
        }

    //method to remove the last node from the list
    public void removeLastNode()
        {
        if(size == 0)
            System.out.println("Nothing to remove, list is empty.");
        else if (size == 1)  //only one node to remove, set head and tail to null
            {
            head = tail = null;
            size = 0;
            }
        else
            {
            Node current = head;
            //use for loop to work through list to penultimate node
            for(int i = 0; i < (size - 2); i++)
                current = current.next;
            tail = current;
            tail.next = null;
            size--;
            }
        }

    //method to remove a node at specific position,namley index
    public void removeAtIndex(int index)
        {
        if(index < 0 || index >= size)  //avoid passing an invalid index
            System.out.println("Invalid index.");
        if (size == 0)
            System.out.println("List is empty.");
        else if (index == 0)
            removeFirstNode();
        else if (index == (size - 1))  //if the desired index is the last in the range
            removeLastNode();
        else
            {
            Node previous = head;
            for(int i = 1; i < index; i++)  //move to the node located just before the desired deletion
                previous = previous.next;
            Node toBeDeleted = previous.next;
            previous.next = toBeDeleted.next;
            size--;
            }
        }

    //method to create a copy of the list
    public LinkedList copyList() {
    //This method returns a pointer to the new list, List2

    LinkedList List2 = new LinkedList();  //create new LinkedList object
    Node head2, tail2;
    int size2 = 0;
    if(size == 0)
        return List2;
    else if (size == 1)
        {
        List2.addLastNode(head.data);
        head2 = tail2 = head;
        size2++;
        return List2;
        }
    else
        {
        Node copyHead = new Node(head.data);  //create new head for List2
        head2 = tail2 = copyHead;
        List2.addLastNode(copyHead.data);  //add head node to List2
        size2++;
        Node temp = head.next;  //create temporary node to establish the rest of the list
        while(size2 < size)  //loop through until all nodes are copied, use less than condition because size is post-decremented
            {
            List2.addLastNode(temp.data);  //call addLastNode to add the current node to List2
            size2++;
            temp = temp.next;  //iterate to the next position
            }
        size2++;
        tail2 = temp;  //point List2's tail to temp which is the last node added
        return List2;
        }
    }


    //================= end of your part for assignment 1 ==============

    //method to print out the list
    public void printList()
        {
        if (head == null)  // if an empty list
            System.out.println("List is empty...");
        else               // if non-empty list
            {
            Node temp;
            temp = head;
            while (temp != null)
                {
                System.out.print(temp.data + "   ");
                temp = temp.next;
                }
            System.out.println();
            }
        }

    //class to create nodes of the list as objects
    private class Node
        {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
        data = item;
        next = null;
        }
        }
    }
