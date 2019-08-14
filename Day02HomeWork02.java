//求出1到100之间的既是3的倍数又是5倍数的数字之和.
package day02;

public class Day02HomeWork02 {
    public static void main(String[] args) {
        int x=0;
        for (int i=1;i<=100;i++){
            if (i%3==0&&i%5==0){
                x=x+i;
            }

        }
        System.out.println("既是3的倍数又是5倍数的数字之和为："+x);
    }
}
