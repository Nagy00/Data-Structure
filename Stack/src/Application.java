import ds.IntStack;
import ds.Person;
import ds.PersonStack;


public class Application {

	public static void main(String[] args) {
//		IntStack stack = new IntStack();
//		stack.push(2);
//		stack.push(23);
//		stack.push(4);
//		stack.push(77);
//		stack.push(99);
//
//		System.out.println(stack.pop());
		
		PersonStack stack = new PersonStack();
		
		Person p1 = new Person("Mohamed","Dev");
		Person p2 = new Person("Mohamed1","Dev");
		Person p3 = new Person("Mohamed2","Dev");
		
		stack.push(p1);
		stack.push(p2);
		stack.push(p3);
		
		System.out.println(stack.pop());
	}

}
