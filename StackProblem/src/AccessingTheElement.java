import java.util.Stack;

public class AccessingTheElement {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Welcome");
		st.push("To");
		st.push("My");
		st.push("Home");
		
		System.out.println("Initial Stack: "+st);
		System.out.println("The Element at the Top of the Stack: "+st.peek());
		System.out.println("Final Stack: "+st);

	}

}
