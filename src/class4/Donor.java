package class4;

public class Donor {
    public static void main(String[] args) {

        int age=18;
        int weight=110;

        if(age==18){
            System.out.println("You are eligible to donate your blood");
            if(weight==110){
                System.out.println("He/She is eligible");
            }
        }else{
            System.out.println("Otherwise we can't accept such a patient");
        }


    }
}
