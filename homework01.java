//键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
package day01.com.ly;
import java.util.Scanner;
public class homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a="奇数";
        String b="偶数";
        String c = (x%2==0)?b:a;
        System.out.println(c);

    }
}
