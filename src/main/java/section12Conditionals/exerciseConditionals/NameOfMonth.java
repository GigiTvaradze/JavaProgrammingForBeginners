package section12Conditionals.exerciseConditionals;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Month: ");
        System.out.println("1 - January");
        System.out.println("2 - February");
        System.out.println("3 - March");
        System.out.println("4 - April");
        System.out.println("5 - May");
        System.out.println("6 - June");
        System.out.println("7 - July");
        System.out.println("8 - August");
        System.out.println("9 - September");
        System.out.println("10 - October");
        System.out.println("11 - November");
        System.out.println("12 - December");
        int monthNumber = scanner.nextInt();
        determineNameOfMonth(monthNumber);
    }

    private static void determineNameOfMonth(int monthNumber) {
        switch (monthNumber){
            case 1:
                System.out.println("You Chose January");
                break;
            case 2:
                System.out.println("You Chose February");
                break;
            case 3:
                System.out.println("You Chose March");
                break;
            case 4:
                System.out.println("You Chose April");
                break;
            case 5:
                System.out.println("You Chose May");
                break;
            case 6:
                System.out.println("You Chose June");
                break;
            case 7:
                System.out.println("You Chose July");
                break;
            case 8:
                System.out.println("You Chose August");
                break;
            case 9:
                System.out.println("You Chose September");
                break;
            case 10:
                System.out.println("You Chose October");
                break;
            case 11:
                System.out.println("You Chose November");
                break;
            case 12:
                System.out.println("You Chose December");
                break;
            default:
                System.out.println("Wrong Input !");
        }
    }
}
