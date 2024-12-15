package StringProgramPractise;

public class UnCommonCharacters {

	public static void main(String[] args) {
		
		String firstString="geeksforgeeks";
		String secondString="geeksquiz";
		
		if(firstString.length()>0 && secondString.length()>0) {
			for(int i=0;i<firstString.length();i++) {
				boolean flag=false;
				for(int j=0;j<secondString.length();j++) {
					if(firstString.charAt(i)==secondString.charAt(j)) {
						flag=true;
						break;
					}
				}
				
				if(!flag) {
					System.out.print(firstString.charAt(i)+" ");
				}
			}
			for(int i=0;i<secondString.length();i++) {
				boolean flag=false;
				for(int j=0;j<firstString.length();j++) {
					if(secondString.charAt(i)==firstString.charAt(j)) {
						flag=true;
						break;
					}
				}
				
				if(!flag) {
					System.out.print(secondString.charAt(i)+" ");
				}
			}
		}else {
			
		}

	}

}
