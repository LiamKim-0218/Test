package c230925;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		boolean b = true;
	
		while(b) {
			int playscore = 10;
			int myturn = 0;
			System.out.printf("UP DOWN 게임!!!\n");
			System.out.printf("0~999중 아무 숫자나 누르고 enter를 쳐줭!!\n");
			System.out.printf("10번의 기회가 있오!!\n");
			System.out.printf("숫자를 입력해줘~~\n");
			
			int random = (int)(Math.random()*999);
//			System.out.println(random)
			while(myturn<playscore) {
				int num = scanner.nextInt();
	            
				 System.out.println("남은 기회 " + (playscore - (myturn +1)));
            
            if (num < random) {
                System.out.println("입력한 숫자보다 정답이 더 커!!");
                System.out.println("숫자를 입력하세요 : ");
            } else if (num > random) {
                System.out.println("입력한 숫자보다 정답이 더 작아!!");
                System.out.println("숫자를 입력하세요 : ");
            } else {
                System.out.println("정답입니다! 고생했오~~~");
                break;
            }
            
            myturn++;
			}
        if (myturn == playscore) {
            System.out.println("게임 오버! 정답은 " + random + " 이여쏘~~");
        }
        
        System.out.print("게임을 다시 할거얌?? (yes/no) : ");
        String playAgainInput = scanner.next();
        b = playAgainInput.equals("yes");
    }
    
    System.out.println("게임 끝~~!~~! ");
	}
}	
	