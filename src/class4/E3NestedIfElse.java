package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {

        double accountBalance=15000; //with ONE variable you can write multiple NESTED

        if(accountBalance>28000){ //30K>28K true cond first If executed
            System.out.println("We can afford a normal Toyota");
            if(accountBalance>50000){
                System.out.println("We can afford Luxury cars as well");
            }

        }else {
            System.out.println("We need to save more");
        }

    }

}
