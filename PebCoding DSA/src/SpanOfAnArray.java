import java.util.Scanner;

public class SpanOfAnArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Element are ...");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int min = arr[0];
		int max = arr[0];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("\nMax: "+max);
		System.out.println("\nMin: "+min);
		
		System.out.println("Span: "+ (max-min));
	}
}
