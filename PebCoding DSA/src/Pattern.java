import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
//		patternOne();
//		patternTwo();
//		patternThree();
//		patternFour();
//		patternFive();
//		patternSix();
//		patternSixteen();
//		patternSeventeen();
	

	}

	private static void patternSeventeen() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n/2;
		int  star = 1;
		for(int i=1;i<=n;i++) {
			
			for(int j =1; j<=space;j++) {
				if(i==n/2+1) {
					System.out.print("*\t");
				}else {
					
					System.out.print("\t");
				}
				
			}
			
			for(int j =1; j<=star;j++) {
				System.out.print("*\t");
			
			}
			if(i<=n/2) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			
			if(i<=n/2) {
				
			}
		}
	}


	private static void patternSixteen() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star =1;
		int space = 2*n-3;
		for(int i = 1;i<=n;i++) {
			int val=1;
			
			for(int j =1;j<=star;j++) {
				System.out.print(val+"\t");
				val++;
			}
			
			for(int j =1;j<=space;j++) {
				System.out.print("\t");
			}
			if(i==n) {
				star--;
				val--;
			}
			
			for(int j =1;j<=star;j++) {
				val--;
				System.out.print(val+"\t");
			}	
			star++;
			space-=2;
			
			System.out.println();
		}
	}


	private static void patternSix() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n/2;
		int star = 1;
		int val =1;
		
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=space;j++) {
				System.out.print("\t");
				
			}
			int cval =val;
			for(int j =1;j<=star;j++) {
				System.out.print(cval+"\t");
				if(j<=star/2) {
					cval++;
				}else {
					cval--;
				}
			}
			
			if(i<=n/2) {
				space--;
				star = star+2;
				val++;
			}
			else {
				space++;
				star = star-2;
				val--;
			}
			System.out.println();
		}
	}

	private static void patternFive() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {		
			for(int j =1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print("*\t");
					
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}		
	}

	private static void patternFour() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int str = 1;
		int space = n-1;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=space;j++) {
				System.out.print("\t");
			}
			for(int j =1;j<=str;j++) {
				System.out.print("*\t");
			}
					
			if(i<n) {
				space--;
			}
			System.out.println();
		}		
	}

	private static void patternThree() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int str = n/2+1;
		int space = 1;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=str;j++) {
				System.out.print("*\t");
			}
			for(int j =1;j<=space;++j) {
				System.out.print("\t");
			}
			for(int j =1;j<=str;j++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				str--;
				space+=2;
			}else {
				str++;
				space-=2;
			}		
			System.out.println();
		}
	}

	private static void patternTwo() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =n;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void patternOne() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
