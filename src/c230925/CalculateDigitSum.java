package c230925;

import java.util.Scanner;

public class CalculateDigitSum {
	
	public static void calculateDigitSum(int num) {
		if (num <= 0) {
	        System.out.println("양의 정수를 입력해줘~~");
	        return;
	    }

	    int sum = 0;
	    while (num > 0) {
	        int digit = num % 10; 
	        sum += digit;
	        num /= 10; 
	    }

	    System.out.println("각 자릿수의 합 : " + sum);
	}
		
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int inputInt = num; 
	    calculateDigitSum(inputInt);
		
	}

}