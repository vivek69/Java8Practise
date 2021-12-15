package Interface;

public interface InterfaceWithDefaultMethod {
public abstract int getsquare();
default String returnvalue() {
	return "interface default method";
}
}
