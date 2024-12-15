package StringProgramPractise;

public class LongestDistinctCharactersInString {
public static void main(String[] args) {
	String s="aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
	String finalString="";
	for(int i=0;i<s.length();i++) {
		if(!finalString.contains(""+s.charAt(i))) {
		finalString=finalString+s.charAt(i);
		}
		
	}
	System.out.println("DistinctCharacterInString "+finalString);
}
}
