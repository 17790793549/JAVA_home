package day03;

/**
 * 一、	需求说明：创建三个图书类对象，找出价格最高的图书并打印该图书的所有信息。
 * 二、	设计“图书类”Book，要求有以下属性：
 * 	图书编号：
 * 	书名：
 * 	价格：
 */
public class Day03HomeWork20 {
    private String name;
    private String bianhao;
    private int jiage;

    public int getJiage() {
        return jiage;
    }

    public void setJiage(int jiage) {
        this.jiage = jiage;
    }

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
}
