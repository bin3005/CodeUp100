import java.util.Scanner;

public class Prac98 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row , col;
		row = col = 19;
		
		// 현재 상황 입력
		int[][] map = new int[row][col];
		
		for(int i = 0 ; i < map.length; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				map[i][j] = in.nextInt();
			}
		}
		//뒤집기
		int num = in.nextInt();
		for( int i = 0 ; i < num ; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			for(int j = 0 ; j < col ; j++) {
				if(map[x-1][j] == 0) {
					map[x-1][j] = 1;
				}else {
					map[x-1][j] = 0;
				}
			}
			
			for(int j = 0 ; j < row ; j++) {
				if(map[j][y-1] == 0) {
					map[j][y-1] = 1;
				}else {
					map[j][y-1] = 0;
				}
			}
			
		}
		
		//출력
		for(int i = 0 ; i < map.length; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

}
