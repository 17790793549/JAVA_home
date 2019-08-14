/**
 * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
 * 请写代码实现。(不考虑小数部分)
 */
package day02;
import java.util.Scanner;
import java.util.Scanner;

public class Day02HomeWork13 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一位评委的评分：");
        int a=sc.nextInt();
        System.out.println("请输入第二位评委的评分：");
        int b=sc.nextInt();
        System.out.println("请输入第三位评委的评分：");
        int c=sc.nextInt();
        System.out.println("请输入第四位评委的评分：");
        int d=sc.nextInt();
        System.out.println("请输入第五位评委的评分：");
        int e=sc.nextInt();
        System.out.println("请输入第六位评委的评分：");
        int f=sc.nextInt();
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        arr[5]=f;
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a>=arr[i]){
                min=arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (a<=arr[i]){
                max=arr[i];
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        double pingjun=(sum-min-max)/(arr.length-2);
        System.out.println("去掉一个最高分和一个最低分后 的4个评委平均值为："+pingjun);
    }
}
