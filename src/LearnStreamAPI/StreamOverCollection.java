package LearnStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamOverCollection {

	public static void main(String[] args) {
	List<Integer>list1=Arrays.asList(2,32,33,44,50,68,89,7);
	System.out.println(list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
	System.out.println("with for each");
	list1.stream().filter(i -> i > 40).forEach(i -> System.out.println(i));
	Stream<Integer> stream1 = list1.stream();
	stream1.forEach(e -> {System.out.println(e);});
	String []ar= {"ab","cd","ef","gh"};
	Arrays.stream(ar).forEach(e -> System.out.println(e));
	

	}

}
