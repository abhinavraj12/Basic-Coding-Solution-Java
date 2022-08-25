//import java.util.Arrays;
import java.util.Scanner;

public class $roblem {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	
int largest=Integer.MIN_VALUE;
int smallest=Integer.MAX_VALUE;
int number;
char choice;
do {
	System.out.println("enter your number :");
	number=scn.nextInt();
	if(number>largest) {
		largest=number;
	}if(number<smallest) {
		smallest=number;
	}
		
	System.out.println("enter your choice y/n");
	choice=scn.next().charAt(0);
	
	
}while(choice=='y'||choice=='Y');
System.out.println("largest no among entered is "+largest);
System.out.println("smallest no among entered is "+smallest);
}
}