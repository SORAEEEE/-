import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//import java.util.Stack;

public class Main {
	static ArrayList<Integer>[] adj;
	static boolean[] visit;
	static Queue<Integer> queue;
	// static Stack<Integer> stack;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();

		adj = (ArrayList<Integer>[]) new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}

		for (int i = 1; i <= N; i++)
			Collections.sort(adj[i]);

		visit = new boolean[N + 1];
		Arrays.fill(visit, false);

		DFS(V);
		System.out.println();
		Arrays.fill(visit, false);
		BFS(V);
		System.out.println();
		sc.close();
	}

	public static void DFS(int x) {
		visit[x] = true;
		System.out.print(x + " ");
		for (int y : adj[x]) {
			if (!visit[y])
				DFS(y);
		}
	}

	public static void BFS(int V) {
		queue = new LinkedList<Integer>();
		queue.add(V);
		visit[V] = true;
		while (!queue.isEmpty()) {
			int x = queue.poll();
			System.out.print(x + " ");
			for (int y : adj[x]) {
				if (!visit[y]) {
					visit[y] = true;
					queue.add(y);
				}
			}
		}
	}
}
