package algo.mergesort;

public class MergeSort {
	public static void sort(int inputArray[]) {
		sort(inputArray,0,inputArray.length-1);
	}
	public static void sort(int inputArray[],int start,int end) {
		if(end <= start) {
			return;
		}
		int mid = (start + end)/2;
		sort(inputArray,start,mid); //sort the left half
		sort(inputArray,mid+1,end); // sort the right half
		merge(inputArray,start,mid,end);// merge the result into the array
	}
	
	public static void merge(int inputArray[], int start, int mid,int end) {
		int tempArray[] = new int [end - start + 1];
		
		int leftSlot = start;
		int rightSlot = end;
	}
}
