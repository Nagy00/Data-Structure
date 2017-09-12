package LinkedList;

public class linkedList {
	
	private Node head;
	
	public linkedList(int item){
		head = new Node ();
		head.link = null;
		head.value = item;
	}
	
	
	//insert node directly after the header.
	public boolean insertNodeBefore(int item){
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean insertNodeAfter(int item){
		Node n = new Node();
		n.value = item;
		
		return true;
	}
	

	class Node {
		private Node link;
		private int value;
	}
}
