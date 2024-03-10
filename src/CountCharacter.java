
public class CountCharacter {
	   public static void main(String[] args) {
		     // Approach 1
		 String str="i am working";
		 System.out.println(str.length());
		 int count=0;
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)!=' ') 
			 {
			 count++;
		 }
		 }
	
	System.out.println("Total number of character i line>> "+count);

}}
/*}// Adpparoch 2
		   
		String s="i am working " ;
		int ncount =0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				ncount++;
				
			}
			
			
			
			
		}
		  } System.out.println(ncount);*/
	      
		   