package jianzhi_offer;

public class Offer9 {
//������̨�ף�һ�ο��Ե�1��n��̨��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int JumpFloorII(int target)
    {
		
       int f[]=new int[target];
       return JumpFloorII(target, f);
    }
	public int JumpFloorII(int target,int f[])
    {
		
        	int n=target,num=0;
			if (target <= 0) {
				return -1;
			} else if (target == 1) {
				return 1;
			} else if (target ==2) {
				return 2;
			} 
			if(f[target]!=0)return f[target];
			while((n-1)>0)
			{              
				num+=JumpFloorII(n-1,f);
                n--;
			}
            if(target>2)num+=1;
            f[target]=num;
			return num;
		
    }
	

}
