import ds.Queue;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		System.out.println(q.getTotal());
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		System.out.println(q.getTotal());

	}
	

}
