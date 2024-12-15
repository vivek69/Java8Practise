package Programs;

public class ModifiedStringAtThreeConsecutiveSameCharacters {
	public static long modified(String a)
    {
		{
		       int n=a.length();
		       int count=0;
		        for(int i=0;i<n-2;i++){
		           int j=i+1;
		           int k=i+2;
		           if(a.charAt(i)==a.charAt(j) && a.charAt(i)==a.charAt(k)){
		                count++;
		                i++;
		           }
		                
		        }  
		        return count;
		   }
    }
	public static void main(String[] args) {
		System.out.println(ModifiedStringAtThreeConsecutiveSameCharacters.modified("aabbbccc"));
	}
}
