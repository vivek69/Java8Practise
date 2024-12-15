package ArrayProgramPractise;

import java.util.*;

public class CreateLargeNumberFromArrays {

	public static void main(String[] args) {
int a[]= {3,45,23,89,9,6};

String arr[]=new String[a.length];
for(int i=0;i<a.length;i++) {
	arr[i]=a[i]+"";
}
   Arrays.sort(arr,(c,d)->{
	   long n1=Long.parseLong(c+d);
	   long n2=Long.parseLong(d+c);
	   
	   if(n1>n2)
		   return 1;
	   else if(n1<n2)
		   return -1;
	   else
		   return 0;
   });
   
   StringBuilder sb=new StringBuilder("");
   
   for(int j=arr.length-1;j>=0;j--) {
	   sb.append(arr[j]);
   }
System.out.println(sb.toString());
}
}
