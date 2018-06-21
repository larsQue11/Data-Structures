// Name:          <William Stone>
// Class:         CS 5040
// Term:          Summer 2018
// Instructor:    Dr. Haddad
// Assignment:    2

//Ths stack class is an object containing a stack of nodes of data type String
public class Stack_WilliamStone
    {
    private Node head, tail;
    private int size;

    //constructor to initialize a new stack
    public Stack_WilliamStone()
        {
        head = null;
        tail = null;
        size = 0;
        }

    //this method adds a node with the inputted String as its data field
    public void push(String item)
        {
        //Node newNode = new Node(item);  //initialise new node with input String

        if (head == null)  //check for empty list
            head = tail = new Node(item);
        else
            {
//            tail.next = new Node(" ");
//            tail = tail.next;
            tail.next = new Node(item); //link new node as last node
            tail = tail.next; //make tail pointer point to new top node
            }
        size++; //increase size of stack by one
        }

    //remove topmost node from stack
    public void pop()
        {
        if (isEmpty())  //check if stack is empty
            System.out.println("Nothing to remove, stack is empty.");
        else if (size == 1)  //only one node to remove, set head and tail to null
            {
            head = tail = null;
            size = 0;
            }
        else
            {
            Node temp = head;
            //use for loop to work through list to the penultimate node
            for (int i = 0; i < (size - 2); i++)
                temp = temp.next;
            tail = temp;  //set tail to the penultimate node and cut off original tail node
            tail.next = null;
            size--;
            }
        }

    //return the data stored in the top node
    public String top()
        {
        if(isEmpty())
            {
            System.out.println("Stack is empty, no top node.");
            return null;
            }
        else if(size == 1)
            return head.data;
        else
            return tail.data;
        }

    //return the size of the stack
    public int size()
        {
        return size;
        }

    //check to see if the stack is empty
    public boolean isEmpty()
        {
        return (size == 0);
        }

    public void printStack()
        {
        if (isEmpty())  //check for empty stack
            System.out.println("Stack is empty.");
        else
            {
            Node temp;
            temp = head;
            while (temp != null)
                {
                System.out.print(temp.data);
                temp = temp.next;
                }
            System.out.println();
            }
        }

    //class
    public class Node
        {
        //private int data;  //data field
        private String data;
        private Node next; //link field

//        public Node(int item) //constructor method
//            {
//            data = item;
//            next = null;
//            }
        public Node(String inputString)
            {
            data = inputString;
            next = null;
            }
        }


    }
