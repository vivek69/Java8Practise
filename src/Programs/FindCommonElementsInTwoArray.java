package Programs;

import java.util.HashSet;

public class FindCommonElementsInTwoArray {

	public static void main(String[] args) {
String s1[]= {"one","two","three","four","five"};
String s2[]= {"three","four","five","six","seven","Eight"};

HashSet<String>hm=new HashSet<>();
for(int i=0;i<s1.length;i++) {
	for(int j=0;j<s2.length;j++) {
		if(s1[i].equals(s2[j])) {
			hm.add(s1[i]);
		}
	}
}
for (String string : hm) {
	System.out.println(string);
}
	}

}
