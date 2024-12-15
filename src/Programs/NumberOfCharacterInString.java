package Programs;

import java.util.HashMap;
import java.util.HashSet;

public class NumberOfCharacterInString {
	//Input:str = aaaabbbccc
		//	Output: a4b3c3
	public static String encode(String str)
	{
        char[] input=str.toCharArray();
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        HashSet<Character>hset=new HashSet<Character>();
        for(int i=0;i<input.length;i++){
        	if(hset.add(input[i])) {
            for(int j=i;j<input.length;j++){
                if(input[i]==input[j]){
                    if(!hm.containsKey(input[i])){
                        hm.put(input[i],1);
                    }else{
                        hm.put(input[i],hm.get(input[i])+1);
                    }
                }
            }
        	}
        }
        String output="";
        for(char c: hm.keySet()){
            output=output+Character.toString(c)+Integer.toString(hm.get(c));
        }
        return output;
	}
	public static void main(String[] args) {
	//	System.out.println(NumberOfCharacterInString.encode("hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac"));
		System.out.println(NumberOfCharacterInString.encode("abbaaacbcc"));
	}
}
