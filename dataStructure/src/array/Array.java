package array;

public class Array {
	private int[] a;
	private int nElements;
	
	public Array(int size) {
		a = new int[size];
		nElements = 0;
	}
	
	public int length() {
		return a.length;
	}
	public int getElement(int i) {
		return a[i];
	}
	public void insert(int value) {
		a[nElements] = value;
		nElements++;
	}
	
	public void delete(int key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				for(int j=i; j<a.length - 1;j++) {
					a[j] = a[j+1];
				}
				break;
			}
		}
	}
	
	public int findBi(int key) {
		int low = a[0];
		int high = a[a.length-1];
		while(low <= high) {
			int curIn = (low + high)/2;
			
			if(a[curIn] == key) {
				return key;
			}
			
			if(a[curIn]<key) {
				low = curIn + 1;
			}else {
				high = curIn - 1;
			}
			
		}
		return -1;
	}
	public int find(int key) {
		int result = -1;
		for(int i = 0; i < nElements; i++) {
			if(a[i] == key) {
				result = key;
				break;
			}
		}
		
		return result;
	}
}
