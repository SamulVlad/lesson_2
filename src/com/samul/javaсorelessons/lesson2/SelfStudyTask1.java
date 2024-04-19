package com.samul.javaсorelessons.lesson2;

//1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.

public class SelfStudyTask1 {

	public static void main(String[] args) {
		
		double x = 5, y = 7;
		double sum, diff, prod, quot;

		sum = x + y;
		diff = x - y;
		prod = x * y;
		quot = x / y;
		
		System.out.println("sum = " + sum);
		System.out.println("diff = " + diff);
		System.out.println("prod = " + prod);
		System.out.println("quot = " + quot);

	}
}
