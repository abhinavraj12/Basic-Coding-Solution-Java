import java.util.Arrays;
public class SecLarInd {
	public static void main(String[] args) {
		int[] A = {25,56,45,20,89,24,5};
		Arrays.sort(A);
        int max = A[0];
        for(int i =0; i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        int maxS = A[0];
         for(int i =0; i<A.length-1;i++){
            if(A[i]>maxS && maxS<max){
                maxS = A[i];   
            }
        }
         System.out.println(maxS);
	}
}
