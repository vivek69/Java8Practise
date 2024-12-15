
public class ConvertStringToInteger {

	public static void main(String[] args) {
int flag=0;
		String input="12a";
		String finalvalue="";
		int j=0;
		if(input.charAt(0)=='-') {
			j=1;
		}else {
			
		}
		int finalint=0;
		for(int i=j;i<input.length();i++) {
			int asci=(char)input.charAt(i);
			if(asci>=48 && asci<=57) {
				finalint=finalint*10+input.charAt(i)-'0';
			}else {
				flag=-1;
				break;
			}
		}
		
		if(flag==-1) {
			System.out.println("-1");
		}else if(j==1){
			System.out.println(-1*finalint);
		}else {
			System.out.println(finalint);
		}
	}

}
