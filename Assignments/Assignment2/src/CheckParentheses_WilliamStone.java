// Name:          <William Stone>
// Class:         CS 5040
// Term:          Summer 2018
// Instructor:    Dr. Haddad
// Assignment:    2

//this class contains a method that takes an expression entered as a String and determines its validity
public class CheckParentheses_WilliamStone
    {

    public void checkParenthesisFxn(String expression)
        {
        if (expression == "")
            System.out.println("Judgement: Valid Expression");
        else
            {
            //create two stacks: one for open braces, the other for closed
            Stack_WilliamStone openBraceStack = new Stack_WilliamStone();
            Stack_WilliamStone closedBraceStack = new Stack_WilliamStone();

            //iterate the length of the equation and populate that appropriate stack
            for (int i = 0; i < expression.length(); i++)
                {
                if (expression.charAt(i) == '(')
                    openBraceStack.push(expression.charAt(i) + "");
                if (expression.charAt(i) == ')')
                    closedBraceStack.push(expression.charAt(i) + "");
                if(closedBraceStack.size() > openBraceStack.size())
                    break;
                }

            //compare size of each stack, they must be equal for the expression to be valid
            if (openBraceStack.size() == closedBraceStack.size())
                System.out.println("Judgement: Valid Expression");
            else
                System.out.println("Judgement: Invalid Expression");
            }
        }
    }
