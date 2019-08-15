package day03;

/**
 * 分析以下需求，并用代码实现(每个小需求都需要封装成方法)
 * 	1.求两个数据之和(整数和小数)
 * 	2.判断两个数据是否相等(整数和小数)
 * 	3.获取两个数中较大的值(整数和小数)
 * 	4.获取两个数中较小的值(整数和小数)
 * 	5.否能用一个方法实现3和4的两个功能
 */
public class Day03HomeWork13 {
    public static void main(String[] args) {

    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
    public static void panduan(int a,int b){
        if (a==b){
            System.out.println("这两个数相等");
        }else{
            System.out.println("这两个数不相等");
        }
    }
    public static void panduan(double a,double b){
        if (a==b){
            System.out.println("这两个数相等");
        }else{
            System.out.println("这两个数不相等");
        }
    }
    public static void max(int a,int b){
        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static void max(double a,double b){
        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static void min(int a,int b){
        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static void min(double a,double b){
        if (a<=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }



}
