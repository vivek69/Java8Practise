package Programs;

import java.io.IOException;

public class PanagramExample {
// A pangram is a sentence containing every letter in the English Alphabet.
//	Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
	public static void main(String[] args) throws IOException{
		System.out.println(PanagramExample.isPanagram("Testsfadfdbfasfafasddfdfafadsf"));	
	}

public static boolean isPanagram(String s) {
	
	if(s.length()<26) {
		return false;
	}else {
	for(char c='a';c<='z';c++) {
		if(s.indexOf(c)<0) {
			return false;
		}
	}
	return true;
}
	
}
}
