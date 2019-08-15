package day03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 定义一个方法传入一个int类型数组，输出这个数组中每一个数字及其出现的个数
 * 		例如 传入数组[1,2,2,2,3,3,4,4,4,4]  打印结果：
 * 									数字1出现了1次
 * 								数字2出现了3次…
 */
public class Day03HomeWork14 {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,4,4,4,4};
        sum(arr);
    }
    public static void sum(int[] arr){
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int qwe=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                a++;
            }else if (arr[i]==2){
                b++;
            }
            else if (arr[i]==3){
                c++;
            }
            else if (arr[i]==4){
                d++;
            }
        }
        System.out.println("数字1出现了："+a);
        System.out.println("数字2出现了："+b);
        System.out.println("数字3出现了："+c);
        System.out.println("数字4出现了："+d);

    }
}
