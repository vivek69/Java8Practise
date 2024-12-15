package StringProgramPractise;

public class OccuranceOfSubStringINString {
	//s = GeeksForGeeks, x = For
public static void main(String[] args) {
String	s = "GeeksForGethe", x = "For";
int count=0;
String finalString="";
if(s.length()<x.length()) {
	System.out.println("not found");
}
	for(int i=0;i<s.length();i++) {
		boolean ok=true;
		for(int j=0;j<x.length();j++) {
			if(s.charAt(i+j)!=x.charAt(j)) {
				ok=false;
				break;
			}else {
			finalString=finalString+x.charAt(j);
			}
			}
		if(ok) {
			System.out.println(finalString+" found at position "+i);
			break;
		}else {
			System.out.println("Not Found");
		}
		//System.out.println("Not found");
	}
	
}

}
