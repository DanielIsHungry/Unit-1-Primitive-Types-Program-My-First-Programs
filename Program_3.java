import  java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Thanks for that, Andre ;)

        System.out.print("ight now  we doin planet bois\nPut yo weight in poundz: ");
        int weight = scan.nextInt();

        System.out.printf("On Mercury you will weigh %s pounds%n", weight * 0.4);
        System.out.printf("On Venus you will weigh %s pounds%n", weight * 0.9);
        System.out.printf("On Mars you will weigh %s pounds%n", weight * 0.38);
        System.out.printf("On Jupiter you will weigh %s pounds%n", weight * 2.3);
        System.out.printf("On Saturn you will weigh %s pounds%n", weight * 1.1);
        System.out.printf("On Uranus you will weigh %s pounds%n", weight * 0.92);
        System.out.printf("On Neptune you will weigh %s pounds%n", weight * 1.2);



        scan.close();

    }
}