package com.intr.datastructure;

public class Stack {
	private char  chArray[];
	private int top;
	private int size;
	
	public Stack(int size) {
		chArray = new char[size];
		this.size = size;
	}
	
	public boolean push(char c) {
		if (top == size-1) {
			System.out.println("stack is full");
			return false;
		}
		chArray[++top] = c;
		System.out.println("pushed : "+c);
		return true; 			
	}
	
	public char  pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return '~'; // char to indicate empty stack
		}
		System.out.println("removed : "+chArray[top]);
		return chArray[top];
	}
	
//	input : s = "()"
//	output = true
//	input : s = "{(})"
//	output = false
//	input : s = "()[]{}"
//	output = true
	
	
	
}
