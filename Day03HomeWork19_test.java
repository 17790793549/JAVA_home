package day03;

public class Day03HomeWork19_test {
    public static void main(String[] args) {
        Day03HomeWork19 cat = new Day03HomeWork19();
        Day03HomeWork19_2 dog = new Day03HomeWork19_2();
        cat.setBreed("波斯猫");
        cat.setColor("花色");
        cat.eat();
        cat.catchMouse();
        dog.setBreed("藏獒");
        dog.setColor("黑色");
        dog.eat();
        dog.lookHome();
    }
}
