import java.util.Stack;

public class AddingElement {
	public static void main(String[] args) {
		Stack stack1 = new Stack();
		Stack<String> stack2 = new Stack<String>();
		stack1.push(4);
		stack1.push("Abhinav");
		stack1.push("Raj");
		
		stack2.push("Shivam");
		stack2.push("Living");
		stack2.push("Darsur");
		
		System.out.println(stack1);
		System.out.println(stack2);
		
	}
}
