package p1;

public class LoopingExample {

	
	
	public static void main(String[] args) {
		int number=10;
		int fact=1;
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
			sum=sum+i;
		}
		System.out.println("factorial is "+fact);
		System.out.println("avg is "+sum/number);

	}

}
