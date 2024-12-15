package Programs;

import java.util.HashMap;

public class CheckFrequencyAreEquals {
	public static void main(String[] args) {
		

	String s = "xyz";
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
    for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i))){
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
            else{
                  hm.put(s.charAt(i),1);
            }
        }
    int len=hm.get(s.charAt(0));
    boolean flag=false;
    for(Character k:hm.keySet()) {
    	if(len==hm.get(k)) {
    		
    	}else {
    		//System.out.println("frequency are not same ");
    		flag=true;
    		break;
    	}
    	//System.out.println("frequency are same");
    	
    }
    if(flag) {
    	System.out.println("frequency are not same ");
    }else {
    	System.out.println("frequency are same");
    }
    }
	
}



