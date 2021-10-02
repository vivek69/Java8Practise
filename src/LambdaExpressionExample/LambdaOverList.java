package LambdaExpressionExample;

import java.util.Arrays;
import java.util.List;

public class LambdaOverList {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<String> ab=Arrays.asList("this","is");
	
	ab.forEach(p->System.out.println(p));

}
}
