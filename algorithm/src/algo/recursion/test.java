package algo.recursion;

public class test {
	public static void main(String[] args) {
		testsome(4);
		
	}
	public static void testsome(int n) {
		System.out.println(n);
		if(n==0) {
			
		}else {
			testsome(n-1);
		}
		
	}
}
