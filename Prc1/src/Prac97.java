import java.util.ArrayList;
import java.util.Scanner;

public class Prac97 {

	public static void main(String[] args) {
		/* 1090�� ����
		 * ���� ��(a), ����� ��(r), �� ��° ������ ��Ÿ���� ����(n)��
			������ �ΰ� �Էµȴ�.(��� 0 ~ 10)
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
				System.out.println("���ǿ� ���� �ʴ� �Է�");
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
