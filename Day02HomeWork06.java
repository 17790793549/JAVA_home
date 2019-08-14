/**
 * A:系统产生一个1-100之间的随机数
 * Random r = new Random();
 * int number = r.nextInt(100)+1;
 * B:键盘录入我们要猜的数据
 * C:比较这两个数据，看我们猜的是否正确
 * 如果大了，提示：你猜的数据大了
 * 如果小了，提示：你猜的数据小了
 * 如果相等，提示：恭喜你，猜中了
 * D:为了实现多次猜数据，我们就要加入循环，而我们又不知道猜多少次能中。怎么办呢?
 * 死循环：while(true) {...}
 * 		 for(;;) {...}
 */
package day02;

import java.util.Random;
import java.util.Scanner;

public class Day02HomeWork06 {
    public static void main(String[] args) {
        while (true){
            Random random = new Random();
            int number = random.nextInt(100)+1;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要猜的数：");
            int x=sc.nextInt();
            if (x>number){
                System.out.println("你猜的数据大了");
            }else if (x==number){
                System.out.println("恭喜你，猜中了");
            }else{
                System.out.println("你猜的数据小了");
            }
        }

    }
}
