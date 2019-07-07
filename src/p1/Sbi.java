package p1;

public class Sbi implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj;
		obj=new Sbi();
		obj.witdraw(500);
	}
int balance=1000;
	@Override
	public void witdraw(int amount) {
		// TODO Auto-generated method stub
		balance=balance-amount;
		System.out.println("remaining balance is "+balance);
		
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		System.out.println("remaining balance is "+balance);
	}

}
