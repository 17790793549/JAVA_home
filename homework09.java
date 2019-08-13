/**
 * 1.商场推出幸运抽奖活动，抽奖规则如下：
 * 	(1)键盘录入四位数字(1000-9999的数字),作为顾客的会员卡号
 * 	(2)该会员卡号(键盘录入的四位数字)各位数字之和大于20，则为幸运客户
 *
 * 2.打印格式：
 * 	请输入4位会员卡号：3569
 * 	会员卡号3569各位之和：23
 * 	会员卡号3569是幸运客户
 *
 * 	请输入4位会员卡号：1234
 * 	会员卡号3569各位之和：10
 * 	会员卡号3569不是幸运客户
 */
package day01.com.ly;
import java.util.Scanner;
public class homework09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入四位数会员卡号");
        int i=sc.nextInt();
        int a=i%10;
        int b=(i/10)%10;
        int c=(i/100)%10;
        int d=(i/1000)%10;
        int x=a+b+c+d;
        if (x>20){
            System.out.println("会员卡号"+i+"是幸运客户");
        }else{
            System.out.println("会员卡号"+i+"不是幸运客户");
        }
    }
}
