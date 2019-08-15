package day03;

public class Day03HomeWork16_test {
    public static void main(String[] args) {
        Day03HomeWork16 qwe = new Day03HomeWork16();
        qwe.setBianhao("123456");
        qwe.setName("张三");
        qwe.setNianling(18);
        qwe.setShengao(179.23);
        qwe.setXingbie("男");
        System.out.println(qwe.getName()+"   编号为："+qwe.getBianhao()+"  年龄为："+qwe.getNianling()+"   性别为："+qwe.getXingbie()+"  身高为："+qwe.getShengao());
    }
}
