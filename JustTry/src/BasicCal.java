import java.util.*;
public class BasicCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		float a = sc.nextFloat();
		System.out.println("Enter Second Number:");
		float b = sc.nextFloat();
		float Sum = a+b;
		System.out.println("Sum ="+Sum);
		float Subs= a-b;
		System.out.println("Substraction ="+Subs);
		float Mult= a*b;
		System.out.println("Mult ="+Mult);
		double Div= a/b;
		System.out.println("Div="+Div);
		
//		System.out.println("Enter First Name:");
//		String a = sc.next();
//		System.out.println("Enter Last Name:");
//		String b = sc.next();
//		System.out.println("Full Name:"+a+b );

		
	}

}
