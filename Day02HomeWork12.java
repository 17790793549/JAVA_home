/**
 * 1键盘录入一个整数
 * 2定义长度为该整数的数组
 * 3创建Random引用数据类型的变量
 * 4生成5个0-9的随机数,为每一个元素赋值(建议用循环)
 * 5 遍历数组,输出满足条件的元素
 */
package day02;

import java.util.Random;
import java.util.Scanner;

public class Day02HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入数组长度");
        int x=sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(11);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>5&&arr[i]%2==0){
                System.out.println("数组中所有值大于5且为偶数的元素为"+arr[i]);
            }
        }
    }
}
