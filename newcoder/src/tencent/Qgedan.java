package tencent;

import java.util.LinkedList;
import java.util.Scanner;

public class Qgedan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ks=sc.nextLine();
        int k=Integer.valueOf(ks);
       String str=sc.nextLine();
       //String
       int A=Integer.valueOf(str.split(" ")[0]);
       int X=Integer.valueOf(str.split(" ")[1]);
       int B=Integer.valueOf(str.split(" ")[2]);
       int Y=Integer.valueOf(str.split(" ")[3]);
       
    //   System.out.println(k);
     //  System.out.println(A+" "+X+" "+B+" "+Y+" ");

       Long sum=0l;
       int temp=0;
       int An=0;
       if(A>B)
       {
    	   temp=k%B;
    	
       }else
       {
    	   
       }
       System.out.println((X*Y)%1000000007);
    }
}