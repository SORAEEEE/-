import java.util.Scanner;

public class Main {
	static final int CHEESE = 1;
	static final int AIR = 0;

	static int N, M;
	static int cheeseNum;
	static int[][] maps;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		cheeseNum = 0;
		maps = new int[N][M]; // cheese는 1~N

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				maps[i][j] = sc.nextInt();
				if (maps[i][j] == CHEESE) {
					cheeseNum++;
				}
			}
		}
		sc.close();

		int cnt = 0;
		int prvNum = 0;

		for (cnt = 0; cheeseNum != 0; cnt++) {
			prvNum = cheeseNum;
			dfs(0, 0);
			melting();
		}
		System.out.println(cnt);
		System.out.println(prvNum);

	}

	private static void dfs(int i, int j) { // 외부 공기 다 -1
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		int newI, newJ;

		maps[i][j] = -1;

		for (int idx = 0; idx < 4; idx++) {
			newI = i + dx[idx];
			newJ = j + dy[idx];
			if (newI < 0 || newI >= N || newJ < 0 || newJ >= M)
				continue;
			else if (maps[newI][newJ] == 0)
				dfs(newI, newJ);
			else if (maps[newI][newJ] > 0)
				maps[newI][newJ]++;
		}
	}

	private static void melting() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (maps[i][j] > 1) {
					maps[i][j] = 0;
					cheeseNum--;
				} else if (maps[i][j] == -1)
					maps[i][j] = 0;
			}
		}
	}

	private static void printMaps() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(maps[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
