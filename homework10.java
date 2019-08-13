/**
 * 分析以下需求，并用代码实现：
 * 	1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
 * 	2.涨工资的条件如下：
 * 		[10-15)     +5000
 * 		[5-10)      +2500
 * 		[3~5)       +1000
 * 		[1~3)       +500
 * 		[0~1)       +200
 * 	3.如果用户输入的工龄为10，基本工资为3000，
 * 	程序运行后打印格式"您目前工作了10年，基本工资为 3000元,
 * 	应涨工资 5000元,涨后工资 8000元"
 */
package day01.com.ly;
import java.util.Scanner;
public class homework10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的工龄");
        int a=sc.nextInt();
        System.out.println("请输入您的基本工资");
        int b=sc.nextInt();
        if (a>=10){
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资5000元，涨后工资为"+(b+5000)+"元");
        }else if (a>=5){
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资2500元，涨后工资为"+(b+2500)+"元");
        }else if (a>=1){
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资500元，涨后工资为"+(b+500)+"元");
        }else{
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资200元，涨后工资为"+(b+200)+"元");
        }
    }
}
