package com.intr.datastructure;

public class TestStack {

	public static void main(String[] args) {
		// Auto-generated method stub
		String inputExpr = new String("()[]{}");//"{(})");//"()");
		char[] charArray = inputExpr.toCharArray();
		Stack exprStack = new Stack(charArray.length);
		
		System.out.println(exprStackValidate(inputExpr, charArray, exprStack));
		
		
	}

	public static boolean exprStackValidate(String inputExpr, char[] charArray, Stack exprStack) {
		for(int i =0; i<= charArray.length-1; i++) {
			char charAt = inputExpr.charAt(i);
			char check;
			if (charAt =='(' || charAt == '{' || charAt == '[' ) {
				exprStack.push(charAt);
				continue;
			}
			else if (charAt ==')') {
				check = exprStack.pop();
                if (check == '{' || check == '[')
                    return false;               
			}else if (charAt =='}') {
				check = exprStack.pop();
                if (check == '(' || check == '[')
                    return false;               
			}
			else if (charAt ==']') {
				check = exprStack.pop();
                if (check == '(' || check == '{')
                    return false;               
			}
		}
		return true;
	}

}
