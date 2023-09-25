package c230925;

public class Main {
	public static int count(String inputString, char targetCharacter) {//주어진 문자열에서 특정 문자의 개수를 세는 프로그램을 작성
		 int count = 0;
	        for (int i = 0; i < inputString.length(); i++) {
	            if (inputString.charAt(i) == targetCharacter) {
	                count++;
	            }
	        }
	        return count;
	    }
		
	public static String reverse(String inputString) {//주어진 문자열을 거꾸로 뒤집는 프로그램을 작성
	        StringBuilder reversed = new StringBuilder();
	        for (int i = inputString.length() - 1; i >= 0; i--) {
	            reversed.append(inputString.charAt(i));
	        }
	        return reversed.toString();
	    }
		
	public static String remove(String inputString) {//문자열에서 모든 공백을 제거하는 프로그램을 작성
		
		return inputString.replaceAll(" ", "");
		
	}
	public static String change(String inputString) {//주어진 문저열에서 모든 소문자를 대문자로 바꾸고 대문자는 소문자로 바꾸는 프로그램을 작성
		
		char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
	}
	
	public static void main(String[] args) {
		String inputString = "applE aPple   aLphA";
		char targetCharacter = 'l';
		int count = count(inputString, targetCharacter);
		
	    System.out.println("문자 '" + targetCharacter + "'의 개수: " + count);
		
	    System.out.println("문자열 거꾸로 뒤집기 : " +reverse(inputString));
	    
	    System.out.println("문자열에서 모든 공백 제거 : "+ remove(inputString));
	    
	    System.out.println("문자열에서 대/소문자 변경 : "+ change(inputString));
	    
	    
	}
}
