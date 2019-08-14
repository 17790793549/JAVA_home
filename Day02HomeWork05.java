/**
 * A:定义统计变量，初始化值是0
 * B:获取三位数，用for循环实现
 *  		C:获取每个位上的数据
 *  		D:判断数据是否是水仙花数
 *  			如果是，就统计变量++
 * 			打印该水仙花数（不换行，数字后面加空格）
 * 			判断总数量是否是2的倍数
 * 				如果是就打印换行
 *  			E:输出统计变量
 */
package day02;

public class Day02HomeWork05 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int a=i%10;
            int b=(i/10)%10;
            int c=(i/100)%10;
            int d=(a*a*a)+(b*b*b)+c*c*c;
            if (d==i && d%2==0){
                System.out.println(i);
            }else if (d==i && d%2==1){
                System.out.print(i+"   ");
            }else{
                continue;
            }

        }
    }
}
