package class4;

public class T1 {
    public static void main(String[] args) {

        boolean degree=true;

        double gpa=3.6;

        if(degree==true){
            System.out.println("Congratulations");
            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            } else{
                System.out.println("You should study harder");
            }

        }else {
            System.out.println("You should get a degree");
        }

    }
}
