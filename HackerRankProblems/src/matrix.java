import java.io.IOException;
import java.util.Scanner;


public class matrix {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] ch = new String[n][m];
		
		for(int i =0; i<n;i++) {
			for(int j =0; j<m;j++) {
				ch[i][j] = sc.next();
			}
		}
	
		for(int i =0; i<n;i++) {
			for(int j =0; j<m;j++) {
				System.out.print(ch[i][j]+" ");	
			}
			System.out.println();			
		}
	}

}
