package day03;

public class Day03HomeWork17_test {
    public static void main(String[] args) {
        Day03HomeWork17 jingli = new Day03HomeWork17();
        Day03HomeWork17_2 chengxuyuan = new Day03HomeWork17_2();
        jingli.setBonus(5000);
        jingli.setId("123456789");
        jingli.setName("一龙");
        jingli.setSalary(2000);
        jingli.work();
        chengxuyuan.setId("00000000000");
        chengxuyuan.setName("方便");
        chengxuyuan.setSalary(3000);
        chengxuyuan.work();
    }
}
