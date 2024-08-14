import java.util.*;

public class num_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N * M 크기의 행렬
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [][] arr1 = new int[N][M];
		int [][] arr2 = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// 행렬 덧셈
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}