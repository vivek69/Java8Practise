package Programs;

public class RightMove {
public static void main(String[] args) {
	String str="abcd";
	int d=1;
	
	 String ans = str.substring(str.length()-d) + str.substring(0, (str.length()-d));
	 System.out.println(ans);
}
}
