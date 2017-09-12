public class IntLinkedList {

	private Node head;
	
	public IntLinkedList(int item){
		head = new Node();
		head.value = item;
		head.link = null;
	}
	
	public boolean insertNode(int item){
		Node n = new Node();
		n.value = item;
		n.link = head;
		this.head = n;
		return true;
	}
	
	public void printAll(){
		Node z = head;
		while(z != null){
			System.out.println(z.value);
			z = z.link;
		}
	}
	
	public boolean deleteNde(int item){
		
		//first we will check if the node is in the first node
		//if true then we will store the address of the second node in th header.
		if(head.value == item){
			this.head = head.link;
		}
		return true;
	}
	class Node {
		private int value;
		private Node link;
	}
}
