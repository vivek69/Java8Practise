package OutPut;

public class BooleanOutput {
public static void main(String[] args) {
	Boolean b1=new Boolean("true");//true
	Boolean b2=new Boolean("TrUe");//true
	System.out.println(b1.equals(b2));
	
	Boolean b3=new Boolean("test");//other than true it gives false
	Boolean b4=new Boolean(true);//true
	System.out.println(b3.equals(b4));//flase.equals(true)=false
	String s="test";
	System.out.println(s.equalsIgnoreCase("true"));
}
}
