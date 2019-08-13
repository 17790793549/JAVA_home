/**
 * 1.键盘录入学员张浩的3门课程(Java、SQL、Web)的成绩
 * 	2.编写程序实现：
 * 		(1)Java课程和SQL课程的分数值差
 * 		(2)3门课程的平均分
 */
package day01.com.ly;
import java.util.Scanner;
public class homework08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入java的成绩");
        int java=sc.nextInt();
        System.out.println("请输入SQL的成绩");
        int SQL=sc.nextInt();
        System.out.println("请输入Web的成绩");
        int Web=sc.nextInt();
        int a=java-SQL;
        double b=(java+SQL+Web)/3;
        System.out.println("java和SQL的成绩差："+a);
        System.out.println("三门功课的平均分是："+b);

    }
}
