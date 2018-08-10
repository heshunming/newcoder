package jianzhi_offer;

import java.util.ArrayList;
import java.util.List;

public class Offer19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a={{1,2,3,4,5,6},{7,8,9,10,11,12}};
		printMatrix(a);
		
	}
	 public static ArrayList<Integer> printMatrix(int [][] matrix) {
		
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 print(matrix,0,matrix.length-1,0,matrix[0].length-1,arr);
		 return arr;	       
	 }
	 public static void print(int [][] matrix,int row_start,int row_end,int col_start,int col_end,ArrayList<Integer> arr)
	 {		
		 
		 int run_row_start=row_start,run_row_end=row_end,run_col_start=col_start,run_col_end=col_end;
		 if(row_start>col_end||col_start>col_end)
		 {
			 return ;
		 }
		 if(row_start==row_end&&col_start<=col_end)
		 {
			 while(col_end-col_start>=0)
			 {
				 arr.add(matrix[row_start][col_start]);	
				 col_start++;
			 }
			
			 return ;
		 }
		 
		 if(col_start==col_end&&row_start<=row_end)
		 {
			 while(row_end-row_start>=0)
			 {
				 arr.add(matrix[row_start][col_start]);	
				 row_start++;
			 }
			
			 return ;
		 }
		// int row=start;
		// int col=start;
		 System.out.println("�����У�"+run_col_start+":������"+run_row_start+" "+"    �У�"+col_start+"�У�"+row_start+"   ");
		 for(int i=run_col_start;i<=col_end;i++)
		 {  
			 if(i!=run_col_start)
				 run_col_start++;
			 arr.add(matrix[run_row_start][i]);
		 }
		
		 row_start++;
		 run_row_start++;
		 System.out.println("�����У�"+run_col_start+":������"+run_row_start+" "+"    �У�"+col_start+"�У�"+row_start+"   ");
		 for(int j=run_row_start;j<=row_end;j++)
		 {	 
			 if(j!=run_row_start)
				 run_row_start++;
			 arr.add(matrix[j][run_col_start]);
		 }
		 System.out.println("colstart:"+col_start);
		 run_col_start--;
		 col_end--;
		 System.out.println("�����У�"+run_col_start+":������"+run_row_start+" "+"    �У�"+col_start+"�У�"+row_start+"   ");
		 for(int m=run_col_start;m>=col_start;m--)
		 {  
			 if(m!=run_col_start)
				 run_col_start--;
			 arr.add(matrix[run_row_start][m]);
			// System.out.print("   run_row_start:"+run_row_start+",m:"+m);
		 }
		// System.out.println(run_col_start+":��"+run_row_start+" ");
		 run_row_start--;
		 row_end--;
		 System.out.println("col_end:"+col_end);
		 System.out.println("�����У�"+run_col_start+":������"+run_row_start+" "+"    �У�"+col_start+"�У�"+row_start+"   "+col_end+"�У�"+row_end);
		 
		 if(run_row_start<row_start)
		 {
			 return;
		 }
		 for(int n=run_row_start;n>=row_start;n--)
		 {
			 if(n!=run_row_start)
			 run_row_start--;
			 arr.add(matrix[n][run_col_start]);
		 }
		 col_start++;
		 System.out.println("123�����У�"+run_col_start+":������"+run_row_start+" "+"    �У�"+col_start+"�У�"+row_start+"   ");
		 print(matrix, row_start,row_end,col_start,col_end,arr);
		 
		 //return arr;
	 }

}
