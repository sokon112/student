package ch13;

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("사과");
		stack.push("딸기");
		stack.push("바나나");
		stack.push("수박");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
