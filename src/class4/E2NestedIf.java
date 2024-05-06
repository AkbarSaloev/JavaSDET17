package class4;

public class E2NestedIf {

    public static void main(String[] args) {

        boolean winter = true;

        String jacketColor = "Black";

        if (winter == true) {
            System.out.println("It's Very cold");
            if (jacketColor.equals("Red")) {
                System.out.println("Let's go with Red Nike shoes");
            }else {
                System.out.println("Let's go with a blue ones");
            }

        }else {
            System.out.println("No need to wear jackets");
        }

    }
}
