package Interface;

public interface RBIInterface {
public void deposit();
public void withdraw();
public default void adharlink() {
	System.out.println("Link your adhar card with account");
}
public default void minBalance() {
	System.out.println("Min balance should be 1000");
}
}
