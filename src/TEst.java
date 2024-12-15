
public class TEst {
public static void main(String[] args) {
	int []a= {2,6,11,16,20};
	int number=a[0];
	for(int i=0;i<a.length;i++) {
		if(number!=a[i]) {
			number++;
			System.out.println(number);
		}else {
			number++;
		}
	}
}
}
