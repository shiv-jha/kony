package p1;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//1st way of declaration
		int[][] arr=new int[5][3];
		
		//1st way of declaration(declare+initialize)
		int[][] empDeptAge= {{10,20,30},{40,23,24},{45,56,64}};
		System.out.println(empDeptAge[0].length);
		
		for(int i=0;i<empDeptAge.length;i++)
		{
			for(int j=0;j<empDeptAge[i].length;j++)
			{
				System.out.println(empDeptAge[i][j]);
			}
		}
	}

}
