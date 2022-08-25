import java.io.*;
import java.nio.file.Path;
public class FileWriters {
	
	
	
	public static void main(String[] args) {
		try {
			String s = "D://My//my.txt";
			File f = new File(s);
			f.createNewFile();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
