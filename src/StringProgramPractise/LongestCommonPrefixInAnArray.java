package StringProgramPractise;

public class LongestCommonPrefixInAnArray {
	 public static String longestCommonPrefix(String arr[], int n){
	       String finalString="";
	       String firstString=arr[0];
	       boolean flag=false;
	       if(n!=1) {
	       for(int j=0;j<firstString.length();j++){
	       for(int i=1;i<n;i++){
	           if(j<arr[i].length()  &&    firstString.charAt(j)==arr[i].charAt(j))
	           {
	              flag=true; 
	           }else{
	              flag=false; 
	              break;
	           }
	       }
	       if(flag){
	           finalString=finalString+firstString.charAt(j);
	       }else {
	    	   break;
	       }
	       flag=false;
	    }
	    if(finalString.length()<=0)
	    {
	        return "-1";
	    }else{
	        return finalString;
	    }
	       }else {
	    	   return  arr[0];
	       }
	    }
public static void main(String[] args) {
	String arr[]= {"abcdefgh","abcd","abcdefg"};
	System.out.println(LongestCommonPrefixInAnArray.longestCommonPrefix(arr, 3));
}
}
