package Programs;

public class ChangeStringCUpperAndLowerCaseSoON {
/*
 * Java Program: Change a string such that the first character is upper case, 
 * the second is lower case, and so on.
 */
	
	public static void main(String[] args) {
		String given="vivekbhardwaj";
		String output=String.valueOf(Character.toLowerCase(given.charAt(0)));
		for(int i=1;i<given.length();i++) {
			char c=given.charAt(i);
			if(i%2==0) {
				output=output+Character.toLowerCase(c);
			}else {
				output=output+Character.toUpperCase(c);
			}
		}
		System.out.println(output);
	}
}
