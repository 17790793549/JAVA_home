package day03;
/**
 * 有定义一个方法,可以接受一个整数,
 * 如果为[90,100]这个范围方法返回’A’
 * 如果为[80,90)这个范围方法返回’B’
 * 如果为[70,80)这个范围方法返回’C’
 * 如果为[60,70)这个范围方法返回’D’
 * 如果为[0,60)这个范围方法返回’E’
 * 整数不在以上范围的返回’F’
 *
 * 1.创建一个测试类
 * 2.定义个方法根据传递进来的数字返回对应的字母
 * 3.在主方法中使用键盘录入一个整数,调用这个方法得到这个整数对应的字母并打印
 */

import java.util.Scanner;

public class Day03HomeWork04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int x = sc.nextInt();
        String a = re(x);
        System.out.println(a);
    }
    public static String re(int x){
        if (x<=100&&x>=90){
            return "A";
        }else if (x<90&&x>=80) {
            return "B";
        }else if (x<80&&x>=70) {
            return "C";
        }else if (x<70&&x>=60) {
            return "D";
        }else if (x<60&&x>=0) {
            return "E";
        }else{
            return "F";
        }
    }
}
