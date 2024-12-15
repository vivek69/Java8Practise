package Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Winner {
	  public static String[] winner(String arr[], int n)
	    {
	        HashMap<String,Integer>hm=new HashMap<String,Integer>();
	        HashSet<String>hmset=new HashSet<String>();
	       
	       for(String strvalue:arr) {
	    	   if(hm.keySet().contains(strvalue)) 
	    		   hm.put(strvalue, hm.get(strvalue)+1);
	    		   else
	    			   hm.put(strvalue, 1);
	       }
	        int maxVlaueInMap=0;
	        String winner="";
	        for(Map.Entry<String, Integer>entry:hm.entrySet())
	        {
	        	String key=entry.getKey();
	        	Integer val=entry.getValue();
	        	if(val>maxVlaueInMap) {
	        		maxVlaueInMap=val;
	        		winner=key;
	        	}else if(val==maxVlaueInMap && winner.compareTo(key)>0) {
	        		winner =key;
	        	}
	        	
	        }
			return new String[] {winner,String.valueOf(maxVlaueInMap)};
	    }
	
public static void main(String[] args) {
	
}
}
