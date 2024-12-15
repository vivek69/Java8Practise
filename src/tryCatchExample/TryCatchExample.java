package tryCatchExample;

public class TryCatchExample {
public static void main(String[] args) {
	try {
		int x=10/0;
		System.out.println("1");
	}finally {
		System.out.println("5");
	}
	/*catch(Exception e) {
		System.out.println("Exception found "+e);
		System.out.println("3");
	}*/
	System.out.println("2");
}
}
