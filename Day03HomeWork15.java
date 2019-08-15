package day03;

import java.util.Random;

/**
 * 分析以下需求，并用代码实现
 * 	1.创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数。[1,2,3,5,7,8,…] [5,4,3,2,7,9,…]
 * 	2.定义一个方法，传入两个数组，方法中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
 * 		如果没有则输出"对不起两个数组的所有元素均相同"
 */
public class Day03HomeWork15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1=new int[10];
        int[] arr2=new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=random.nextInt(100)+1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=random.nextInt(100)+1;
        }
        put(arr1);
        put(arr2);

    }
    public static void put(int[] arr){
        String a="";
        for (int i = 0; i < arr.length; i++) {
            a=a+arr[i];
        }
        System.out.println(a.length());
        System.out.println(a);
    }
}
