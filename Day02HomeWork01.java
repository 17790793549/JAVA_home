//使用for循环,求出1-100之间的奇数之和.
package day02;

public class Day02HomeWork01 {
    public static void main(String[] args) {
        int x=0;
        for (int i=1;i<=100;i++){
            if (i%2==1){
                x=x+i;
            }

        }
        System.out.println("奇数和为："+x);
    }
}
