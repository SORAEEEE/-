import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int RIPE = 1;
	static final int UNRIPE = 0;
	static final int BLANK = -1;

	static int M, N; // row:M, col:N
	static int[][] map;
	static boolean[][] visited;
	static Queue<Point> queue;
	static int day = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();

		// set array
		map = new int[N][M];
		visited = new boolean[N][M];
		queue = new LinkedList<Point>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();

				if (map[i][j] == RIPE) {
					queue.add(new Point(i, j));
					visited[i][j] = true;
				}
			}
		}
		sc.close();

		while (!isAllRipe()) {
			bfs(queue.size());
			//printArr();
			day++;
		}

		System.out.println(day);
	}

	public static boolean isAllRipe() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == UNRIPE)
					return false;
			}
		}
		return true;
	}

	public static void bfs(int size) {
		Point temp;
		final int[] dx = { 0, 0, 1, -1 };
		final int[] dy = { 1, -1, 0, 0 };

		if (queue.isEmpty()) {// 더 이상 갈 곳이 없을 때
			System.out.println("-1");
			System.exit(0);
		}

		while (size != 0) {
			temp = queue.poll();

			for (int idx = 0; idx < 4; idx++) {
				int nextI = temp.i + dx[idx];
				int nextJ = temp.j + dy[idx];

				if (nextI >= N || nextI < 0 || nextJ >= M || nextJ < 0)
					continue;
				if (visited[nextI][nextJ])
					continue;
				if (map[nextI][nextJ] == BLANK)
					continue;

				queue.add(new Point(nextI, nextJ));
				map[nextI][nextJ] = RIPE;
				visited[nextI][nextJ] = true;
			} // end for

			size--;
		}
	}

	public static void printArr() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Point {
	int i, j;

	Point(int row, int col) {
		this.i = row;
		this.j = col;
	}

}