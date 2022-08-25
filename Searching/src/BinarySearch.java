
public class BinarySearch {

	public static void main(String[] args) {
		
		BinarySearchIterative(null, 0, 0);
		;
	}

	private static int BinarySearchIterative(int arr[], int n, int data) {
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = low+(high-low)/2;
			if (arr[mid]==data) {
				return mid;
			}
				
			else if(arr[mid]<data)
				low = mid+1;
			else high = mid-1;
		}
		return -1;
	}
}
