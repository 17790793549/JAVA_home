/**
 * 将数字1-10保存到一个长度为10的一维数组中
 * 定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
 * 给新数组的元素赋值
 * 求新数组所有元素的和
 */
package day02;

import java.util.Random;

public class Day02HomeWork14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr_={1,2,3,4,5,6,7,8,9,10};
        int[] arr=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr_[random.nextInt(10)];
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("新数组所有元素的和为："+sum);
    }
}
