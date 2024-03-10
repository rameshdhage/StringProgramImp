import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
     System.out.println("Please enter any line........");
    
     Scanner scanner=new Scanner(System.in);
       String   str=scanner.nextLine();
		
		str=str.toLowerCase();
		int  vccount=0;
	    int ccount=0;
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' ||str.charAt(i)=='u' ) {
				vccount++;
			}
		
		else if(str.charAt(i)>='a' &&  str.charAt(i)<='z') {
			ccount++;
		}}
		
		System.out.println("The total number of vcount is >>"+vccount);
		System.out.println("The total number of ccount is>>"+ccount);
   
    }}