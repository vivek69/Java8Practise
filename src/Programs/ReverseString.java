package Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vivek bhardwaj";
		String out="";
		for(int i=s.length()-1;i>=0;i--) {
			out=out+s.charAt(i);
		}
		
		System.out.println(out);
		//System.out.println(String.copyValueOf(as));

	}

}
