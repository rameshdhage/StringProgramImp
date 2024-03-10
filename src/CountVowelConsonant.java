
public class CountVowelConsonant {
	
	public static void main(String[] args) {
		 String str="This is a really simple sentence";
		  str=str.toLowerCase();
		 
		 int count =0;
		 int ccount=0;
		 for(int i=0;i<str.length();i++) {
       if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				 count++;
			 } 
			 else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				 ccount++;
			 }
		 }
		 System.out.println("the total number of vowel>>"+count);
		 System.out.println("the total number of conssonant>>"+ccount);
	
}}
