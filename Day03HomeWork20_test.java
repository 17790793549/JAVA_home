package day03;

public class Day03HomeWork20_test {
    public static void main(String[] args) {
        Day03HomeWork20 p1 = new Day03HomeWork20();
        Day03HomeWork20 p2 = new Day03HomeWork20();
        Day03HomeWork20 p3 = new Day03HomeWork20();
        p1.setBianhao("123456");
        p1.setJiage(20);
        p1.setName("三毛流浪记");
        p2.setBianhao("123456");
        p2.setJiage(10);
        p2.setName("阿衰");
        p3.setBianhao("123456");
        p3.setJiage(50);
        p3.setName("三国演义");
        int[] arr=new int[3];
        arr[0]=p1.getJiage();
        arr[1]=p2.getJiage();
        arr[0]=p3.getJiage();
        int a=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a<arr[i]){
                a=arr[i];
            }
        }
        if (a==p1.getJiage()){
            System.out.println("图书编号"+p1.getBianhao()+"书名为："+p1.getName()+"价格为："+p1.getJiage());
        }else if (a==p2.getJiage()){
            System.out.println("图书编号"+p2.getBianhao()+"书名为："+p2.getName()+"价格为："+p2.getJiage());
        }else{
            System.out.println("图书编号"+p3.getBianhao()+"书名为："+p3.getName()+"价格为："+p3.getJiage());
        }

    }
}
