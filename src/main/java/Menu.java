import java.util.Scanner;

public class Menu {

  private final Scanner scanner = new Scanner(System.in);

    public void publicMenu() {
        System.out.println("***** WELCOME *****");
        System.out.println("1-SIGN UP");
        System.out.println("2-SIGN IN");
        System.out.println("3-EXIT");
        System.out.println("CHOSE YOUR NUMBER:");

        int number = scanner.nextInt();
        scanner.nextLine();

    }
   public void signUp(){

    }

}
