import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name1 = scanner.nextLine();

        System.out.println("What is your crushes name?");
        String name2 = scanner.nextLine();

        int loveCalc = loveCalculator();

        System.out.println(name1 + " and " + name2 + " are " + loveCalc + "% in love!");

        }

    public static int loveCalculator() {
        Random random = new Random();
        return random.nextInt(101);
    }
}