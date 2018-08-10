package jianzhi_offer;

public class Offer30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,-8,3,4,9,-1};
		System.out.println(FindGreatestSumOfSubArray(array));
	}
	
	 public static int FindGreatestSumOfSubArray(int[] array) {		
		int i,len=array.length,maxsum,maxhere;
		maxsum=maxhere=array[0];
		for(i=1;i<len;i++)
		{
			if(maxhere<=0)
			{
				maxhere=array[i];
			}else
				maxhere+=array[i];
			if(maxhere>maxsum)
			{
				maxsum=maxhere;
			}
		}
		 return maxsum;	        
	  }
	 public static int FindGreatestSumOfSubArray2(int[] array,int l,int r) 
	 {
		 if(l==r)
			 return array[l];
		 if(l>r)
			 return 0;
		 int mid=(l+r)/2;	
		 int lmax=array[mid-1],lsum=0;
		 for(int i=mid-1;i>=l;i--)
		 {
			 lsum+=array[i];
			 if(lsum>lmax)
			 {
				 lmax=lsum;
			 }
		 }	 
		 int rmax=array[mid],rsum=0;
		 for(int i=mid;i<r;i++)
		 {
			 rsum+=array[i];
			 if(rsum>rmax)
			 {
				 rmax=rsum;
			 }
		 }
		 return max(lmax+rmax,FindGreatestSumOfSubArray2(array,l,mid-1),FindGreatestSumOfSubArray2(array,mid,r));
	 }
	private  static int max(int i, int j, int k) {
		int max123=i;
		if(j>max123)
			max123=j;
		if(k>max123)
		{
			max123=k;
		}

		return max123;
	}

}
