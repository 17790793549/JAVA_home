package day03;

public class Day03HomeWork18_test {
    public static void main(String[] args) {
        Day03HomeWork18 teacher = new Day03HomeWork18();
        Day03HomeWork18_2 student = new Day03HomeWork18_2();
        teacher.setName("周志鹏");
        teacher.setAge(30);
        teacher.setContent("Java基础中面向对象的知识");
        teacher.eat();
        teacher.speak();
        student.setAge(18);
        student.setName("韩光");
        student.setContent("面向对象的知识");
        student.eat();
        student.study();
    }
}
