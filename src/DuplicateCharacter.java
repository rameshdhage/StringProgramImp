
public class DuplicateCharacter {
	public static void main(String[] args) {
		String str="Great responsibility";
		int count=0;
		
		System.out.println(str.length());
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!= ' ') {
				count++;
			}
		}
	}

}
