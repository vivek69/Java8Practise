package CollectionPackage;

import java.util.Vector;

public class VectorExample {
//vector is synchronized and thread safe i.e only one thread can access vector object
	public static void main(String[] args) {
Vector<String>vc=new Vector<String>();
vc.add("one");
vc.add("two");
vc.add("three");
System.out.println(vc);
	}

}
