package c230925;

import java.util.ArrayList;
import java.util.Scanner;

public class CountWords {
	public static int countWords(String str) {
		
        String[] words = str.split(" ");
        
        return words.length;

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
        int wordCount = countWords(inputString);
        System.out.println("입력된 문자열의 단어 개수 : " + wordCount);

	}
}
