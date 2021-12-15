package Programs;

public class FindallpairsofelementsinJavaArraywhoseSumisEqualtoagivenNumber {

	public static void main(String[] args) {
    int givenNumber=12;
    int[] givenArray= {2,7,5,8,6,5,4,2,8,9,1,3};
    
    for(int i=0;i<givenArray.length;i++) {
    	for(int j=i+1;j<givenArray.length;j++) {
    		if(!(i==j)) {
    			if((givenArray[i]+givenArray[j])==givenNumber) {
    				System.out.println("Pair  "+givenArray[i]+" , "+givenArray[j]);
    			}
    		}else {
    			break;
    		}
    	}
    }
	}

}
