package p1;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String first="Seleniumtraining";
		String second="Selenium";
		System.out.println(first.length());
		System.out.println(first.charAt(3));
		System.out.println(first.substring(0, 5));
		System.out.println(first.indexOf("l"));
		System.out.println(first.concat("test"));
		System.out.println(first.contains(second));
		System.out.println(first.endsWith("g"));
		System.out.println(first.equalsIgnoreCase("seleniumtraining"));
		System.out.println(first.equals("seleniumtraining"));
		System.out.println(first.indexOf("i", 6));
		System.out.println(first.isEmpty());
		System.out.println(first.lastIndexOf("i"));
		System.out.println(first.replace("m", "n"));
		
		System.out.println(first.trim());
		String third="Selenium training day 2";
		String[] x = third.split(" ");
		for (int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
	}
	
	}


