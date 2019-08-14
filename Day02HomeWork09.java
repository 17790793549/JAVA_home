/**
 * 1.定义5个元素数组
 * 2.可以使用初始化数组的两种方式之一为数组元素赋值
 * 3.遍历数组求数组中的最小值
 */
package day02;

public class Day02HomeWork09 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int a=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a>=arr[i]){
                a=arr[i];
            }
        }
        System.out.println("最小值为："+a);
    }
}
