// Name:          <William Stone>
// Class:         CS 5040
// Term:          Summer 2018
// Instructor:    Dr. Haddad
// Assignment:    2


//this is the Driver class for Assignment 2
import java.util.Scanner;

public class TestStack_WilliamStone
    {
    public static void main(String[] args)
        {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter the desired string: ");
        String original = user_input.nextLine();
        ReverseString_WilliamStone aStackOfStrings = new ReverseString_WilliamStone();
        aStackOfStrings.stringToStack(original);
        System.out.print("This is your new stack containing the string entered: ");
        aStackOfStrings.myStringStack.printStack();

        while(true)
            {
            System.out.print("Please choose push or pop to test, or type exit for neither: [push/pop/exit] ");
            String testPushPop = user_input.nextLine();
            if (testPushPop.toUpperCase().equals("PUSH"))
                //testing the push method from the Stack class
                {
                while (true)
                    {
                    System.out.print("Would you like to add to the stack? [Y/N] ");
                    String condition = user_input.nextLine();
                    if (condition.toUpperCase().equals("Y"))
                        {
                        System.out.print("You answered yes, please enter your desired string: ");
                        String addToStack = user_input.nextLine();
                        aStackOfStrings.myStringStack.push(" ");
                        aStackOfStrings.myStringStack.push(addToStack);
                        System.out.print("Your new stack: ");
                        aStackOfStrings.myStringStack.printStack();
                        }
                    else if (condition.toUpperCase().equals("N"))  //exit the loop
                        {
                        System.out.println("You chose to not push any more nodes to your stack.");
                        break;
                        }
                    else
                        System.out.println("Invalid input, please follow directions.");
                    }
                break;
                }

            if (testPushPop.toUpperCase().equals("POP"))
                //testing the pop method from the Stack class
                {
                while (!aStackOfStrings.myStringStack.isEmpty())  //can't pop an empty stack
                    {
                    System.out.print("Would you like to pop the top node from the stack? [Y/N] ");
                    String condition = user_input.nextLine();
                    if (condition.toUpperCase().equals("Y"))
                        {
                        System.out.println("You answered yes");
                        if(aStackOfStrings.myStringStack.top().equals(" "))  //pop an extra node if the top node is a blank string
                            {
                            aStackOfStrings.myStringStack.pop();
                            }
                        aStackOfStrings.myStringStack.pop();
                        System.out.print("Your new stack: ");
                        aStackOfStrings.myStringStack.printStack();
                        }
                    else if (condition.toUpperCase().equals("N"))  //exit the loop
                        {
                        System.out.println("You chose to not pop a node from your stack.");
                        break;
                        }
                    else
                        System.out.println("Invalid input, please follow directions.");
                    }
                break;
                }

            if (testPushPop.toUpperCase().equals("EXIT"))
                {
                System.out.println("You chose not to test push or pop.");
                break;
                }

            else
                System.out.println("Invalid input, please follow directions.");
            }

        //prompt user to test stack reversal
        while(true)
            {
            System.out.print("Would you like to reverse your string? [Y/N] ");
            String condition = user_input.nextLine();
            if (condition.toUpperCase().equals("Y"))  //reverse the stack, print it, exit the loop
                {
                System.out.println("You answered yes");
                aStackOfStrings.reverseAStack();
                System.out.print("Your new stack: ");
                aStackOfStrings.reversedStack.printStack();
                break;
                }
            else if (condition.toUpperCase().equals("N")) //exit the loop
                {
                System.out.println("You chose not to reverse your stack.");
                break;
                }
            else
                System.out.println("Invalid input, please follow directions.");
            }

        //check the validity of an input expression
        while(true)
            {
            CheckParentheses_WilliamStone ckPar = new CheckParentheses_WilliamStone();
            System.out.print("Please enter an equation to determine its validity: [exit] ");
            String newCheck = user_input.nextLine();
            if(newCheck.toUpperCase().equals("EXIT"))
                break;
            System.out.println("Input Expression: " + newCheck);
            ckPar.checkParenthesisFxn(newCheck);
            }

//        Stack_WilliamStone myStack = new Stack_WilliamStone();
//
//        //testing empty stack conditions
//        System.out.println("If stack is empty, return true: " + myStack.isEmpty());
//        System.out.println("Data stored in the top node: [" + myStack.top() + "]");
//        System.out.println("The current size of the stack: " + myStack.size());
//        System.out.println("Test pop() on empty stack: ");
//        myStack.pop();
//
//        //add five nodes to stack
//        for(int i = 1; i <= 5; i++)
//            myStack.push("test"+i);
//        System.out.println("The current contents of the stack are: ");
//        myStack.printStack();
 //
//
//        System.out.println("If stack is empty, return true: " + myStack.isEmpty());
//        System.out.println("Data stored in the top node: [" + myStack.top() + "]");
//        System.out.println("The current size of the stack: " + myStack.size());
//
//        myStack.pop();
//        System.out.println("myStack after popping off the top node: ");
//        myStack.printStack();

//        Scanner user_input = new Scanner(System.in);
//        System.out.print("Please enter the desired string: ");
//        String original = user_input.nextLine();
//        System.out.println("You entered: " + original);

//        ReverseString_WilliamStone testStringStack = new ReverseString_WilliamStone();
//        testStringStack.stringToStack(original);
//        testStringStack.printStack();
//        //testStringStack.push("test");
//        System.out.println("top: " + testStringStack.top());
//        testStringStack.printStack();
//        testStringStack.reverseAStack(testStringStack);
//        testStringStack.printStack();
//        testStringStack.reversedStack.printStack();
        }
    }
