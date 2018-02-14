
public class LeastNumbers {

	public static void main(String[] args) {
		int a1=82;int a2=64;
		int b1=221;int b2=2;
		int c1=31;int c2=18;
		int d= leastNumbers(a1,a2);
		System.out.println(d);
		System.out.println(leastNumbers(b1,b2));
		System.out.println(leastNumbers(c1,c2));
	}
	public static int leastNumbers(int num1,int num2){
if(num2<num1){
return num2;
}
else{
	return num1;
}

}
	}


