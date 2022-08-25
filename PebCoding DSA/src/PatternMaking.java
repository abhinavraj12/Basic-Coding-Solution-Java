public class PatternMaking {

	public static void main(String[] args) {
		
		for(int i =1 ; i<=5;i++) {
			int k =1;
			for(int j=1,p=i ; j<=i;j++) {
				
			
				if(i%2==0) { 
					System.out.print(p+" ");
					p--;
				} 
				
				else  {
					System.out.print(k+" ");
				}
				k++;
			
				
			}
			System.out.println();
		}
	}
}
