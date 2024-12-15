package Interface;

public class SBIClass implements RBIInterface {

	@Override
	public void deposit() {
System.out.println("Deposit with sbi");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw with sbi");
	}
	
	@Override
	public void adharlink() {
		System.out.println("Link your adhar card with account with sbi");
	}
	
	@Override
	public void minBalance() {
		System.out.println("Min Balance shuould be 1000 in sbi");
	}

}
