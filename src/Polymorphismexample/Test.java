package Polymorphismexample;

class BaseClass{
	public void Display() {
		System.out.println("Base class display");
	}
}
class FirstDerivedClass extends BaseClass{
	public void Display() {
		System.out.println("First Derived class display");
	}
}
class SecondDerivedClass extends FirstDerivedClass{
	public void Display() {
		System.out.println("Second Derived class display");
	}
}
public class Test {

	public static void main(String[] args) {
SecondDerivedClass sc=new SecondDerivedClass();
sc.Display();
BaseClass bs=new FirstDerivedClass();
bs.Display();
		
	}

}
