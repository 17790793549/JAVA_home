package day03;

/**
 * 5.1． 训练描述
 * 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
 * 如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数
 * 5.2． 操作步骤描述
 * 1.创建一个测试类
 * 2.定义个方法可以接受一个int数字key和int型数组arr
 * 3.在方法的内部统计key在arr中出现的次数(即统计arr中有多少个元素与key相等)
 * 4.在主方法中调用这个方法传入一个数字,一个数组,得到数组的返回结果并打印
 */

public class Day03HomeWork05 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,1,2,3,4,5,6,7,8,9,4,5,6,3,1,5,3,5,9,7,9};
        int key=1;
        int a=sum(key,arr);
        System.out.println("1在arr中出现的次数为："+a);
    }
    public static int sum(int key,int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]){
                count++;
            }
        }
        return count;
    }
}
