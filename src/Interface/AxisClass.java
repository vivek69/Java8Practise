package Interface;

public class AxisClass implements RBIInterface {

	@Override
	public void deposit() {
		System.out.println("Deposit with axis");
	}

	@Override
	public void withdraw() {
		System.out.println("Deposit with axis");
	}
public static void main(String[] args) {
	RBIInterface rIf=new SBIClass();
	rIf.deposit();
	rIf.withdraw();
	rIf.adharlink();
	rIf.minBalance();
	
	RBIInterface rifo=new AxisClass();
	rifo.deposit();
	rifo.withdraw();
	rifo.adharlink();
	rifo.minBalance();
}
}
