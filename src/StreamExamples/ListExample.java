package StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
public static void main(String[] args) {
	List<String>allvalues=Arrays.asList("one","two","three","fourth");
	System.out.println(allvalues.stream().sorted().collect(Collectors.toList()));
	
	List<Integer>allList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	System.out.println(allList.stream().filter(v->v%2==0).collect(Collectors.toList()));
	
	allList.stream().forEach(v->System.out.println(v));
	
	
	System.out.println(allList.stream().map(v->v*v).collect(Collectors.toList()));
	
	System.out.println(allList.stream().min((x,y)->x.compareTo(y)).get());
	System.out.println(allList.stream().max((x,y)->x.compareTo(y)).get());
	
	
	
	//count method
	
	List<String>allandNull=Arrays.asList("ABC","","Ayz","","DEF","GHI","JLK","");
	System.out.println("total count "+allandNull.stream().filter(e->e.isEmpty()).count());
	
	System.out.println(allandNull.stream().filter(e->e.startsWith("A")).count());
	
	List<String>notNull=allandNull.stream().filter(e-> !e.isEmpty()).collect(Collectors.toList());
	
	System.out.println(notNull);
}
}
