package Programs;
//https://www.youtube.com/watch?v=tNNJWsVo748
public class ReverseStringWithoutReversingTheWord {
public static void main(String[] args) {
	String input="  the sky is blue  ";
	String output="";
	int i=input.length()-1;
	while(i>=0) {
		while(i>=0 && input.charAt(i)==' ')i--;
		int j=i;
		while(i>=0 && input.charAt(i)!=' ')i--;
		if(output.isEmpty()) {
		output=output.concat(input.substring(i+1, j+1));
		}else {
			output=output.concat(" "+input.substring(i+1, j+1));
		}
	}
	System.out.println(output);
	
	
}
}
