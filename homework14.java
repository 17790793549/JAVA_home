/**
 * (1)键盘录入一个整数(代表月份,范围1-12)
 * (2)输出该月份对应的季节
 * 			3,4,5春季
 * 			6,7,8夏季
 * 			9,10,11秋季
 * 			12,1,2冬季
 * (3)演示格式如下:
 * 			请输入一个月份:3
 * 			控制台输出:3月份是春季
 */
package day01.com.ly;
import java.util.Scanner;
public class homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份,范围1-12");
        int x = sc.nextInt();
        if (x == 3 || x == 4 || x == 5) {
            System.out.println(x + "月份是春季");
        } else if (x == 6 || x == 7 || x == 8) {
            System.out.println(x + "月份是夏季");
        } else if (x == 9 || x == 10 || x == 11) {
            System.out.println(x + "月份是秋季");
        } else {
            System.out.println(x + "月份是冬季");
        }
    }
}