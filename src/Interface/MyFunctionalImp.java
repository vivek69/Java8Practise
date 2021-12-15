package Interface;

import sun.applet.Main;

public class MyFunctionalImp{

	
	
	public static void main(String[] args) {
		/*
		 * IMyFunctionalInterface imy=new MyFunctionalImp(); imy.sayHello();
		 */
		
		IMyFunctionalInterface imyone=new IMyFunctionalInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("This is anonymnous functiona");
				
			}
		};
		
		imyone.sayHello();
		
		IMyFunctionalInterface imytwo=()->System.out.println("This is from lambda exp");
		
		imytwo.sayHello();
		
		IMyFunctionalInterface imythre=()->System.out.println("this is lambda exp second times");
		imythre.sayHello();
		
		SumInterfae sumtwo=(int a,int b)->{return a+b;};
		System.out.println(sumtwo.sum(5, 6));
		
		IStringLength sl=(s)->s.length();
		System.out.println(sl.stringLenght("vivek"));
	}

	

	

}
