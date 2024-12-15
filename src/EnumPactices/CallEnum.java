package EnumPactices;

public class CallEnum {
public static void main(String[] args) {
	EnumPractice e=EnumPractice.ONE;
	System.out.println(String.valueOf(EnvType.PROD));
	System.out.println(EnvType.valueOf(String.valueOf(EnvType.PROD)));
	
	System.out.println(EnumPractice.ONE.value);
}
}
