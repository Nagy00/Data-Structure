package ds;

public class PersonQueue {
	private Person[] queue;
	private int total;
	private int size;
	private int front;
	private int rear;

	public PersonQueue() {
		queue = new Person[100];
		total = 0;
		size = 100;
		front = 0;
		rear = 0;
	}

	public PersonQueue(int size) {
		queue = new Person[this.size];
		total = 0;
		this.size = size;
		front = 0;
		rear = 0;
	}

	public boolean isFull() {
		if (total == size) {
			return true;
		} else {
			return false;

		}
	}

	public boolean isEmpty() {
		if (total == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enqueue(Person person) {
		if (!isFull()) {
			total++;
			queue[rear] = person;
			rear++;
			return true;
		}
		return false;
	}

	public Person dequeue() {
		if (!isEmpty()) {
			total--;
			Person removePerson = queue[front];
			front++;
			return removePerson;
		} else {
			return null;
		}
	}
}
