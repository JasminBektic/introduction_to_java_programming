package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a method that converts an infix expression into a postfix expression using the following header: 
	 * public static String infixToPostfix(String expression). For example, the method should convert the infix 
	 * expression (1 + 2) * 3 to 1 2 + 3 * and 2 * (1 + 3) to 2 1 3 + *.
	 */

import java.util.Stack;

public class Exercise20_16 {

	public static void main(String[] args) {
		System.out.println(infixToPostfix("(1 + 2) * 3"));
		System.out.println(infixToPostfix("2 * (1 + 3)"));
	}
	
	/** Method used to transform infix to postfix expression */
	public static String infixToPostfix(String exp) {
		Stack<String> operandStack = new Stack<>();
		Stack<String> operatorStack = new Stack<>();
		
		//Add whitespace around every character
		String newExp = "";
		for (int i = 0; i < exp.length(); i++) {
			newExp += exp.charAt(i) + " ";
		}
		String[] str = newExp.split("\\s+");
		String postfix = "";
		String symbol = "()+-*/";
		operatorStack.push(")");
		
		//Store operands and operators in two stacks
		for (String s : str) {
			if (symbol.contains(s)) {
				if ("+-*/".contains(operatorStack.peek()) && s.equals("(")) {
					postfix += operatorStack.pop();
				} else if (!s.equals("(")) {
					operatorStack.push(s);
				}
			}
			if (Character.isDigit(s.charAt(0))) {
				operandStack.push(s);
			}
		}
		
		//Fill string from stack elements
		while (Math.max(operandStack.size(), operatorStack.size()) > 0) {
			if (!operatorStack.isEmpty()) {
				if (operatorStack.peek().equals(")")) {
					operatorStack.pop();
					continue;
				} else {
					postfix = operatorStack.pop() + " " + postfix;
				} 
			}
			if (!operandStack.isEmpty()) {
				postfix = operandStack.pop() + " " + postfix;
			}
		}
		return postfix;
	}
}