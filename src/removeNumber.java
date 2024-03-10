
public class removeNumber {
	public static void main(String[] args) {
		String str="java123 development342";
		String result="";
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				result=result+str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
