package algorothm;

public class EightQuence2 {

	static int  N=8;
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Q=new int[N][N];
		Queen(0,Q);
		System.out.println(count);
	}
	static void Queen(int j, int Q[][])
    {
        if(j == N)  //j从0开始一步一步往右边逼近，当到达N时，前面的都已放好。
        {
            //得到一个解，输出数组Q
        	for(int i=0;i<N;i++){
        		for(int k=0;k<N;k++){
        			if(Q[i][k]==1)
        				System.out.print(k+1);
        		}
        	}
        	System.out.println();
        	count++;
            return;
        }

        //对j列的每一行进行探测，看是否能够放置皇后
        for(int i=0; i<N; ++i)  //i表示行，j表示列
        {
            if(isCorrect(i,j,Q))  //如果可以在i行，j列中放置皇后(判断同行同列斜线上是否已有皇后)
            {
                Q[i][j] = 1;     //放置皇后
                Queen(j+1,Q);    //深度递归，继续放下一列
                Q[i][j] = 0;     //回溯
            }
        }
    }
	private static boolean isCorrect(int i, int j, int[][] Q) {
		for(int k=0;k<Q.length;k++)if(Q[i][k]==1||Q[k][j]==1)return false;//判断是否在同一行或者同一列
		int starti,startj;
		if(i>j){
			starti=i-j;
			startj=0;
			}else{
			startj=j-i;
			starti=0;
		}
		for(;starti<Q.length&&startj<Q[0].length;starti++,startj++)if(Q[starti][startj]==1)return false;
		return true;
	}

}
