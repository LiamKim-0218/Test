package c230925;

import java.util.Scanner;

public class IsPrime {
	public static boolean isPrime(int num) {
	
		for(int i=2; i<num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수판별기!!! 아무 숫자나 쳐봐~");
		int num = scanner.nextInt();
		if(isPrime(num)==true) {
			System.out.println(num+" <- 이 숫자는 소수야!!");
		}
		else {
			System.out.println(num+" <- 이 숫자는 소수가 아니야!!");
		}
		
	}
}
