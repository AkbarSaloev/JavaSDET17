package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender F/M");
        char gender=scanner.next().charAt(0);

        System.out.println("Your gender is "+gender);


    }
}
