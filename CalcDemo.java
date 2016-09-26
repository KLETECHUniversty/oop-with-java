package ac.in.kletech;

public class CalcDemo {

	public static void main(String[] args) {
	
		Calc aa=new Calc(4,2,60);
		
	int sum;
	int diff;
	int mul;
	double div;
	sum=aa.add();
	diff=aa.difference();
	mul=aa.multiplication();
	div=aa.division();
	
	System.out.println("The sum is:" +sum);
	System.out.println("The difference is:" +diff);
	System.out.println("The multiplication is:" +mul);
	System.out.println("The division is:" +div);
	
	
	

	}

}
