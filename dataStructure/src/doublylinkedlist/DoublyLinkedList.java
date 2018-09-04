package doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; // if empty last will refer to the new node being created
		}else {
			first.previous = newNode;
		}
		
		newNode.next = first; // the newNode will point to the oldfirst
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode; // assign oldLast to newNode
			newNode.previous = last; // the oldLast will be newNode previous
		}
		last = newNode; // the linkList last field should point to the newNode
	}
	
	
	//assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if(first.next == null) { //there's only one item
			last = null;
			
		}else {
			first.next.previous = null; //the list's first node will point to null
		}
		
		first = first.next; // we are assigning the reference of the node following the old first node to the first field in the linked list
		return temp; // return the deleted old first node
	}
	
	//assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		if(first.next == null) {
			first = null;
		}else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	//assume non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		}else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	//assume non-empty list
	public Node deleteKey(int key) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		}else {
			current.next.previous = current.previous;
		}
		
		return current;
	}
	
	public void displayForward() {
		System.out.print("List (first --> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.print("List (last --> first)");
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
}
