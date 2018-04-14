import java.io.*;
import java.util.StringTokenizer;


public class Main {
	static int N;
	static int[][] maps;
	static boolean[][] visited;
	static int maxHeight, minHeight;
	static int maxArea;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		maps = new int[N][N];
		maxHeight = 0;
		minHeight = 100;
		maxArea = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				maps[i][j] = Integer.parseInt(st.nextToken());
				if (maps[i][j] > maxHeight) // 최대 최소 높이 검사
					maxHeight = maps[i][j];
				if (maps[i][j] < minHeight)
					minHeight = maps[i][j];
			}
		}

		for (int i = 0; i <= maxHeight; i++) {
			visited = new boolean[N][N]; // 돌 때 마다 초기화 필요

			int newAreaNum = findArea(i);
			if (maxArea < newAreaNum)
				maxArea = newAreaNum;
		}
		bw.write(maxArea + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static int findArea(int rain) {
		int areaNum = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (maps[i][j] > rain && visited[i][j] == false) {
					dfs(i, j, rain);
					areaNum++;
				}
			}
		}

		return areaNum;
	}

	private static void dfs(int i, int j, int rain) {
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		int newI, newJ;

		visited[i][j] = true;
		for (int idx = 0; idx < 4; idx++) {
			newI = i + dx[idx];
			newJ = j + dy[idx];

			if (newI < 0 || newJ < 0 || newI >= N || newJ >= N)
				continue;
			else if (maps[newI][newJ] > rain && visited[newI][newJ] == false) {
				dfs(newI, newJ, rain);
			}
		}

	}

}
