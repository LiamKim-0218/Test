package c230925;

public class FindCharIndex {
	public static int findCharIndex(String str, char targetChar) {
		for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		
	
		String str = "Hello, World";
	    char targetChar = 'o';
	    int startIndex = findCharIndex(str, targetChar);
	    
	    if (startIndex != -1) {
	        System.out.println("문자열 " + str + " 에서 '" + targetChar + "' 의 시작 인덱스 : " + startIndex);
	    } 
	    else {
	        System.out.println("'" + targetChar + "'를 찾을 수 없어~!~!");
	    }
	}
}