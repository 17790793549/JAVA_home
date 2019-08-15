package day03;

/**
 * 	设计，并定义一个学员类：Student，要求有以下属性：
 * 		学员编号（String）
 * 		姓名（String）
 * 		性别（String）
 * 		身高（double）
 * 		年龄（int）
 * 使用封装的原则，并提供无参和全参的构造方法。
 * 	定义MainApp类，并包含main()方法。
 * 	程序启动后，应分别提示用户输入学员编号、姓名等信息。
 * 例如控制台显示：
 * 	C:\>请输入学员编号：
 * 	C:\>....
 * 	C:\>请输入学员姓名：
 * 	C:\>....
 * 	.................
 * 	数据接收到程序中，并定义局部变量存储；
 * 	创建Student对象，通过构造方法将所有数据存储到Student对象中；
 * 	打印对象中的每个属性值。
 */
public class Day03HomeWork16 {
    private String bianhao;
    private String name;
    private String xingbie;
    private double shengao;
    private int nianling;

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public double getShengao() {
        return shengao;
    }

    public void setShengao(double shengao) {
        this.shengao = shengao;
    }

    public int getNianling() {
        return nianling;
    }

    public void setNianling(int nianling) {
        this.nianling = nianling;
    }
}
