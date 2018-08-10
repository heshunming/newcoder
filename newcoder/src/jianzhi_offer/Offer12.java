package jianzhi_offer;

public class Offer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(1.2,-12));
	}
	 public static double Power(double base, int exponent) {
		 
		 
		 if(exponent==0) return (double)1;	
		 if(exponent>0){   		 	
	        return base*Power(base,exponent-1);
	        }else
	        {
	        	//if(exponent==0) return (double)1;
		        return 1/Power(base,-exponent);
	        	
	        }
	  }

}
