//定义int类型的变量a,定义int类型的变量b,使用三元运算符判断如果a大于b返回a与b的和,否则返回a与b的乘积,打印结果
package day01.com.ly;

public class homework05 {
    public static void main(String[] args) {
        int a=123;
        int b=456;
        int c=(a>b)?(a+b):(a*b);
        System.out.println(c);
    }
}
