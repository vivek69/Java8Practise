package StringProgramPractise;

public class ExtractNumber {
public static void main(String[] args) {
	String finalstring="i am 07 august 08 1988 bron child";
	System.out.println(finalstring.replaceAll("[^0-9]", ""));
}
}
