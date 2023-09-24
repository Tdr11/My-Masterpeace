public class Villan extends Person {
    String power;

    Villan(String name, double height, double weight, String power) {
        super(name, height, weight);
        this.power = power;
    }
    void showAll(){
        System.out.println(name + height + weight + power);
    }
}
