package p1;

public class InheritenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child cObj=new Child();
		cObj.add(5, 6);
		cObj.mul(5, 6);
	}
	


}

 class Parent
{
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
}
 
 class Child extends Parent
{
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
}
