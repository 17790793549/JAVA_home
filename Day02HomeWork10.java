/**
 * 1.定义长度为3的数组
 * 2.创建Random引用数据类型的变量
 * 3.生成3个0-9的随机数,为每一个元素赋值(可以用循环,也可以不使用循环)
 * 4.遍历数组，并打印每一个元素
 */
package day02;

import java.util.Random;

public class Day02HomeWork10 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[]=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
