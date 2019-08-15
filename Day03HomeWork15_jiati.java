package day03;

/**
 * 一、	有以下数据：
 * 1.	三个老师信息：
 * 教师编号	姓名	性别	年龄	科目subject
 * t001			薛之谦	男		26		Java
 * t002			张碧晨	女		24		IOS
 * t003			张杰	男		28		Java
 * 2.	存储两个科目信息：
 * 课程编号	名称	创建时间	课程描述
 * s001			Java		2007-02-08	Java学科，包含JavaSE和JavaEE
 * s002			IOS		2007-02-09	IOS系统开发
 * 二、	请分别定义两个类；
 * 三、	创建MainApp类中，包含main()方法，创建相应对象，通过构造方法给成员变量赋值。
 * 四、	打印每个对象的所有属性。
 * 要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。
 */
public class Day03HomeWork15_jiati {
    private String name;
    private String xingbie;
    private int nianling;
    private String subject;

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

    public int getNianling() {
        return nianling;
    }

    public void setNianling(int nianling) {
        this.nianling = nianling;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void show(){
        System.out.println("教师"+name+"性别"+xingbie+"年龄"+nianling+"科目"+subject);
    }
}
