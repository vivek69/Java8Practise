package StringProgramPractise;

public class SortTheCharacterOfString {

	public static void main(String[] args) {
String input="good";
char []inputToArray=input.toCharArray();

for(int i=0;i<inputToArray.length;i++) {
	for(int j=i+1;j<inputToArray.length;j++) {
		if(inputToArray[i]>inputToArray[j]) {
			char temp=inputToArray[i];
			inputToArray[i]=inputToArray[j];
			inputToArray[j]=temp;
		}
	}
}
System.out.println(new String(inputToArray));
char cd='c';
char de='f';
System.out.println(cd>de);
	}

	
}
