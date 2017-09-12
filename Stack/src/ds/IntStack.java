package ds;

public class IntStack {

	private int [] stack;
	private int top; // refers to the index of the top element.
	private int size;

	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[50];
	}

	public IntStack(int size) {
		top = -1;
		this.size = size;
		stack = new int[size];
	}

	public boolean push(int item) {
		// check if the stack is full ?
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public int pop() {
		if (!isEmpty()) {
			return stack[top--];
		}else{
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}
