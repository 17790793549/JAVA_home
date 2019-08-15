package day03;

import java.util.Scanner;

/**
 * 1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
 * 	2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
 * 	3.在main方法中打印该数字是几位数
 * 	4.演示格式如下:
 * 		(1)演示一:
 * 			请输入一个整数:1234
 * 			控制台输出:1234是4位数字
 * 		(2)演示二:
 * 			请输入一个整数:-34567
 * 			控制台输出:-34567是5位数字
 */
public class Day03HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a=sc.nextInt();
        int count = sum(a);
        System.out.println("该数字是"+count+"位数");
    }
    public static int sum(int a){
        int count=0;
        int b=a;
        while (b%10!=0){
            count++;
            b=b/10;
        }
        return count;
    }
}
