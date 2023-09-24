import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> guestList = new ArrayList<String>();

        while (true) {
            System.out.println("1-yes");
            System.out.println("0-no");
            System.out.println("Do you want to add someone to your guest list?");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("Enter name");
                scanner.nextLine();
                String guestName = scanner.nextLine();
                guestList.add(guestName);
            } else {
                System.out.println("Wrong choice. Pick between 0 or 1!");
            }

            for (){
                System.out.println("Who are you?");
                String yourName = scanner.nextLine();

                if (guestList.contains(yourName)) {
                    System.out.println( "Welcome " + yourName);
                } else {
                    System.out.println("Get lost!");
                }
            }

        }
    }
}