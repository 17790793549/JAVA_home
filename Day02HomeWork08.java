/**
 * 1.打印1到100之内的整数，但数字中包含9的要跳过
 * 2.每行输出5个满足条件的数，之间用空格分隔
 * 3.如：1 2 3 4 5
 */
package day02;

public class Day02HomeWork08 {
    public static void main(String[] args) {
        int q=0;
        for (int i = 1; i <=100 ; i++) {
            int a=i%10;
            int b=(i/10)%10;

            if (a!=9&&b!=9){
                q++;
                if (q%5==0){
                    System.out.println(i);
                }else{
                    System.out.print(i+"  ");
                }

            }
        }
    }
}
