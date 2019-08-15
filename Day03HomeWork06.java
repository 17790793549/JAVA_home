package day03;

/**
 * 6.1． 训练描述
 * 定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
 * 如: 数组[1232]要查找的数是2 则方法内部会打印索引值 1 , 3
 * 数组[1232] 要查找的数是5 则方法每部会打印 “数组中没有这个数字”
 * 6.2． 操作步骤描述
 * 1.创建一个测试类,在测试类中书写上述代码
 * 2.定义方法可以接受一个int[] brr和一个int key
 * 3.在方法中定义标记 int count = 0 ;
 * 4.方法中遍历brr 对每个元素进行判断是否等于key,如果等于就打印索引值,并count++
 * 5.遍历brr完毕之后 判断count的值,如果还为默认值0,则表示brr中没有key,直接打印”数组中没有这个数字”
 * 6.在主方法中传入数组 arr 和数字 2 或者5 进行测试
 */
public class Day03HomeWork06 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,4,5,6,7,8,9};
        int key=10;
        sum(key,arr);

    }
    public static void sum(int key,int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]){
                count++;
                System.out.print(i+"\t");
            }
        }
        if (count==0){
            System.out.println("数组中没有这个数字");
        }
    }
}
