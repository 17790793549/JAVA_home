package day03;

/**
 * 分析以下需求，并用代码实现
 * 	1.项目经理类Manager
 * 		属性：
 * 			姓名name
 * 			工号id
 * 			工资salary
 * 			奖金bonus
 * 		行为：
 * 			工作work()
 * 	2.程序员类Coder
 * 		属性：
 * 			姓名name
 * 			工号id
 * 			工资salary
 * 		行为：
 * 			工作work()
 * 	要求:
 * 		1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
 * 		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
 * 		3.调用成员方法,打印格式如下:
 * 			工号为123基本工资为15000奖金为6000的项目经理一龙正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 * 			工号为135基本工资为10000的程序员方便正在努力的写着代码......操作步骤描述
 */
public class Day03HomeWork17 {
    private String name;
    private String id;
    private int salary;
    private int bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("工号为"+this.getId()+"基本工资为"+this.getSalary()+"奖金为"+this.getBonus()+"的项目经理"+this.getName()+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码");
    }
}
