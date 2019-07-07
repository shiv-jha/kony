package p1;
public class Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		//A1 objdemo=new A1();
		//objdemo.
		A obj1=new A();
		A obj3=new A();
		A obj4=new A();
		int sum=obj1.add(2,3);
		double sum1=obj1.add(2.9,3.5);
		//System.out.println(sum);
		//System.out.println(sum1);
		B obj2=new B();

		int sum2= obj2.add(4, 5);
		int mul=obj2.multiply(4, 5);
		
	}

}


class A {
	
	public int x=5;
	public static int n=5;
	protected int y=5;
	 int z=7;
	private int spread =3;
	
	public A()
	{
		x=x+1;
		n=n+1;
		System.out.println(x);
		System.out.println(n);
	}
	public int getExchageRate()
	{
	
		return 70+spread;
	}
	//int y=10;
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	double add(double a,double b)
	{
		return a+b;
	}
}


class B extends A
{
	int multiply(int a,int b)
	{
		return a*b;
	}
}