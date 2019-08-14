/**
 * 分析以下需求，并用代码实现
 * 	1.键盘录入班级人数
 * 	2.根据录入的班级人数创建数组
 * 	3.利用随机数产生0-100的成绩(包含0和100)
 * 	4.要求:
 * 		(1)打印该班级的不及格人数
 * 		(2)打印该班级的平均分
 * 		(3)演示格式如下:
 * 			请输入班级人数:
 * 			键盘录入:100
 * 			控制台输出:
 * 				不及格人数:19
 * 				班级平均分:87
 */
package day02;

import java.util.Random;
import java.util.Scanner;

public class Day02HomeWork15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数");
        int x=sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(101);
        }
        int a=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if (arr[i]<60){
                a++;
            }
        }
        System.out.println("不及格人数："+a);
        System.out.println("班级平均分："+sum/arr.length);
    }
}
