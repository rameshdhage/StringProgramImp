
public class WordCount {
	public static void main(String[] args) {
		String str="i love java programming in the world";
		
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
				count++;
				
			}
		}
		System.out.println("the total number word is>>>"+count);
	}

}
