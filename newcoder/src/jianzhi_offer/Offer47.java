package jianzhi_offer;

public class Offer47 {
//不能用*、/、if、else、which、while、switch等，可以利用逻辑运算中短路特性
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sum_Solution(6));
	}
	public static int Sum_Solution(int n) {
		int sum=0,start=1;
		boolean value=(n!=0)&&start==(sum=Sum_Solution(n-1));
		sum+=n;
		return sum;        
    }

}
