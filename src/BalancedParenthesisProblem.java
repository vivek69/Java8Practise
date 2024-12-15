import java.util.Stack;
//https://www.youtube.com/watch?v=uuE2pEjLiEI
public class BalancedParenthesisProblem {
	public static void main(String[] args) {
		String input="{[()]})";
		
		Stack<Character>st=new Stack<>();
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}else if(ch==')') {
				boolean var=handleClosing(st,'(');
				if(var==false) {
					System.out.println(false);
					return;
				}
			}else if(ch=='}') {
				boolean var=handleClosing(st,'{');
				if(var==false) {
					System.out.println(false);
					return;
				}
			}else if(ch==']') {
				boolean var=handleClosing(st,'[');
				if(var==false) {
					System.out.println(false);
					return;
				}
			}else{
				
			}
		}
		if(st.size()==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static boolean handleClosing(Stack<Character>st,char ch) {
		if(st.size()==0) {
			return false;
		}else if(st.peek()!=ch) {
			return false;
		}else {
			st.pop();
			return true;
		}
	}

	

}
