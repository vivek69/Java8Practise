package ScenarioClear;

public class Child extends Parent {
int x=20;
	public void test() {
		System.out.println("This is test from child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Child();

p.test();
System.out.println(p.x);
	}

}
