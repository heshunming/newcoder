package jianzhi_offer;

import java.util.Scanner;

/**
 * @author mingming
 *
 */
public class Offer1 {
//二叉树组的查找
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner cin = new Scanner(System.in);   
	//	String str=cin.nextLine();
		System.out.println(new Integer(2)==2 );		 
	}
	
	/**
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int [][] array) {

		int row=0;
		int col=array[0].length-1;
		while(row<array.length&&col>=0 )
		{
			if(array[row][col]<target)
			{
				row++;
			}else if(array[row][col]>target)
			{
				col--;
			}else
			{
				return true;
			}
		}
		return false;
	}

}
