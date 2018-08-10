package jianzhi_offer;

public class Offer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(NumberOf1(-1));
	}
	 public static int NumberOf1(int n) {
		 
		 int count=0;
		 while(n!=0)
		 {
			 count+=1;
			 n=n&(n-1);
		 }
		 return count;
	}

}
