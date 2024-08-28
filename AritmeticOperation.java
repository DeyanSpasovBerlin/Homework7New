package Zad2;

import java.util.Scanner;

public class AritmeticOperation {
    public double num1;
    public double num2;
    //private double div;

    public AritmeticOperation(Double num1, Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    double getSum(Double num1, Double num2){
        return num1 + num2;
    }
    double getExtraction(Double num1, Double num2){
        return num1 - num2;
    }
    double getMultiplication(Double num1, Double num2){
        return num1*num2;
    }
     void  getDivision(Double num1, Double num2){
        Scanner reader = new Scanner(System.in);
        while (num2 == 0.0){
                System.out.println("Division of 0 is forbiden! Please insert again second number:");
            num2 = Double.valueOf(reader.nextDouble());
                continue;
            }
         System.out.println(num1+" / "+num2+ " = "+num1/num2);
         }
         void convertNum1(Double num1){
            if(num1<=0){
                System.out.println("You have no any money!");
            } else {
                System.out.println(+num1 + " Euro = " + num1 * 1.12 + " USD");
            }
         }
}
