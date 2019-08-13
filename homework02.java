//键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
package day01.com.ly;
import java.util.Scanner;
public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a="及格";
        String b="不及格";
        String c = (x>=60)?a:b;
        System.out.println(c);
    }
}
