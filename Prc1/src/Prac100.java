import java.util.Scanner;

public class Prac100 {

	public static void main(String[] args) {
		/* 
		 * �����ִ°� : 0  / �� : 1 /  ����: 2
		 * ���������� �����̴� ���������� �Ʒ�������
		 * �������� = 9 
		 */
		Scanner in = new Scanner(System.in);
		int[][] map  =  new int[10][10];
			/*{ {1,1,1,1,1,1,1,1,1,1},
					{1,0,0,1,0,0,0,0,0,1},
					{1,0,0,1,1,1,0,0,0,1},
					{1,0,0,0,0,0,0,1,0,1},
					{1,0,0,0,0,0,0,1,0,1},
					{1,0,0,0,0,1,0,1,0,1},
					{1,0,0,0,0,1,2,1,0,1},
					{1,0,0,0,0,1,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,1},
					{1,1,1,1,1,1,1,1,1,1},
					�׽�Ʈ�� ��
												};*/
		
		
		
		/*
		int riceCnt = 0 ;
		for(int i = 0 ; i < 10 ; i++) {
			for(int j =0 ; j < 10 ; j++) {
				int input;
				while(true) {
					input = in.nextInt();
					if( input == 2) {
						riceCnt++;
					}
					if( riceCnt > 1) {
						System.out.println("����(2)�� �ϳ��� �Է� �Ҽ��ֽ��ϴ�.");
						riceCnt =1;
					}
					if(input == 0 || input ==1) {
						break;
					}else {
						System.out.println("��(0) ��(1) ����(2) �� �Է����ּ���.");
					}
				}
				
				map[i][j] = input+"";
			}
		}
		�Է� ����ó��
		*/
		
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j =0 ; j < 10 ; j++) {
				
				map[i][j] = in.nextInt();
			}
		}
		
			
		int rowNum = 1; 
		int colNum = 1;
		while(true) {
			if(map[rowNum][colNum] == 0) {
				map[rowNum][colNum] = 9;
				colNum +=1;
			}else if(map[rowNum][colNum] == 1) {
				colNum -=1;
				rowNum +=1;
				if(map[rowNum][colNum] ==1) {
					break;
				}
				
			}else if(map[rowNum][colNum] ==2 ) {
				map[rowNum][colNum] = 9;
				break;
			}
		}
		for(int i = 0 ; i < map.length; i++) {
			for(int j = 0 ; j <map[0].length ; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
