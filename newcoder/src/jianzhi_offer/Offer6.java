package jianzhi_offer;

public class Offer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minNumberInRotateArray(int [] array) {
		
		if(array.length==0)
		{
			return 0;
		}
		int e1=array[0];
		boolean eq=true;
		for(int e:array)
		{
			if(e!=e1)
			{
				eq=false;
				break;
			}
		}
		if(eq)
		{
			return e1;
		}else
		{
			int min=e1;
			for(int e:array)
			{
				if(e<min)
				{
					min=e;
				}
			}
			return min; 
		}
		       
    }

}
