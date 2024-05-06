package class3;

public class E1typeCasting {

    public static void main(String[] args) {
        //byte > short > int > long > float > double = widening
        //double > float>long>int>short>byte =narrowing
        long age=12;

        // byte myAge=10;
        byte number=10;
        int number2=number;
        System.out.println(number2);

        float num1=15.6F;
        int num2;
        num2=(int)num1;
        System.out.println(num2);




    }
}
