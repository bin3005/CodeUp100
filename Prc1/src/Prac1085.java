import java.util.Scanner;

public class Prac1085 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int s = in.nextInt();
		
		double result;
		
		result = h*b/8;
		result = result * c*s/1024/1024;
		result *= 10;
		result = Math.round(result);
		result /= 10;
		
		System.out.println(result + " MB");
	}

}
