import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("|           === Welcome to the Library ===           |");
        System.out.println("------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please Select your Choice:");
        System.out.println("(1) User");
        System.out.println("(2) Owner");
        System.out.println("(3) Exit");
        int choice = input.nextInt();

        switch(choice) {

            case 1:
            System.out.println("------------------------------------------------");
            System.out.println("\tWelcome User!");
            System.out.println("------------------------------------------------");

            System.out.println("Please Select your Choice:");
            System.out.println("(1) Become a Member");
            System.out.println("(2) Select Books");
            System.out.println("(3) Borrow Books");
            System.out.println("(4) Back to Home page");
            int option = input.nextInt();

            switch(option) {
                case 1:
                System.out.println("------------------------------------------------");
                System.out.println("\t\t Become a Member");
                System.out.println("------------------------------------------------");
                System.out.println("Enter Username: \n");
                String username = input.nextLine();
                System.out.println("Enter Password: \n");
                String password = input.nextLine();

                System.out.println("------------------------------------------------");
                System.out.println("\t\t You are a Member of the library now!");
                System.out.println("------------------------------------------------");

                case 2:
                //Owner();

                case 3:
                //Exit();

                // case 4:
                // main(args);

            }
            break;

            case 2:
            System.out.println("------------------------------------------------");
            System.out.println("\tWelcome Owner!");
            System.out.println("------------------------------------------------");

            System.out.println("Please Select your Choice:");
            System.out.println("(1) Log to the Account");
            System.out.println("(2) Display Books");
            System.out.println("(3) Display Members");
            System.out.println("(4) Back to Home page");
            int options = input.nextInt();

            switch(options) {
                case 1:
                //User();

                case 2:
                //Owner();

                // case 3:
                // Exit();

                // case 4:
                // main(args);
            }
            break;

            case 3:
            System.out.println("Confirm Exit\n");    
            break;

            case 4:
            main(args);
        }
    }


}
