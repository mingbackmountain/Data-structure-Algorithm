package algo.bubblesort;

public class App {

	public static void main(String[] args) {
		int[] myArray = bubblesort(new int[] {9,8,13,87,12,99});
		for(int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static int [] bubblesort(int a[]) {
		
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		
		return a;
	}

}
