package ds;

public class IntQueue {
	
	private int [] queue;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public IntQueue(){
		queue = new int [50];
		size = 50;
		total = 0;
		front = 0;
		rear = 0;
	}
	
	public boolean isFull(){
		if(total == size){
			return true;
		} else {
			return false;
		}			
	}
	
	public boolean isEmpty(){
		if(total == 0){
			return true;			
		} else {
			return false;
		}
	}
	
	public boolean enqueue(int item){
		if(!isFull()){
			return false;
		} else {
			total++;
			queue[rear] = item;
			rear++;
			return true;
		}
	}
	
	public int dequeue(){
		if(!isEmpty()){
			total--;
			int item = queue[front];
			front++;
			return item;
		} else {
			return -1;
		}
	}

}
