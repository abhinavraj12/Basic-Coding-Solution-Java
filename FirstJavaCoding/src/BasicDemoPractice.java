import java.lang.*;
import java.io.*;
import java.util.*;
public class BasicDemoPractice {
	
	
	 // Q #1) Write a Java Program to reverse a string without using String inbuilt function.
	 
	 static void reversestring() {
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the Name :");
		 String str = Sc.nextLine();
		 
		 StringBuilder str2 = new StringBuilder();
		 str2.append(str);
		 str2 =str2.reverse();
		 System.out.println(str2);
		 }
		
	 
	 
	//  Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
	  
	 static void reversestringsec() {
		 String str;
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the Name :");
		 str = Sc.nextLine();
		 char[] strAsChar = str.toCharArray();
		 
		 char[] result = new char[strAsChar.length];
		 for(int i = 0;i<strAsChar.length;i++)
			 result[i]=strAsChar[strAsChar.length-i-1];
			 System.out.println("Reverse of the String is: " +new String(result));
		 
		 
//		 byte[] strAsbyte = str.getBytes();
//		 byte[] result = new byte[strAsbyte.length];
//		 for(int i = 0;i<strAsbyte.length;i++)
//			 result[i]=strAsbyte[strAsbyte.length-i-1];
//			 System.out.println("Reverse of the String is: " +new String(result));
		 }
	 
//	 Q #3) Write a Java Program to swap two numbers using the third variable
	 
	 static void swap() {
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the first Number :");
		 int num1 = Sc.nextInt();
		 System.out.println("Enter the second number :");
		 int num2 = Sc.nextInt();
		 System.out.println("Before Swap:"+num1+ " " + num2);
		 int temp = num1;
		 num1 = num2;
		 num2 = temp;
		 System.out.println("After Swap:"+num1+ " " + num2);
		 
			
		}
	 
	// Q #4) Write a Java Program to swap two numbers without using the third variable
	 
	 static void swapsec() {
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the first Number :");
		 int num1 = Sc.nextInt();
		 System.out.println("Enter the second number :");
		 int num2 = Sc.nextInt();
		 System.out.println("Before Swap:"+num1+ " " + num2);
		 num1 = num1+num2;
		 num2 = num1-num2;
		 num1 = num1-num2;
		 System.out.println("After Swap:"+num1+ " " + num2);
		 
		}
	
	 
	// Q #5) Write a Java Program to find whether a number is prime or not.
	
	 static void prime_or_not() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number:");
		 long num = sc.nextLong();
		 long temp;
		 
		 boolean isPrime = true;
		 if(num==1||num==0) {
			 System.out.println(num+" "+"is not a Prime Number");
		 }else {
			 for(long i=2;i<=num/2;i++) {	
				 temp=num%i;
				 if (temp==0) {
					 isPrime=false;
					 break;
				 }
				 
			 }
			 if(isPrime) {
				 System.out.println(num+" "+"is a Prime Number");
			 }else {
				 System.out.println(num+" "+"is not a Prime Number");
			 } 
		 }
		 
	}
	 // Q #6) Write a Java Program to find whether a string or number is palindrome or not.
	 
	 	static void  palindrome_or_not() {
 		
	 		
	 		String x, y = "";
	        Scanner a = new Scanner(System.in);
	       System.out.println("Enter  string you want to check:");
	      x = a.nextLine();
	         int length = x.length();
	        for(int i = length - 1; i >= 0; i--)    
	      {											
	           y = y + x.charAt(i); 
	       }
	        System.out.println("Reverse:"+y);
	       if(x.equalsIgnoreCase(y))
	         {
	             System.out.println("The string is palindrome.");
	         }
	         else
	         {
	             System. out.println("The string is not a palindrome.");
	         }
		}
	 
	 
	 // Q #7) Write a Java Program for the Fibonacci series
	 // 1 1 2 3 5 8 13
	 
	 static void  Fibonacci_series() {
		 int a=0,b=0,c=1;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number of times:");
		 int num = sc.nextInt();
		 System.out.println("Fibonaci Series :");
		 for(int i=0;i<=num;i++) {
			 a=b;
			 b=c;
			 c=a+b;
			 System.out.print(c+" ");
		 }
		 
		}
	 
	 // Q #8) Write a Java Program to iterate ArrayList using for-loop, while-loop, 
	 //and advance for-loop.
	
	 static void  iterateArrayList()  {
			ArrayList list = new ArrayList();
			list.add("20");
			list.add("30");
			list.add("40");
			System.out.println("List Size:"+list.size());
			
			System.out.println("while-loop");
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("for-each loop");
			for(Object obj : list) {
				System.out.println(obj);
			}	
			
			System.out.println("for-loop");
			for(int i=0;i<=list.size();i++) {
				System.out.println(list.get(i));
			}	
	 }
	 
	public static void main(String[] args) {
		
//		reversestring();
//		reversestringsec();
//		swap();
//		swapsec();
//		prime_or_not();
//		palindrome_or_not(); 
//		Fibonacci_series();
		iterateArrayList();

	}

}
