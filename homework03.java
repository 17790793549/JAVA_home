//定义一个int类型的变量,初始化值为123,求这个数的个位,十位,百位分别是多少,输出结果:123的个位是3,十位是2,百位是1
package day01.com.ly;

public class homework03 {
    public static void main(String[] args) {
        int a=123;
        int b=a%10;
        int c=(a/10)%10;
        int d=a/100;
        System.out.println("123的个位是："+b);
        System.out.println("123的十位是："+c);
        System.out.println("123的百位是："+d);

    }

}
