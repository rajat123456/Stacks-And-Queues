/* Problem Statement-> Given a string mathematical expression, return true if redundant brackets are present in the expression. 
Brackets are redundant if there is nothing inside the bracket or more than one pair of brackets are present.

Sample Input 1: ((a + b)) 
Sample Output 1: true
Sample Input 2: (a+b) 
Sample Output 2: false
*/

import java.util.Stack;

public class solution {
	
	public static boolean checkRedundantBrackets(String input) {
		
      Stack<Character>st=new Stack<>();
 
      for(int i=0;i<input.length();i++)
      {
        if(input.charAt(i)=='(' && input.charAt(i+1)==')')
          return true;
        
        if(input.charAt(i)=='(' && input.charAt(i+1)=='(')
          st.push(input.charAt(i));
          
          else if(input.charAt(i)==')' && input.charAt(i-1)==')' && st.size()>0)
            return true;
        
      }
      return false;
  }
}
