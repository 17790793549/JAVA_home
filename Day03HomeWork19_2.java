package day03;

public class Day03HomeWork19_2 {
    private String color;
    private String breed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(this.getColor()+"的"+this.getBreed()+"正在啃骨头");
    }
    public void lookHome(){
        System.out.println(this.getColor()+"的"+this.getBreed()+"正在看家");
    }
}
