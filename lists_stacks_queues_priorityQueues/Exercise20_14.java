package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Postfix notation is a way of writing expressions without using parentheses. For example, the expression 
	 * (1 + 2) * 3 would be written as 1 2 + 3 *. A postfix expression is evaluated using a stack. Scan a postfix expression 
	 * from left to right. A variable or constant is pushed into the stack. When an operator is encountered, apply the operator 
	 * with the top two operands in the stack and replace the two operands with the result.
	 * Write a program to evaluate postfix expressions. Pass the expression as a command-line argument in one string.
	 */

import java.util.Stack;

public class Exercise20_14 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		String[] symbol = args[0].split("\\s+");	//Split whitespace
		
		//Determine digit
		int num = 0;
		for (String s : symbol) {
			if (Character.isDigit(s.charAt(0))) {
				num = Integer.valueOf(s);
				if (stack.size() == 0) {
					stack.push(num);
				}
			}
			String operator = "+-*/";
			
			//Determine operator
			if (operator.contains(s)) {
				int n = 0;
				switch (s) {
					case "+": n = stack.pop() + num; stack.push(n); break;
					case "-": n = stack.pop() - num; stack.push(n); break;
					case "*": n = stack.pop() * num; stack.push(n); break;
					case "/": n = stack.pop() / num; stack.push(n); break;
				}
			} 
		}
		//Print final stack
		System.out.println("Stack: " + stack);
	}
}
