package class4;


import java.util.Scanner;

public class E4Scanner {

    public static void main(String[] args) {

        System.out.println("Please enter your name");
        //creating the object of the scanner so that we can reuse the logic from
        //this class which is already written for us by Java developers
        Scanner scanner = new Scanner(System.in);
        //take an input from the use and storing in a 'name' variable
        String name = scanner.next();
        if (name.equals("Akbar")) {
            System.out.println("Java Instructor");
        } else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello " +name);

    }
}
