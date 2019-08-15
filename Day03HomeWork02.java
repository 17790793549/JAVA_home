package day03;
/**
 * 1.创建一个测试类
 * 2.在主方法中使用Random产生两个范围是[1,100]的随机数
 * 3.定义一个求两个整数和的方法
 * 4.在主方法中调用这个求和方法得到结果值,并打印
 */

import java.util.Random;

public class Day03HomeWork02 {
    public static void main(String[] args) {
        Random random = new Random();
        int a=random.nextInt(100)+1;
        int b=random.nextInt(100)+1;
        sum(a,b);
    }
    public static  void sum(int a,int b){
        System.out.print(a);
        System.out.print(b);
        System.out.println("这两个数的和为："+(a+b));
    }
}
