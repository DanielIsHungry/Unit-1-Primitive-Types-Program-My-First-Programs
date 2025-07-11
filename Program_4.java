import  java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Thanks for that, Andre ;)

        System.out.print("Enter any amount of seconds: ");
        int time = scan.nextInt();

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.printf("%d hours, %d minutes and %d seconds", hours, minutes, seconds);

        scan.close();

    }
}