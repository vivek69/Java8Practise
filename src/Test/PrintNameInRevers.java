package Test;

public class PrintNameInRevers {
public static void main(String[] args) {
	String name="vivek";
	String reverseName="";
	for(int i=name.length();i>=0;i--) {
		reverseName=reverseName+name.charAt(i);
	}
	System.out.println(reverseName);
}

}
