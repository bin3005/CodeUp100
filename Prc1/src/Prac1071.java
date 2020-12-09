import java.util.Scanner;

class ZeroTest{
	Scanner in = new Scanner(System.in);
	public void checkZero() {
		int number = in.nextInt();
		
		if(number != 0) {
			System.out.println(number);
			checkZero();
		}			
	}
}


public class Prac1071 {
	public static void main(String[] args) {
		ZeroTest zt = new ZeroTest();
		zt.checkZero();

	}
	

}


