package appSec10;

import java.util.Locale;
import java.util.Scanner;

public class Main100 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == num) {
					System.out.printf("Position %d,%d%n", i, j);
					if (j != 0) {
						System.out.printf("Left: %d%n", mat[i][j-1]);
					} 
					if (j != n - 1) {
						System.out.printf("Right: %d%n", mat[i][j+1]);
					} 
					if (i != 0) {
						System.out.printf("Up: %d%n", mat[i-1][j]);
					} 
					if (i != m - 1) {
						System.out.printf("Down: %d%n", mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
