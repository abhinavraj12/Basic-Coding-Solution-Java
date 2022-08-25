import java.util.Scanner;

public class FunctionFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int nFact = fact(n);
		int rFact = fact(n-r);
		int res = nFact/rFact;
		System.out.println(res);

	}

	private static int fact(int n) {
		int nfact=1;
		for(int i =1; i<=n;i++) {
			nfact*=i;
		}
		return nfact;
	}

}
