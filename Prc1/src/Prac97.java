import java.util.ArrayList;
import java.util.Scanner;

public class Prac97 {

	public static void main(String[] args) {
		/* 1090번 문제
		 * 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
			공백을 두고 입력된다.(모두 0 ~ 10)
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		long a, r; 
		int n;
		while(true) {
			a= in.nextInt();
			r = in.nextInt();
			n = in.nextInt();
			
			if( a >= 0 && a <=10 && r >= 0 && r <=10 && n <=10 && n >=0) {
				break;
			}else {
				System.out.println("조건에 맞지 않는 입력");
			}
			
		}
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(a);
		for(int i = 1 ; i < n ; i ++) {
			list.add(a *= r);
		}
		
		System.out.println(list.get(n-1));
	}

}
