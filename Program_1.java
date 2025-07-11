import  java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Thanks for that, Andre ;)

        System.out.print("Enter your name: ");
        String silly_name = scan.nextLine();
        System.out.println("Hi " + silly_name + ", welcome to AP CSA");

        scan.close();

    }
}