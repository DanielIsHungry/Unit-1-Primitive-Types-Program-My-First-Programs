import  java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name1 = scan.nextLine();
        System.out.print("Another one: ");
        String name2 = scan.nextLine();
        System.out.print("Ok just one more i promise: ");
        String name3 = scan.nextLine();

        System.out.println("Here are the names in reverse order for some reason");
        System.out.printf("%s, %s, %s%n", name3, name2, name1);

        scan.close();

    }
}