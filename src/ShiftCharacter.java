
public class ShiftCharacter {
public static void main(String[] args) {
	String input="abcd";
	char arr[]=input.toCharArray();
	/*int index=1;
	for(int i=0;i<arr.length-1;i++) {
		
		arr[i+1]=arr[(i+index)-1];
	}
	arr[arr.length-1]=arr[0];
	for(char c:arr) {
		System.out.println(c);
	}
	System.out.println(arr.toString());
*/
	char last=arr[arr.length-1];
	for(int i=arr.length-1;i>0;i--) {
		arr[i]=arr[i-1];
	}
	arr[0]=last;
	String lasts="";
	for(char c: arr) {
		lasts=lasts+c;
	}
	System.out.println(lasts);
	
	}

	
	
}
