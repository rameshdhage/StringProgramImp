package Stringimpprogram;

import java.util.Arrays;

public class StringASCOrder {
	public static void main(String[] args) {
		
		String str="ramesh";
		char temp;
		
		
		char arr[]=str.toCharArray();
		
		
	for(int i=0;i<str.length();i++) {
		
		for(int j=i+1;j<str.length();j++) {
			
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}}}
	System.out.println(new String(arr));
	
	
	//Approch 2
	
	String str1="ramesh";
	
	char[] charArray=str1.toCharArray();
	
    Arrays.sort(charArray);
    System.out.println(new String(charArray));
	
}
	

}
