
public class CheckStringContainsSpecialCharacter {

	public static void main(String[] args) {
String input="vivek234!";
String specialCharacter="!@#$%^&*()_+";
for(int i=0;i<input.length();i++) {
	char c=specialCharacter.charAt(i);
	if(input.contains(Character.toString(c))) {
		System.out.println("String contians special character");
		break;
	}else if(i==input.length()-1){
		System.out.println("String not containing special character");
	}
}
	}

}
