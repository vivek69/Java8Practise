package Programs;

public class SumOfNumericValueInString {

	public static void main(String[] args) {
String input="vivek12bharwaj07baraut78";
int sum=0;
for(int i=0;i<input.length();i++) {
	char c=input.charAt(i);
	if(Character.isDigit(c)) {
		sum=sum+Character.getNumericValue(c);
	}
}
System.out.println(sum);
	}

}
