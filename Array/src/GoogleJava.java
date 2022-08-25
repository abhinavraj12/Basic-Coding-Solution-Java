import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleJava  {
	
	private void HttpWrite() {
		// TODO Auto-generated method stub
		try {
			BufferedReader read = new BufferedReader(new FileReader("input.txt"));
			String pattern = "\\(?\\b(https://|www[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&@#/%=~_()|]";
			Pattern p = Pattern.compile(pattern);
			String s;
			PrintWriter out = new PrintWriter("output1.txt");
			while((s=read.readLine())!=null)
			{
				Matcher match = p.matcher(s);
				while(match.find()) {
					
						int start = match.start(0);
						int end = match.end(0);
						out.println(s.substring(start, end));
					
					
				}
				
			}
			out.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}
	
	
//	public void HttpRead() {
//		String s = "https://www.w3resource.com/java-exercises/array/index.php";
//		try {
//			URL google = new URL(s);
//			BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
//			String str = "D:/Html_Link/input1.txt";
//			File f = new FileWriter(str);
//			//String s1=f.toString();
////			PrintWriter out = new PrintWriter(new File("D:/Html_Link/input.txt"));
//			//PrintWriter out = new PrintWriter(new FileWriter("input.txt"));
//			PrintWriter out = new PrintWriter(s1);
//			String inputLine;
//			while ((inputLine = in.readLine())!=null) 
//				out.println(inputLine);
//				in.close();
//				out.close();
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	private void newFolder() {
		// TODO Auto-generated method stub
		try {
			//Path p = Paths.get("D:/Html_Link/input1.txt");
			File f1 = new File("C:\\JID\\Array\\src\\hello.txt");
			//File f = new File(f1,"input1.txt");
			// f.mkdir();
			 //f.createNewFile();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		GoogleJava j = new GoogleJava();
		//j.HttpRead();
		//j.HttpWrite();
		j.newFolder();
		
	}

}
