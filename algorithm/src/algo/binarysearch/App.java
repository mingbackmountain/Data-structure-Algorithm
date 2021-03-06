package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(binaryfind(new int[] {1,2,3,4,5},5));
		System.out.println(recursiveFindBinary(new int[] {1,2,3,4,5}, 0, 5, 5));
		
	}
	
	public static int binaryfind(int[] a, int key) {
		int low = 0;
		int high = a.length-1;
		
		while(low <= high) {
			int middle = (low + high) /2;
			if(key < a[middle]) {
				high = middle-1;
			}else if(key > a[middle]) {
				low = middle + 1;
			}else {
				return middle;
			}
		}
		
		return -1;
	}
	public static int recursiveFindBinary(int[] a,int low,int high,int key) {
		System.out.println("["+low+"..."+high+"]");
		if(low>=high) {
			return -1;
		}else {
			int middle = (low+high)/2;
			if(a[middle] == key) {
				return middle;
			}else if(a[middle] > key) {
				return recursiveFindBinary(a, low, middle-1, key);
			}else {
				return recursiveFindBinary(a, middle+1, high, key);
			}
		}
	}
}
