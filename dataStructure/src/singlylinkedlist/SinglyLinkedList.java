package singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//insert at the begining
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		System.out.println(first.data);
	}
	
	//insert at the end
	public void insertLast(int data) {
		Node currentNode = first;
		while(currentNode.next != null) {
			currentNode = currentNode.next; // we loop until the end
		}
		
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}
	
	public Node deleteFist() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List(first --> last)");
		Node currentNode = first;
		while(currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
