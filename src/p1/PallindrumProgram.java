package p1;


public class PallindrumProgram {

	public static void main(String[] args) {
		
		String test="madam";
		boolean matches=true;
		
		//1st way for pallindrum check
		StringBuffer sbf=new StringBuffer(test);
		String testReverse=sbf.reverse().toString();
		if(test.equals(testReverse))
		{
			System.out.println("String is pallindrum");
		}
		else
		{
			System.out.println("not a pallindrum");
		}
			
		//second way
		for(int i=0;i<test.length()/2;i++)
		{
			if(test.charAt(i)==test.charAt(test.length()-(i+1)))
			{
				
			}
			else
			{
				matches=false;
				break;
			}
		}
		if(matches==true)
		{
			System.out.println("String is pallindrum");
		}
		else
		{
			System.out.println("String is not pallindrum");
		}
		

	}

}
