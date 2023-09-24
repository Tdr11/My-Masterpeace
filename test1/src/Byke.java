public class Byke {
    String name;
    int age;
    String color;

    Byke(String name, int age, String color){

        this.name = name;
        this.age = age;
        this.color = color;

    }

    void driveByke() {
        System.out.println(name + " is driven.");
    }

    void stopByke() {
        System.out.println(name + " stopped.");
    }

}
