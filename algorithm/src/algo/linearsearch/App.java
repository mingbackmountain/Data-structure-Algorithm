package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[] a = {1,7,3,9,5,};
		System.out.println(find(a,7));
	}
	
	public static int find(int[] x,int key) {
		for(int i =0;i<x.length;i++) {
			if(x[i] == key) {
				return x[i];
			}
		}
		return -1;
	}

}
