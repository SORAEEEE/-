import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int[][] map;
	static int[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N + 1][N + 1];
		visited = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int i = 1; i <= N; i++) {
			bfs(i);
		}

		print();
		sc.close();
	}

	static void bfs(int val) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(val);

		while (!q.isEmpty()) {
			int temp = q.remove();

			for (int i = 1; i <= N; i++) {
				if ((map[temp][i] == 1) && (visited[val][i] == 0)) {
					q.add(i);
					visited[val][i] = 1;
				}
			}
		}
	}

	static void print() {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
	}
}
