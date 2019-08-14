/**
 * 分析以下需求，并用代码实现：while
 * 	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
 * 	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */
package day02;

public class Day02HomeWork07 {
    public static void main(String[] args) {
        double x=0.0001;
        int a=0;
        while (x<8848.0){
            x = x+x;
            a++;
        }
        System.out.println("我折叠"+a+"次，可以折成珠穆朗玛峰的高度。");

    }
}
