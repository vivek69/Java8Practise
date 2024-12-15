
public class FirstCharacterOfStringInUperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="iamMan";
		System.out.println(input.substring(0, 1));
		System.out.println(input.substring(1));
		System.out.println(input.substring(0,1).toUpperCase()+input.substring(1));
		
		String inputSentence="i am a man and i am looking for the job";
String []allvalues=inputSentence.split(" ");
String finalvalue="";
for(String value:allvalues) {
	finalvalue=finalvalue+value.substring(0,1).toUpperCase()+value.substring(1)+" ";
}
System.out.println(finalvalue);
	}

}
