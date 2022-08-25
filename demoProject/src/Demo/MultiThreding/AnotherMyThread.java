package Demo.MultiThreding;

import java.util.concurrent.TimeUnit;

public class AnotherMyThread extends Thread {
	public void run() {
		for(int i = 10;i>=0;i--)
			System.out.println(i);
		try {
			TimeUnit.SECONDS.sleep(2);
		}catch(Exception e){
			
		}
	}
}
