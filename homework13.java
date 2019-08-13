/**
 * 1.键盘录入三个整数，按照从小到大的顺序输出
 * 2.如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"
 */
package day01.com.ly;
import java.util.Scanner;
public class homework13 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数：");
        int c=sc.nextInt();
        String x = a>b?(a>c?(b>c?"a>b>c":"a>c>b"):"c>a>b"):(a>c?"b>a>c":(b>c?"b>c>a":"c>b>a"));
        if (x=="a>b>c"){
            System.out.println("按照从小到大排序后的顺序为:"+c+"  "+b+"  "+a);
        }else if (x=="a>c>b"){
            System.out.println("按照从小到大排序后的顺序为:"+b+"  "+c+"  "+a);
        }
        else if (x=="b>a>c"){
            System.out.println("按照从小到大排序后的顺序为:"+c+"  "+a+"  "+b);
        }
        else if (x=="b>c>a"){
            System.out.println("按照从小到大排序后的顺序为:"+a+"  "+c+"  "+b);
        } else if (x=="c>b>a"){
            System.out.println("按照从小到大排序后的顺序为:"+a+"  "+b+"  "+c);
        }else{
            System.out.println("按照从小到大排序后的顺序为:"+b+"  "+a+"  "+c);
        }
    }
}
