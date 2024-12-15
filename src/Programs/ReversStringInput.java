package Programs;

public class ReversStringInput {
	/*Input:
		S = i.like.this.program.very.much
		Output: much.very.program.this.like.i */
	public static String reverseWords(String S)
    {
        String[] input=S.split("[.]");
        String output="";
        for(int i=input.length-1;i>=0;i--){
            if(i!=0)
            output=output+input[i]+".";
            else
            output=output+input[i];
        }
        
        
        return output;
    }
	
	public static void main(String[] args) {
	System.out.println(ReversStringInput.reverseWords("i.like.this.program.very.much"));
	}
}
