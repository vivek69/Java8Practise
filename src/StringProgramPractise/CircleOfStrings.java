package StringProgramPractise;

public class CircleOfStrings {

	public static void main(String[] args) {
String arr[] = {"for", "geek", "rig", "kaf"};
boolean flag=false;
int count=0;
for(int i=0;i<arr.length;i++) {
	int j=i+1;
	if(j<arr.length) {
		if(arr[i].charAt(arr[i].length()-1)==arr[j].charAt(0)) {
			flag =true;
			count++;
			System.out.println(count);
		}else {
			flag=false;
			break;
		}
			
	}else if(j==arr.length && arr[j].charAt(arr[j].length()-1)==arr[0].charAt(0)){
		count++;
		
	}
	
}
if(count==arr.length) {
	System.out.println(count);
	System.out.println("String can be chained together!!");
}else {
	
	System.out.println("Can not chain together!!");
}
	}

}
