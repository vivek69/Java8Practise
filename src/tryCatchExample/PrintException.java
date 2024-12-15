package tryCatchExample;

public class PrintException {
	public static void main(String[] args) {
	try {
		int x=10/0;
		System.out.println("1");
	}catch(Exception e) {
		//e.printStackTrace();//this will print exception name,description and error occur on line
		System.out.println(e);//will print exception name and description
		//System.out.println(e.getMessage());// will print onle description
		//System.out.println("Exception found "+e);
		System.out.println("3");
	}
}
}