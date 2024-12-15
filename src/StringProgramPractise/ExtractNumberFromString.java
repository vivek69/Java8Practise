package StringProgramPractise;

public class ExtractNumberFromString {

	long ExtractNumber(String S){
        //code here
        String[] all=S.split(" ");
        int i=0;
        for(String value:all){
            if(NumberUtils.isParsable(value)){
                if(hasDigit(value,9)){
                    if(Integer.parseInt(value)>i){
                        i=Integer.parseInt(value);
                    }
                }
            }else{
                
            }
        }
    
    
      if(i==0){
        System.out.print(-1);
    }else{
        System.out.print(i);}}
    
    public boolean hasDigit(String s, int digitvalue){
        int value=Integer.parseInt(s);
        while(value>0){
            if(value%10==digitvalue){
                return true;
               
            }
            value=value/10;
            }
            return false;
        }
  
}
