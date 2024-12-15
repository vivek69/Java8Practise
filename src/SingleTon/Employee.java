package SingleTon;

public class Employee {
	public static Employee e;
private Employee() {
	}

public static Employee getInstance() {
	if(e==null) {
	e=new Employee();
	}
	return e;
}
}
