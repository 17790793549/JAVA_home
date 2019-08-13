/**
 * 小明左、右手中分别拿两张纸牌
 * （比如：黑桃10和红桃8，数字10和8可通过键盘录入），
 * 要求编写代码交换小明手中的牌
 */
package day01.com.ly;
import java.util.Scanner;
public class homework07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌：");
        int left=sc.nextInt();
        System.out.println("请输入小明右手中的纸牌：");
        int right=sc.nextInt();
        int temp=left;
        left=right;
        right=temp;
        System.out.println("小明左手中的纸牌："+left);
        System.out.println("小明右手中的纸牌："+right);
    }
}
