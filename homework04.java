//键盘录入一个长方形的长和宽(长和宽为int类型),计算长方形的面积和周长
package day01.com.ly;
import java.util.Scanner;
public class homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入长方形的长;");
        int x=sc.nextInt();
        System.out.println("输入长方形的宽;");
        int y=sc.nextInt();
        int a=x*y;
        int b=(x+y)*2;
        System.out.println("长方形的面积为："+a);
        System.out.println("长方形的周长为："+b);
    }
}
