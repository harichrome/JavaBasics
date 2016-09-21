
public class Palindrome {

	
	public static void main(String[] args) {
		
		//System.out.println(longestPalindromicSubstring("AABCDCBA"));
		//System.out.println(longestPalindromicSubstring("DEFABCBAYT"));
		
		StringBuilder Str=new StringBuilder("AABCDCBA");
		 System.out.println("string = " + Str);
		 
		 StringBuilder Rstr=new StringBuilder(Str.reverse());
		 System.out.println("string = " + Rstr);
		 
		 String outstr1=Str.toString();
		 String outstr2=Rstr.toString();
		 
		 System.out.println(Str.charAt(0));
		 
		 for (int i=0;i<Str.length();i++){
			 System.out.println("Str= "+Str.charAt(i));
			 
			 for (int j=0;j<Rstr.length();j++){
				 System.out.println("Rstr= "+Rstr.charAt(j));
				 
			 }
		 }
		 
	}
		
	
	
	
}
