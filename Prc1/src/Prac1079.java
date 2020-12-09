import java.util.Scanner;

public class Prac1079 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char target = ' ';
		
		while(target != 'q') {
			target = in.next().charAt(0);
			System.out.println(target);
		}
	}

}
