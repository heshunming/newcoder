package tencent;

import java.util.Scanner;

public class Fanzhuanshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str=sc.nextLine();
      Long n=Long.valueOf(str.split(" ")[0]);
      Long m=Long.valueOf(str.split(" ")[1]);
        //System.out.println(n+" "+m);
       Long sum=0L;
//       for(Long i=1L;i<=n;i++)
//       {
//    	   sum+=(long) (i*Math.pow((-1), ((i-1)/m+1)));
//       }
//       System.out.println((Long)n*m/2l);
       System.out.println((Long)n*m/2l);
    }
}