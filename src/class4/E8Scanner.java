package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Sean")) {
            System.out.println("Strawberry lemonade");
        } else if (name.equals("Luis")) {
            System.out.println("I like Wheelz up forever");

        } else if (name.equals("Marcos")) {
            System.out.println("44 year old");
        } else if (name.equals("Ashleigh")) {
            System.out.println("Purple Jacket");
        }
    }
}
