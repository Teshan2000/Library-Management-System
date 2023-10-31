import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("|           === Welcome to the Library ===           |");
        System.out.println("------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please Select your Choice:");
        String choice = input.nextLine();

        System.out.println("User");
        System.out.println("Owner");
        System.out.println("Exit");

        switch(choice) {
            case 1:
            User();

            case 2:
            Owner();

            case 3:
            Exit();

            case 4:
            main(args);
        }
    }
}
