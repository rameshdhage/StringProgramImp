
public class DuplicateWords {
	public static void main(String[] args) {
		String str="Love life love his life his";
		int count=0;
		str=str.toLowerCase();
		
	// now splits the string into words using splits method of string class .	
		String[] word =str.split(" ");
		
		System.out.println("duplicate words the specified string:");
		
		for(int i=0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			if(count>1 && word[i]!="0")
				System.out.println(word[i]);
			
		}
		
	}

}
