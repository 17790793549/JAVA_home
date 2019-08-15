package day03;

import java.util.Scanner;

/**
 * 定义一个方法,去打印指定两个年份之间所有的闰年年份
 * 如:将2000和2005传入方法,方法执行完毕会打印出这段之间的所有闰年年份
 * 2000和2004
 * 提示:
 * 计算公历年闰年的算法: 四年一闰，百年不闰，四百年再闰
 * 翻译:
 * 满足如下任意一条即使如年
 * 1)年份是整百数的必须是400的倍数才是闰年(能被100整除并且能被400整除)
 * 2)其他年份能被4的是闰年
 * 实例: 2000 是整百数,并且是400的倍数所以是闰年; 2004年是4的倍数是闰年
 * 2100 是整百的倍数但不是400的倍数,所以不是闰年
 */
public class Day03HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始年份：");
        int a=sc.nextInt();
        System.out.println("请输入截止年份：");
        int b=sc.nextInt();
        runnian(a,b);

    }
    public static void runnian(int a,int b){
        for (int i = a; i <=b ; i++) {
            if(i%100==0){
                if (i%400==0){
                    System.out.println(i);
                }
            }else if (i%4==0){
                System.out.println(i);
            }
        }
    }
}
