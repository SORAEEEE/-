import java.util.Scanner;

public class Main {
	static int N, M;
	static int cheeseNum;
	static int[][] maps;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		maps = new int[N][M];

		int i, j;
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				maps[i][j] = sc.nextInt();
				if (maps[i][j] == 1)
					cheeseNum++;
			}
		}
		sc.close();

		int cnt = 0;
		while (cheeseNum != 0) {
			dfs(0, 0);
			melting();
			cnt++;
		}
		System.out.println(cnt);
	}

	private static void dfs(int i, int j) {
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		int idx;
		int newI, newJ;

		maps[i][j] = -1;

		for (idx = 0; idx < 4; idx++) {
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
		int i, j;
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				if (maps[i][j] > 2) {
					maps[i][j] = 0;
					cheeseNum--;
				}
				else if(maps[i][j] == 2)
					maps[i][j] = 1;
				else if(maps[i][j] == -1)
					maps[i][j] = 0;
			}
		}
	}
}
