
public class VaalidatePassword {

	public static void main(String[] args) {
		String pass="TEST1#";
		int num=0;
		int lower=0;
		int upper=0;
		int special=0;
		if(pass.length()<6) {
		
			System.out.println("Password is invalid and length should greater than 6");

	}else {
		for(int i=0;i<pass.length();i++) {
			int asciivalue=(char)pass.charAt(i);
			//System.out.println(asciivalue);
			if(asciivalue>=48 && asciivalue<=57) {
				num++;
			}else if(asciivalue>=65 && asciivalue<=90){
				upper++;
				
			}else if(asciivalue>=97 && asciivalue<=122) {
				lower++;
			}
				else {
					special++;
				}
			}
		}
		if(num>=1 && upper>=1 && lower>=1 && special>=1) {
			System.out.println("Valid");
		}else {
			System.out.println("not valid");
		}
	}
	}

