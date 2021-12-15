package Interface;

public class ImpDefault implements InterfaceWithDefaultMethod {

	@Override
	public int getsquare() {
		// TODO Auto-generated method stub
		return 2*2;
	}
	
	 @Override
	public String returnvalue() {
		// TODO Auto-generated method stub
		//return InterfaceWithDefaultMethod.super.returnvalue();
		 return "Implementing class method";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithDefaultMethod idefault=new ImpDefault();
	System.out.println(idefault.getsquare());
		
		System.out.println(idefault.returnvalue());

	}

}
