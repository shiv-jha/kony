package p1;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> aList=new ArrayList<Integer>();
		ArrayList<String> aList1=new ArrayList<String>();
		
		aList.add(40);
		aList.add(20);
		aList.add(30);
		//aList.remove(2);
	//	aList.add("hello");
		//aList.set(1, 50);
		System.out.println(aList.contains(3));
	
		//System.out.println(aList.size());
		//System.out.println(aList.get(1));
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
		for(int i=aList.size()-1;i>=0;i--)
		{
			System.out.println(aList.get(i));
		}
	}

}
