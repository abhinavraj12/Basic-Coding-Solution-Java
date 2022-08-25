import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int rev =0;
		int p =1;
		while(n>0) {
			int dig = n%b;
			n = n/b;
			rev += dig*p;
			p = p*10;
			
		}
		//int dn = getDectoAny(n,b);
		System.out.println(rev);
	}
//
//	private static int getDectoAny(int n, int b) {
//		int rv =0;
//		int p =1;
//		while(n>0) {
//			int dig = n%b;
//			n=n/b;
//			rv += dig*p;
//			p = p*10;
//		}
//		return rv;
//	}

}
