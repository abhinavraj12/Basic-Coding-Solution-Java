import java.util.Scanner;

public class BaseToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int rv =0;
		int p =1;
		while(n>0) {
			int rem= n%10;
			n = n/10;
			rv +=rem*p;
			p = p*b;
		}
		System.out.println(rv);
	}

}
