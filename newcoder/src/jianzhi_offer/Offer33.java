package jianzhi_offer;
import java.util.ArrayList;
public class Offer33 {

	public static void main(String[] args) {		
		System.out.println(GetUglyNumber_Solution(7));
	}
	public static int GetUglyNumber_Solution(int index) {
        int index2=0,index3=0,index5=0,min = 1;
        ArrayList<Integer>list=new ArrayList<>();        
        if(index==1)        
        	return 1;        
        list.add(1);
        while(list.size()<index){        	
        	int m2=2*list.get(index2);
        	int m3=3*list.get(index3);
        	int m5=5*list.get(index5);
        	min=Integer.min(m2, Integer.min(m3, m5));
        	if(!list.contains(min))list.add(min);
        	if(min==m2)index2++;
        	if(min==m3)index3++;
        	if(min==m5)index5++;
        }
		return list.get(list.size()-1);
    }
}
