import java.util.Scanner;

public class Program {
	public static void getcount(String input) {
		   int acount=0;
		   int vcount=0;
		   int ncount=0;
		
		   for(int i=0;i<input.length();i++) {
			   char ch=input.charAt(i);
			   if(Character.isLetter(ch)) {
				acount++;
				}
			   
			 if(ch=='a'  || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vcount++;
	            }
			 else if(Character.isDigit(ch)) {
					ncount++;
			 }}
         System.out.println("Total number of alphabet in string>>"+acount);
		System.out.println("Total number of vowel in string>>"+vcount);
		System.out.println("Total numebr of number in the string >>"+ncount);
		}
		public static void main(String args[]) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Inter the line of the String>>");
		  
			String input=scanner.nextLine();
			getcount(input);
		}}

