package ds;

public class PersonStack {
	private Person[] stack;
	private int top;
	private int size;

	public PersonStack() {
		top = -1;
		stack = new Person[50];
		size = 50;
	}

	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[this.size];
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean push(Person person) {
		if (!isFull()) {
			top++;
			stack[top] = person;
			return true;
		} else {
			return false;
		}
	}

	public Person pop() {
		if (!isEmpty()) {
			return (stack[top--]); // return then dec.
		} else {
			return null;
		}
	}
}
