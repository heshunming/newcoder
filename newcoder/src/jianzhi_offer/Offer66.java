package jianzhi_offer;

public class Offer66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(movingCount(5,5,5));
	}
	public static int movingCount(int threshold, int rows, int cols)
    {
		int flag[][]=new int[rows][cols];
		
		return helper(0,0,rows,cols,flag,threshold);        
    }
	private static int helper(int i,int j,int rows,int cols,int [][]flag,int threshold)
	{
		if(i<0||j<0||i>=rows||j>=cols||numSum(i)+numSum(j)>threshold||flag[i][j]==1)return 0;
		flag[i][j]=1;
		return helper(i-1,j,rows,cols,flag,threshold)+helper(i+1,j,rows,cols,flag,threshold)
		+helper(i,j-1,rows,cols,flag,threshold)+helper(i,j+1,rows,cols,flag,threshold)+1;
			}
	private static int numSum(int i){
		int sum=0;
		do{
			sum+=i%10;
		}while((i=1/10)>0);
		return sum;
	}

}
