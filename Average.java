
public class Average {

	public static void main(String[] args) {
		double a1=72;double b1=200;
		double a2=6;double b2=1;
		double a3=91;double b3=117;
		double d=average(a1,a2,a3);
System.out.println(d);
	}
public static double average(double num1,double num2,double num3){
	double average=(num1+num2+num3)/3;
	return average;
	
}

}
