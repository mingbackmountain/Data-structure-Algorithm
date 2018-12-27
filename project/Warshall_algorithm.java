package project;
import java.util.Scanner;


public class Warshall_algorithm {
	private int V;
	private boolean[][] transitive_colsure;
	
	public void getTransitive(int[][] graph) {
		this.V = graph.length;
		this.transitive_colsure = new boolean[V][V];
		
		for(int row =0; row<V; row++) {
			for(int col=0; col<V; col++) {
				//graph[i][j] == 1
				if(graph[row][col] != 0) {
					transitive_colsure[row][col] = true;
				}
			}
		}
		
		for(int row =0; row<V; row++) {
			for(int col=0; col<V; col++) {
				if(transitive_colsure[col][row]) {
					for(int k=0; k<V; k++) {
						if(transitive_colsure[col][row] && transitive_colsure[row][k]) {
							transitive_colsure[col][k] = true;
						}
					}
				}
			}
		}
	}
	
	public void displayOriginal(int[][] graph) {
		System.out.println("\nOriginal Input :\n");
		System.out.print(" ");
        for (int v = 0; v < graph.length; v++) {
        	System.out.print("   " + v );
        }
        System.out.println();
        System.out.println("    --------------------------");
        for (int v = 0; v < graph.length; v++) 
        {
            System.out.print(v +" ");
            for (int w = 0; w < graph.length; w++) 
            {
                System.out.print("  "+graph[v][w]+" ");
            }
            System.out.println();
        }
	}
	
	public void displayTransitive() {
		 System.out.println("\nTransitive closure :\n");
	     System.out.print(" ");
	        for (int v = 0; v < V; v++) {
	        	System.out.print("   " + v );
	        }
	        System.out.println();
	        System.out.println("    --------------------------");
	        for (int v = 0; v < V; v++) 
	        {
	            System.out.print(v +" ");
	            for (int w = 0; w < V; w++) 
	            {
	                if (transitive_colsure[v][w]) 
	                	System.out.print("  1 ");
	                else                  
	                	System.out.print("  0 ");
	            }
	            System.out.println();
	        }
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Warshall Algorithm Test");
		System.out.println("-------------------------");
		Warshall_algorithm w = new Warshall_algorithm();
		
		System.out.println("Enter number of vertices\n");
		int V = scan.nextInt();
		
		System.out.println("\nEnter Adjacency matrix");
		int[][] graph = new int[V][V];
		for(int i = 0; i<V; i++) {
			for(int j=0; j<V; j++) {
				graph[i][j] = scan.nextInt();
			}
		}
		w.displayOriginal(graph);
		w.getTransitive(graph);
		w.displayTransitive();
	}
}
