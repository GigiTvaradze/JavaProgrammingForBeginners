package section12Conditionals.exerciseConditionals;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your day: ");
        System.out.println("0 - Sunday");
        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Wednesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6 - Saturday");
        int numberOfDay = scanner.nextInt();
        isWeekDay(numberOfDay);
    }

    private static void isWeekDay(int numberOfDay) {
        switch (numberOfDay){
            case 0:
                System.out.println("You Chose Sunday");
                break;
                case 1:
                    System.out.println("You Chose Monday");
                    break;
            case 2:
                System.out.println("You Chose Tuesday");
                break;
            case 3:
                System.out.println("You Chose Wednesday");
                break;
            case 4:
                System.out.println("You Chose Thursday");
                break;
            case 5:
                System.out.println("You Chose Friday");
                break;
            case 6:
                System.out.println("You Chose Saturday");
                break;
            default:
                System.out.println("Wrong Input !");
        }
    }
}
