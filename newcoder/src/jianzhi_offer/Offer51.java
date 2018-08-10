package jianzhi_offer;
//O（n^2）复杂度，复杂度太高
public class Offer51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		multiply(arr);
	}
	 public static int[] multiply(int[] A) {		 
		 int[] B=new int[A.length];	
		 B[0]=1;
		 for(int i=1;i<A.length;i++)
			 	B[i]=B[i-1]*A[i-1];
		 int valueA=1;		 
		 for(int i=A.length-2;i>=0;i--){
			 valueA*=A[i+1];
			 B[i]*=valueA;
		 }	 		
		 return B;
	 }

}
