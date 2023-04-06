package com.intr.numericals;

public class IntegerToRoman {

	private static final int[] values = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static final String[] romanLiterals = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static final String integerToRoman2(int number) {

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (number >= values[i]) {
				number -= values[i];
				s.append(romanLiterals[i]);
			}
		}
		return s.toString();
	}
	public static void main(String[] args) {
		//  Auto-generated method stub
		String integerToRoman2 = integerToRoman2(90);
		System.out.println("romamn : "+integerToRoman2);
	}

}
