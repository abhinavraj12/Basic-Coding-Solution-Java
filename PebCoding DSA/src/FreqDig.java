
public class FreqDig {
	public static void main(String[] args) {
		int n = 95439692;
		int f = 9;
		int freq=0;
		while(n>0) {
			int dig = n%10;
			n = n/10;
			if(dig==f) {
				freq++;
			}
		}
		System.out.println(freq);
	}
}
