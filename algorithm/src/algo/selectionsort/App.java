package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionsort(new int[] {9,8,13,87,12,99});
		for(int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static int [] selectionsort(int a[]) {
		for(int i =0; i < a.length; i++) {
			int min = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) { //if we find smaller value
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}

}
