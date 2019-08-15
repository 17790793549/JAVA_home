package day03;

public class Day03HomeWork17_2 {
    private String name;
    private String id;
    private int salary;

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
    public void work(){
        System.out.println("工号为"+this.getId()+"基本工资为"+this.getSalary()+"的程序员"+this.getName()+"正在努力的写着代码");
    }
}
