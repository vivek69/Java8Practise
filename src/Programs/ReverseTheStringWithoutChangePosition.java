package Programs;

public class ReverseTheStringWithoutChangePosition {
public static void main(String[] args) {
	//input vivek is learning programming
	//output keviv si gninrael gnimmargorp
	
	String inputString="vivek is learning programming";
	String []arr=inputString.split(" ");
	String finalString="";
	for (String word : arr) {
		int j=word.length()-1;
		while(j>=0) {
			char c=word.charAt(j);
			finalString=finalString + c;
			j--;
		}
		finalString=finalString+" ";
	}
	System.out.println(finalString);
}
}
