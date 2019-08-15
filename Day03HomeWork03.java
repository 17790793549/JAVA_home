package day03;

/**
 * 3.1． 训练描述
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
 * 并返回这个数组中元素的最小值
 *
 * 3.2． 操作步骤描述
 * 1.创建一个测试类,在测试类中写该方法
 * 2.定义一个方法可以接收一个整型的一维数组
 * 3.在方法内部求出数组元素的最小值,并把这个最小值返回
 * 4.在主方法中调用上述方法传递数组arr,得到数组中元素的最小值并打印
 */
public class Day03HomeWork03 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int a = min(arr);
        System.out.println("数组中最小值为："+a);
    }
    public static int min(int[] arr){
        int a=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a>arr[i]){
                a=arr[i];
            }
        }
        return a;
    }
}
