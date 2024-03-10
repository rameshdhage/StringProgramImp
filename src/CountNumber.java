
public class CountNumber {
public static void main(String[] args) {
	      String s="i am happy 123";
	      int ncount=0;
	      
	      
	      for(int i=0;i<s.length();i++) {
	    	 char ch= s.charAt(i);
	    	 if(Character.isDigit(ch)) {
	    		 ncount++;
	    		 
	    	 }
	      }
	      System.out.println(ncount);
	      
}
}
