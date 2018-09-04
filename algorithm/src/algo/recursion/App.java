package algo.recursion;

public class App {

	public static void main(String[] args) {
		//reduceByOne(10);
		System.out.println(recursiveFindLinear(new int[] {1,2,3,4,5},0, 5));
	}
	
	public static void reduceByOne(int n) {
		if(n >= 0) {
			reduceByOne(n-1);
		}
		
		System.out.println("Completed Call:" + n);
	}
	
	public static int recursiveFindLinear(int[] a,int i,int key) {
		if(i>a.length-1) {
			return -1;
		}else if(a[i] == key) {
			return i;
		}else {
			System.out.println("index at:"+i);
			return recursiveFindLinear(a, i+1, key);
		}
	}
}
