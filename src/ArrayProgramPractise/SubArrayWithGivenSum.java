package ArrayProgramPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {
	
	//here we use labeled break statement
public static void main(String[] args) {
	List<Integer>newvalue=new ArrayList<>();
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int s=15;
	int l = 0,m=0;
	boolean flag=false;
	labelforsum:{
	for(int i=0;i<a.length;i++) {
		int sum=a[i];
		for(int j=i+1;j<a.length-1;j++) {
			sum=sum+a[j];
			if(sum==s) {
				l=i;
				m=j;
				flag=true;
				break labelforsum;
			}
		}
	}
	}
	if(flag) {
		System.out.println(Arrays.asList(l+1,m+1));
	}else {
		System.out.println("-1");
	}
}
}
