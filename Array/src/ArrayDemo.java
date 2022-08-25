import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		sortNumericString1();
//		sumValues2();
//		printFollowinGrid3();
//		maximumMinimumValue4();
//		removeDuplicateElements5();
//		computeAverageValueExceptLargestSmallest6();
//		separatEvenOdd7();
//		sortArray8();
	}

	/*
	 * * 8. Write a Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers.

Example:
Input :
nums1 = { 3, 5, 6, 9, 8, 7 }
nums2 = { 5, 0, 1, 2, 3, 4, -2 }
Output:
After sorting new array becomes: [3, 5, 6, 7, 8, 9]
After sorting new array becomes: [-2, 0, 1, 2, 3, 4, 5]
*/
	private static void sortArray8() {
		
		
	}

	// 7. Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.

	private static void separatEvenOdd7() {
		
	}
	
	
	// 6. Write a Java program to compute the average value of an array of integers except the largest and smallest values.

	private static void computeAverageValueExceptLargestSmallest6() {
		
	}

	
	// 5. Write a Java program to remove duplicate elements from an array

	private static void removeDuplicateElements5() {
		int[] arr = {34,99,45,32,34,99,45};
			
	}
	
	
	// 4. Write a Java program to find the maximum and minimum value of an array.
	
	static int max;
	static int min;
	
	private static void maximumMinimumValue4() {
		int[] arr = {34,99,45,32,45};
		
		max = arr[0];
		min = arr[0];
		int length = arr.length;
		for (int i =1; i < length-1; i = i + 2) {
			if (i+1>length) {
				if(arr[i]>max)
					max = arr[i];
				if(arr[i]<min)
					min = arr[i];
					
			}
			if(arr[i]>arr[i+1]) {
				if (arr[i] > max)
					max = arr[i];
				if (arr[i] < min)
					min = arr[i+1];
			}
			if (arr[i] < arr[i+1]) {
				if (arr[i]<min) min =arr[i];
				if (arr[i+1]>max) max = arr[i+1];
			}
		}
		
		System.out.println("Original Array: "+ Arrays.toString(arr));
		System.out.println("Max Value: "+ max);
		System.out.println("Min Value: "+ min);
		
		
	}
	
	//3. Write a Java program to print the following grid.
	//Expected Output :

		//- - - - - - - - - -                                                                                           
		//- - - - - - - - - -                                                                                           
		//- - - - - - - - - -                                                                                           
		//- - - - - - - - - -                                                                                           
		//- - - - - - - - - -                                                                                           
		//- - - - - - - - - -  
	private static void printFollowinGrid3() {
		int[][] arr = new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	// 2. Write a Java program to sum values of an array.
	private static void sumValues2() {
		int sum=0;
		int[] array = {5,7,8,9,3,9};
		for(int Arr : array) {
			sum += Arr;			
		}
		System.out.println(sum);
	}
	
	//1. Write a Java program to sort a numeric array and a string array.
	private static void sortNumericString1() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Element here...");
		n =sc.nextInt();
		int[] array = new int[5];
		System.out.println("Enter the Element of the Array: ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array Element Are...");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		String[] st = new String[]{
			"Java", "Python","C++","Cortlin","Data Structure"
		};
		
		
		System.out.println("Original Numeric Array: "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted Numeric Arrays are: " + Arrays.toString(array));
		
		System.out.println("\nOriginal String Array: "+Arrays.toString(st));
		Arrays.sort(st);
		System.out.println("Sorted String Arrays are: " + Arrays.toString(st));
		
	}

}
