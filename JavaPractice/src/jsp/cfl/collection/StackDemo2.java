package jsp.cfl.collection;
import java.util.*;
public class StackDemo2 
{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) 
        {
			String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
		}
		
	}
    static String isBalanced(String s)
    {
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(s.charAt(i));
            }
            else
            {
            	System.out.println(stack);
            	 System.out.println(stack.size());
                if(stack.isEmpty())
                {
                    return "false";
                }
                else
                {
                    char pop_val = stack.pop();
                    System.out.println(stack);
                    System.out.println(stack.size());
                    
                    if(s.charAt(i) == ')' && pop_val != '(')
                    {
                        return "false";
                    }
                    else if(s.charAt(i) == ']' && pop_val != '[')
                    {
                        return "false";
                    }
                    else if(s.charAt(i) == '}' && pop_val != '{')
                    {
                        return "false";
                    }
                }
            }
        }
        if(stack.isEmpty())
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
}
