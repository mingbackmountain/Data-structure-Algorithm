package queue;

public class App {
	public static void main(String[] args) {
		Queue myqueue = new Queue(5);
		myqueue.insert(15);
		myqueue.insert(48);
		myqueue.insert(37);
		myqueue.insert(30);
		myqueue.insert(14);
		myqueue.view();
		long dequeue = myqueue.remove();
		System.out.println(dequeue);
	}
}
