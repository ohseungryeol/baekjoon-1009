import java.util.Scanner;

public class Baek1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("테스트 개수를 입력하세요:");
		int testNum = in.nextInt();
		for (int i=0; i<testNum; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int result =1;
			for (int j=0; j<b; j++) {
				result = (result*a)%10;
			}
			if (result ==0) {
				System.out.println(10);
			} else {
				System.out.println(result);
			}

		}
	}
}


