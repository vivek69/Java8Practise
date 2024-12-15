package StringProgramPractise;

import java.util.HashMap;
//InComplete
public class LengthOfLongestCommonString {

	public static void main(String[] args) {
String firstString="abcdgh";
String secondString="cdgh";
HashMap<String,Integer>hmvalue=new HashMap<String,Integer>();

int count=0;
String finalValue="";
if(firstString.length()<secondString.length()) {
	System.out.println("not found");
}
	for(int i=0;i<firstString.length();i++) {
		boolean ok=true;
		for(int j=0;j<secondString.length();j++) {
			if(firstString.charAt(i+j)!=secondString.charAt(j)) {
				ok=false;
				break;
			}else {
				finalValue=finalValue+secondString.charAt(j);
			}
			}
		if(ok) {
			System.out.println(finalValue+" found at position "+i);
			break;
		}else {
			System.out.println("Not Found");
		}
		//System.out.println("Not found");
	}

String finalString="";
int value=0;
for(String key:hmvalue.keySet()) {
	if(value<hmvalue.get(key)) {
		value=hmvalue.get(key);
		finalString=key;
	}
}
System.out.println("The longest common substring is "+finalString+" which has length "+value);

	}

}
