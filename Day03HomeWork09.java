package day03;

import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 	1.键盘录入长方形的长和宽
 * 		定义方法计算该长方形的周长,并在main方法中打印周长
 * 	2.键盘录入长方形的长和宽
 * 		定义方法计算该长方形的面积,并在main方法中打印面积
 * 	3.键盘录入圆的半径
 * 		定义方法计算该圆的周长,并在main方法中打印周长
 * 	4.键盘录入圆的半径
 * 		定义方法计算该圆的面积,并在main方法中打印面积
 * Math.PI
 */
public class Day03HomeWork09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长");
        int a=sc.nextInt();
        System.out.println("请输入长方形的宽");
        int b=sc.nextInt();
        System.out.println("请输入圆形的半径");
        int c=sc.nextInt();
        int mianji=changfangxing_mianji(a,b);
        int zhouchang=changfangxing_zhouchang(a,b);
        double yuan_mianji=yuan_mianji(c);
        double yuan_zhouchang=yuan_zhouchang(c);
        System.out.println("该长方形的周长:"+zhouchang);
        System.out.println("该长方形的面积:"+mianji);
        System.out.println("该圆的周长:"+yuan_zhouchang);
        System.out.println("该圆的面积:"+yuan_mianji);
    }
    public static int changfangxing_mianji(int a,int b){
        return a*b;
    }
    public static int changfangxing_zhouchang(int a,int b){
        return 2*(a+b);
    }
    public static double yuan_zhouchang(int c){
        return 2*c*Math.PI;
    }
    public static double yuan_mianji(int c){
        return c*c*Math.PI;
    }

}
