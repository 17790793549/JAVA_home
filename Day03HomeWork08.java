package day03;

/**
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};这个数组没有重复元素.
 * 定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
 */
public class Day03HomeWork08 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int b = min(arr);
        System.out.println("这个数组中最大元素值的索引值为："+b);
    }
    public static int min(int[] arr){
        int a=arr[0];
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            if (a<arr[i]){
                b=i;
            }
        }
        return b;
    }

}
