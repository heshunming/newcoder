package jianzhi_offer;
import java.util.ArrayList;
import java.util.Collections;
//重新走一遍归并算法，并且在归并的过程中利用一个count计数，数组调整一次count加1.最后输出count值就是逆序数的总数。
public class Offer35 {
	public static void main(String[] args) {		
		int[] arr={1,2,3,4,6,7,10,0,12,5};			
		System.out.println(InversePairs(arr));		
	}
	public static int InversePairs(int [] array) {		
		int[] tmpArray=new int[array.length];
		int count=mergeSort(array,tmpArray,0,array.length-1);
		return count;
    }	
	private static int merge(int[]a,int[]tmp,int leftPos,int rightPos,int rightEnd)
	{
		int leftEnd=rightPos-1;
		int tmpPos=leftPos;
		int numElements=rightEnd-leftPos+1;
		long count=0;
		while(leftPos<=leftEnd&&rightPos<=rightEnd)
		{
			if(a[leftPos]<=a[rightPos])			
				tmp[tmpPos++]=a[leftPos++];				
			else
			{
				tmp[tmpPos++]=a[rightPos++];
				count+=leftEnd-leftPos+1;
			}
		}
		while(leftPos<=leftEnd)		
			tmp[tmpPos++]=a[leftPos++];		
		while(rightPos<=rightEnd)		
			tmp[tmpPos++]=a[rightPos++];		
		for(int i=0;i<numElements;i++,rightEnd--)		
			a[rightEnd]=tmp[rightEnd];		
		if(count>1000000007)count=count%1000000007;
			return (int)count;
	}
	private static int mergeSort(int []a,int[] tmpArray,int left,int right)
	{
		int countleft=0,countright=0,countmid=0;
		if(left<right)
		{
			int center=(left+right)/2;
			countleft=mergeSort(a, tmpArray, left, center);
			countright=mergeSort(a,tmpArray,center+1,right);
			countmid=merge(a,tmpArray,left,center+1,right);
		}
		return (countleft+countright+countmid)%1000000007;
	}	

}
