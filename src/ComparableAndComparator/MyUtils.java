package ComparableAndComparator;

import java.util.ArrayList;

public class MyUtils {
public static <T>void iterateList(ArrayList<T> myArrayList){
	for(T temp:myArrayList) {
		System.out.println(temp);
	}
}
}
