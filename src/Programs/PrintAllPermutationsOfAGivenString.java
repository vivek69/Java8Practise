package Programs;

import java.util.Scanner;
//https://www.youtube.com/watch?v=rRDWB8cqyLQ
//https://www.youtube.com/watch?v=DctpegvNgRM
//https://www.youtube.com/watch?v=sPAT_DbvDj0&t=359s
public class PrintAllPermutationsOfAGivenString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	permutations(input,"");
}
public static void permutations(String str,String finalString) {
	if(str.length()==0) {
		System.out.println(finalString);
		return;
	}
	
	for(int i=0;i<str.length();i++) {
		
		char ch=str.charAt(i);
		String left=str.substring(0,i);
		String right=str.substring(i+1);
		String res=left+right;
		permutations(res, finalString+ch);
		
	}
	
}
	
	
	
	/*
	String as="abc";
PrintAllPermutationsOfAGivenString.permute(as, 0, as.length()-1);	
}

public static void permute(String s,int l,int r) {
	if(l==r) {
		System.out.println("final "+s);
		return;
	}
	for(int i=l;i<=r;i++) {
		System.out.println(i+" -- "+ l +" -- "+r);
		s=swap(s,l,i);
		System.out.println(s);
		permute(s,l+1,r);
		s=swap(s,l,i);
	}
}

private static String swap(String s, int l, int i) {
   char[] charAr=s.toCharArray();
   char temp=charAr[l];
   charAr[l]=charAr[i];
   charAr[i]=temp;
	return new String(charAr);
}*/
}
