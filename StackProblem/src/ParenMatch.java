//import java.util.Stack;
//
//import javax.print.attribute.standard.MediaSize.ISO;
//
//public class ParenMatch {
//
//	public static void main(String[] args) {
//		String str;
//		isParenthesisMatching(str ="{[(a+b)}]");
//	
//	}
//	private static boolean isParenthesisMatching(String str) {
//		Stack<Character> s = new Stack<>();
//		for(int i =0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(isOpening(ch)) {
//				s.push(ch);
//			}else {
//				if(s.isEmpty()) {
//					return false;
//				}else if(!isMatching(s.peek(),ch)) {
//					return false;
//				}else {
//					s.pop();
//				}
//			}
//		}
//		return s.isEmpty();
//	//}
////	public static boolean isOpening(char c) {
////		
////		return c ='('||c='{'||c='[';
////	}	
////	public static boolean isMatching(char a, char b) {
////		return a=('(' && b=')')||(a='{' && b='}')||(a='[' && b=']');
////	}
////}
