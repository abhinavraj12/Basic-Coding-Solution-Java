
//Scretch Implementation (Linked List)
public class LL {
	
	Node head;
	private int size;
	
	LL(){
		size=0;
	}
	
	public class Node {
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//Add element in First 
	public void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	// Add element in Last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}
	
	// Print List
	public void printList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	
	// Remove first element from List
	public void removeFirst() {
		if(head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}
		head = this.head.next;
		size--;
	}
	
	// Remove Last Element from List
	public void removeLast() {
		if(head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}
		size--;
		if(head.next==null) {
			head = null;
		}
		Node currentNode = head;
		Node lastNode = head.next;
		
		while(lastNode.next!=null) {
			currentNode = currentNode.next;
			lastNode = lastNode.next;
		}
		currentNode.next = null;
	}
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addLast("list");
		list.addFirst("is");
		list.addFirst("a");
		list.addLast("this");
		list.printList();
	}

}
