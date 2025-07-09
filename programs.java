import  java.util.Scanner;

public class programs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Thanks for that, Andre ;)

        System.out.print("Enter your name: ");
        String silly_name = scan.nextLine();
        System.out.println("Hi " + silly_name + ", welcome to AP CSA");


        System.out.print("Enter a name: ");
        String name1 = scan.nextLine();
        System.out.print("Another one: ");
        String name2 = scan.nextLine();
        System.out.print("Ok just one more i promise: ");
        String name3 = scan.nextLine();

        System.out.println("Here are the names in reverse order for some reason");
        System.out.printf("%s, %s, %s%n", name3, name2, name1);


        System.out.print("ight now  we doin planet bois\nPut yo weight in poundz: ");
        int weight = scan.nextInt();

        System.out.printf("On Mercury you will weigh %s pounds%n", weight * 0.4);
        System.out.printf("On Venus you will weigh %s pounds%n", weight * 0.9);
        System.out.printf("On Mars you will weigh %s pounds%n", weight * 0.38);
        System.out.printf("On Jupiter you will weigh %s pounds%n", weight * 2.3);
        System.out.printf("On Saturn you will weigh %s pounds%n", weight * 1.1);
        System.out.printf("On Uranus you will weigh %s pounds%n", weight * 0.92);
        System.out.printf("On Neptune you will weigh %s pounds%n", weight * 1.2);


        System.out.print("Enter any amount of seconds: ");
        int time = scan.nextInt();

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.printf("%d hours, %d minutes and %d seconds", hours, minutes, seconds);


        scan.close();
    }
}
