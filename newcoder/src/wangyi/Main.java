package wangyi;

import java.util.Scanner;

class Point{
    int px;
    int py;
    boolean visited;

    public Point(int px, int py) {
        this.px = px;
        this.py = py;
        this.visited = false;
    }

    public int getLength(Point p){
        return Math.abs(px - p.px) + Math.abs(py - p.py);
    }
}

public class Main {
    static final Point START = new Point(0,0);
    static int minpath = Integer.MAX_VALUE;

    public static int calculate(Point point,Point[] points,int sum,int count){
    for(int i=0;i<points.length;i++){
            if(points[i].visited==false){
                points[i].visited=true;
                count++;
                sum +=point.getLength(points[i]);
                if(count==points.length){
                    sum+=points[i].getLength(start);
                    if(sum<min){
                        min = sum;
                    }
                }
                calculate(points[i],points,sum,count);
                points[i].visited=false;
                sum-=point.getLength(points[i]);
                count--;
            }
    }
    return min;
}
private static int min =1000;
public static final Point start = new Point(0,0);

    public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
    	int n=Integer.valueOf(scan.nextLine());
    	
        Point[] points=new Point[n];
        int k=n;
        while(k-->0){
        	int i=0;
        	int j=0;
        	String s=scan.nextLine();
        	String []str=s.split(",");
        	i=Integer.valueOf(str[0]);
        	j=Integer.valueOf(str[1]);
        	points[n-k-1]=new Point(i,j);
        	
        }
       
        int min = calculate(START, points, 0, 0);
        System.out.println(min);
    }
}