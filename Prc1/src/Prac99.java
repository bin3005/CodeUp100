import java.util.Scanner;

public class Prac99 {

	public static void main(String[] args) {
		/*
		 * ù��°�� ���� ���� �ι� °�� ���� ���� ����° �� ������� / ���� / ��ǥ 0->���� 1->����
		 */

		Scanner in = new Scanner(System.in);
		int width, height, number, length, direction, x, y;

		while (true) {
			width = in.nextInt();
			height = in.nextInt();
			if (width >= 1 && height <= 100) {
				break;
			} else {
				System.out.println("���ǿ� �����ʴ� ���μ���!!( 1<=w, h<=200 ) ");
			}
		}

		int[][] map = new int[width][height];

		while (true) {
			number = in.nextInt();
			if (number >= 1 && number <= 10) {
				break;
			} else {
				System.out.println("���ǿ� ���� �ʴ� ����� �� ( 1<= n <= 10 )");
			}
		}

		for (int i = 0; i < number; i++) {

			while (true) {
				length = in.nextInt();
				direction = in.nextInt();
				x = in.nextInt();
				y = in.nextInt();

				if ((direction == 1 || direction == 0) && x >= 1 && x <= (100 - height) && y >= 1
						&& y <= (100 - width)) {
					break;
				} else {
					System.out.println("���ǿ� �����ʴ� �Է�!! ( d = 0 or 1\r\n" + "1 <= x <= 100-h\r\n" + "1 <= y <= 100-w)");
				}
			}

			if (direction == 0) { // ����
				for (int j = 0; j < length; j++) {
					map[x - 1 ][y - 1 + j] = 1;
				}
			} else {// ����
				for (int j = 0; j < length; j++) {
					map[x - 1 + j][y - 1] = 1;
				}
			}
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
