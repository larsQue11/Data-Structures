// Name:          <William Stone>
// Class:         CS 5040
// Term:          Summer 2018
// Instructor:    Dr. Haddad
// Assignment:    1

//This is to test class LinkedList_WilliamStone. Create and print out a simple list

public class myTest_WilliamStone
    {
    public static void main(String[] args)
        {
        LinkedList_WilliamStone myList = new LinkedList_WilliamStone(); //create a list object

        for (int i = 1; i <= 5; i++) //add 5 nodes to the list
            {
            myList.addLastNode(i);
            }

        //print out the list contents
        System.out.println("My test list values are:  ");
        myList.printList();

        //testing the addFirstNode method by inserting 88
        myList.addFirstNode(88);
        System.out.println("After inserting 88 to the front of the list, the new list is: ");
        myList.printList();

        //testing the removeFirstNode method by removing 88
        myList.removeFirstNode();
        System.out.println("After removing the first node, the new list is: ");
        myList.printList();

        //testing the removeLastNode method
        myList.removeLastNode();
        System.out.println("After removing the last node in the list, the new list is: ");
        myList.printList();

        myList.addLastNode(5);

        //testing the addAtIndex method by inserting 88 into index 3
        myList.addAtIndex(3, 88);
        System.out.println("After inserting 88 into index 3, the list is: ");
        myList.printList();

        //testing the removeAtIndex method by removing 88 from index 3
        myList.removeAtIndex(3);
        System.out.println("After removing the node located at index 3, the list is:");
        myList.printList();

        //testing the copyList method
        System.out.println("This is a copy of myList: ");
        LinkedList_WilliamStone myListCopy = myList.copyList();
        myListCopy.printList();

        //testing copy of list with one node
        LinkedList_WilliamStone singleNodeList = new LinkedList_WilliamStone();
        singleNodeList.addLastNode(88);
        System.out.println("This is singleNodeList's contents: ");
        singleNodeList.printList();
        LinkedList_WilliamStone copyOfSingleNode = new LinkedList_WilliamStone();
        copyOfSingleNode = singleNodeList.copyList();
        System.out.println("A copy of singleNodeList: ");
        copyOfSingleNode.printList();

        //testing empty list conditions
        LinkedList_WilliamStone emptyList = new LinkedList_WilliamStone();
        emptyList.addLastNode(88);
        System.out.println("Calling addLastNode on emptyList: ");
        emptyList.printList();
        emptyList.removeLastNode();
        System.out.println("After removing added node: ");
        emptyList.printList();
        System.out.println("Calling addFirstNode on emptyList;");
        emptyList.addFirstNode(88);
        emptyList.printList();
        emptyList.removeLastNode();
        System.out.println("Calling addAtIndex: ");
        emptyList.addAtIndex(1, 88);
        emptyList.printList();
        emptyList.removeLastNode();
        System.out.println("Calling removeFirstNode on empty list: ");
        emptyList.removeFirstNode();
        System.out.println("Calling removeLastNode on empty list: ");
        emptyList.removeLastNode();
        System.out.println("Calling removeAtIndex on empty list: ");
        emptyList.removeAtIndex(1);
        System.out.println("Calling copyList on empty list: ");
        emptyList.copyList();
        emptyList.printList();
        }
    }


