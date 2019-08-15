package day03;

import java.util.Scanner;

/**
 * 定义一个方法,实现同时求出两个整数的
 * 加、减、乘、除的结果,并同时把这个四个结果返回
 * (把四个数放入到一个数组中并返回)
 */
public class Day03HomeWork07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        int[] arr=qwe(a,b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static int[] qwe(int a,int b){
        int[] arr=new int[4];
        arr[0]=a+b;
        arr[1]=a-b;
        arr[2]=a*b;
        arr[3]=a/b;
        return arr;
    }
}
