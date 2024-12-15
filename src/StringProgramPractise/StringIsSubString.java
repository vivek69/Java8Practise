package StringProgramPractise;

public class StringIsSubString {
public static void main(String[] args) {
	String main="testingtin";
	String sub="tin";
	int j=0,count=0;
	for(int i=0;i<main.length();i++) {
		if(main.charAt(i)==sub.charAt(j)) {
			j++;
			
		}else {
			j=0;
		}
		
		if(j==sub.length()) {
			int k=i-j+1;
			j=0;
			
			System.out.println("Sub String found at location "+k);
			count++;
		}
	}
System.out.println("Sub String found "+count+" times");
	
}
}
