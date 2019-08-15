package day03;

/**
 * 分析以下需求，并用代码实现
 * 	1.定义一个方法equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
 * 	2.定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value
 * 	3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value),功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
 * 	4.定义一个方法copyOf(int[] arr, int newLength),功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始
 * 	5.定义一个方法copyOfRange(int[] arr,int from, int to),功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中,并将新数组返回
 */
public class Day03HomeWork10 {
    public static void main(String[] args) {

    }
    public static void equals(int[] arr1,int[] arr2){
        int count=0;
        if (arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]==arr2[i]){
                    count++;
                }
            }
        }
        if (count==arr1.length&&count==arr2.length){
            System.out.println("两个数组是相同的");
        }else {
            System.out.println("两个数组不是相同的");
        }
    }
    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value;
        }
    }
    public static void fill(int[] arr,int fromlndex,int tolndex,int value){
        for (int i = fromlndex; i < tolndex; i++) {
            arr[i]=value;
        }
    }
    public static int[] copyOf(int[] arr,int newLength){
        int[] newarr=new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newarr[i]=arr[i];
        }
        return newarr;
    }
    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newarr=new int[to-from];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i]=arr[i];
        }
        return newarr;
    }
}
