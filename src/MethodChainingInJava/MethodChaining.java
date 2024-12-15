package MethodChainingInJava;

public class MethodChaining {

	public MethodChaining sayGoodMorning() {
		System.out.println("Good morning");
		return this;
	}
	public MethodChaining sayGoodEvening() {
		System.out.println("Good Evening");
		return this;
	}
	
	public static void main(String[] args) {
		MethodChaining chain=new MethodChaining();
		chain.sayGoodMorning().sayGoodEvening();
	}
}
