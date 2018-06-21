// Name:          <William Stone>
// Class:         CS 5040
// Term:          Summer 2018
// Instructor:    Dr. Haddad
// Assignment:    2

//this class contains methods to convert an entered string to a stack of individual nodes
//containing each word of the string and reversing it word-for-word
public class ReverseString_WilliamStone extends Stack_WilliamStone
    {
    private String str;
    private Node head, tail;
    public Stack_WilliamStone reversedStack = new Stack_WilliamStone();
    public Stack_WilliamStone myStringStack = new Stack_WilliamStone();

    public ReverseString_WilliamStone()
        {
        head = null;
        tail = null;
        }

    //method to transfer string from user input into a stack
    //the String is broken into segments beginning with the first letter in the
    public void stringToStack(String str)
        {
        if(str.length() == 1)
            {
            Node newNode = new Node(str);
            head = tail = newNode;
            }
        else
            {
            int startOfString = 0;
            for(int i = 0; i < str.length(); i++)  //iterate through string to create nodes
                {
                //if the character is a space, then store the string up to here into a new node
                if(Character.isWhitespace(str.charAt(i)))
                    {
                    String tempString = str.substring(startOfString,i);
                    myStringStack.push(tempString);
                    myStringStack.push(" ");
                    startOfString = i+1;
                    }
                //if we reach the end of the string, push that substring
                if ((i + 1) == str.length())
                    {
                    String tempString = str.substring(startOfString,i+1);
                    myStringStack.push(tempString);
                    }
                }
            }
        }

    public void reverseAStack()
        {
        while(!myStringStack.isEmpty())
            {
            reversedStack.push(myStringStack.top());
            myStringStack.pop();
            }
        //return reversedStack;
        }
    }
