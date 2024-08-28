package Zad2;
import java.util.Scanner;
public class Zad2Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please insert first number: ");
//        double num1 = Double.valueOf(reader.nextDouble());
//        System.out.println("You imput the first number: "+num1);
        //System.out.println("Double.toString(num1) = "+Double.toString(num1));
        //***************
        Double num1 ;
        while (true){
            // num1 = Double.valueOf(reader.next());
            String num1String = reader.nextLine();
            if(num1String.equals("")){
                System.out.println("Empty input is forbiden!");
                System.out.println("Please inserd first number:");
                continue;
            } else {
                num1 = Double.valueOf(num1String);
                System.out.println("You imput the first number: "+num1);
                break;
            }
        }

        //****************
        System.out.println("Please insert second number: ");
        double num2 = Double.valueOf(reader.nextDouble());
        System.out.println("You imput the second number: "+num2);
        AritmeticOperation inputTwoNumber = new AritmeticOperation(num1,num2);
        System.out.println( "The sum of "+ num1+" + "+num2+" = "+inputTwoNumber.getSum(num1,num2));
        System.out.println( "The extraction of "+ num1+" - "+num2+" = "+inputTwoNumber.getExtraction(num1,num2));
        System.out.println( "The multiplication of "+ num1+" * "+num2+" = "+inputTwoNumber.getMultiplication(num1,num2));
        //System.out.println( "The division of "+ num1+" / "+inputTwoNumber.num2 +" = "+inputTwoNumber.getDivision(num1,num2));
        inputTwoNumber.getDivision(num1,num2);
        inputTwoNumber.convertNum1(num1);
        System.out.println();
    }
}
