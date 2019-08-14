/**
 * 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
 * 		1.数字的个位数不为7;
 * 		2.数字的十位数不为5;
 * 		3.数字的百位数不为3;
 */
package day02;

import java.util.Scanner;

public class Day02HomeWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数");
        int x=sc.nextInt();
        int a=x%10;
        int b=(x/10)%10;
        int c=(x/100)%10;
        int d=0;
        if (a!=7&&b!=5&&c!=3){
            for (int i=100;i<=x;i++){
                d=d+i;

            }
            System.out.println("100到该数字之间满足如下要求的数字之和:"+d);
        }else {
            System.out.println("您输入有误！！！");
        }
    }
}
