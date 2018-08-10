package jianzhi_offer;

public class Offer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쳲��������У�ע��f(n)=f(n-1)+f(n-2)��f(0)=0.f(1)=f(2)=1
	}
	 public int Fibonacci(int n) {

	        if(n==0) {
	            return 0;
	        }
	        if(n==1||n==2)
	        {
	            return 1;
	        }
	        return Fibonacci(n-1)+Fibonacci(n-2);
	    }

}
