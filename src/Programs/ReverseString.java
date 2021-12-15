package Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vivek bhardwaj";
		char[] as=new char[s.length()];
		int temp=s.length();
		for (int i = 0; i < s.length(); i++) {
		as[temp-i-1]=s.charAt(i);	
		}
		
		System.out.println(String.copyValueOf(as));

	}

}
