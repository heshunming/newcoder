package wangyi;

import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;
//ţ�������ϳ���
public class Hechangtuan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //������
            int n = sc.nextInt();
            //ѧ������ֵ���飬��i����ֱ�Ӷ�Ӧarr[i]
            int[] arr = new int[n + 1];
            //��ʼ��
            for (int i = 1; i <= n; i++) {//��ֱ�Ӷ�Ӧ����
                arr[i] = sc.nextInt();
            }
            //ѡ���ѧ����
            int kk = sc.nextInt();
            //���
            int dd = sc.nextInt();

            /**
             * ���Ƶ�ʱ����f[one][k]����ʽ��ʾ
             * ���У�one��ʾ���һ���˵�λ�ã�kΪ��������ˣ�һ����k����
             * ԭ�����������Ĺ�ϵ��f[one][k]=max{f[left][k-1]*arr[one],g[left][k-1]*arr[one]}
             */
            //�滮����
            long[][] f = new long[n + 1][kk + 1];//��ֱ�Ӷ�Ӧ����,n��kk��Ҫ+1
            long[][] g = new long[n + 1][kk + 1];
            //��ʼ��k=1�����
            for(int one = 1;one<=n;one++){
                f[one][1] = arr[one];
                g[one][1] = arr[one];
            }
            //�Ե����ϵ���
            for(int k=2;k<=kk;k++){
                for(int one = k;one<=n;one++){
                    //��⵱one��k����ʱ�����ķָ��
                    long tempmax = Long.MIN_VALUE;
                    long tempmin = Long.MAX_VALUE;
                    for(int left = Math.max(k-1,one-dd);left<=one-1;left++){
                        if(tempmax<Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
                            tempmax=Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
                        }
                        if(tempmin>Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
                            tempmin=Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
                        }
                    }
                    f[one][k] = tempmax;
                    g[one][k] = tempmin;
                }
            }
            //nѡk������Ҫ�����һ������λ��ѡ
            long result = Long.MIN_VALUE;
            for(int one = kk;one<=n;one++){
                if(result<f[one][kk]){
                    result = f[one][kk];
                }
            }
            System.out.println(result);
        }
    }
}