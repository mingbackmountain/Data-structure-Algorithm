package curcularlinkedlist;

import singlylinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	private boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first; // newNode --> oldfirst
		first = newNode; // first place
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode; // the next value of the last node will point to the new node
			last = newNode;// we make the new node we create be the last one in t he list
		}
	}
	
	public int deleteFirst() {
		int temp = first.data;
		
		if(first.next == null) {
			last = null;
		}
		
		first = first.next;//first will point to old's next value
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
