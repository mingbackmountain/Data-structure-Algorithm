package queue;

public class Queue {
	
	private int maxSize;
	private long[] queArray;
	private int front; // front of the line
	private int rear; // back of the line
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[maxSize];
		front = 0; //index of the first slot
		rear = -1; // there is no item in the array yet
		nItems = 0;
	}
	
	public void insert(long j) {
		if(rear == maxSize-1) {  //this condition create circular queue
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public long remove() {
		long temp = queArray[front++];
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	public void view() {
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i]+" ");
		}
		System.out.print("]");
	}
}
