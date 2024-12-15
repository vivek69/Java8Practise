package StringProgramPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SentenceIntoItseEquivalentMobileNumericKeypadSequence {
public static void main(String[] args) {
	//Given a sentence in the form of a string in uppercase, convert it into its equivalent mobile numeric keypad sequence.
//https://practice.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/1/?page=1&category[]=Strings&curated[]=1&sortBy=submissions#

	String s = "HEY U";
/*			Output: 43334*/

	Map<String,String>hm=new HashMap<String,String>();
    hm.put("2","ABC");
        hm.put("3","DEF");
            hm.put("4","GHI");
                hm.put("5","JKL");
                    hm.put("6","MNO");
                        hm.put("7","PQRS");
                            hm.put("8","TUV");
                                hm.put("9","WXYZ");
                                    hm.put("0"," ");
                 String finalvalue="";                   
    for(int i=0;i<s.length();i++) {
    	for(Map.Entry<String, String> entry : hm.entrySet()) {
    		if(entry.getValue().contains(""+s.charAt(i))) {
    			for(int m=0;m<entry.getValue().length();m++) {
    				finalvalue=finalvalue+entry.getKey();
    				if(entry.getValue().charAt(m)==s.charAt(i)) {
    					break;
    				}
    			}
    			
    		}
    		
    	}
    }
    
    System.out.println(finalvalue);
}
}
