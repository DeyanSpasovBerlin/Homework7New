package Zad1;

import java.util.Scanner;
public class Homework7Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please inserd first word: ");
        String value1 = "";
        while (true) {
             value1 = String.valueOf(reader.nextLine());
            if (value1.equals("")) {
                System.out.println("Empty word is forbiden!");
                System.out.println("Please inserd first word: ");
                continue;
            } else {
            System.out.println("You input first word: " + value1);
            break;
            }
        }
        System.out.println("Please inserd second word: ");
        String value2 = "";
        while (true){
            value2 = String.valueOf(reader.nextLine());
            if(value2.equals("")){
                System.out.println("Empty word is forbiden!");
                System.out.println("Please inserd second word:");
                continue;
            } else {
                System.out.println("You input second word: "+value2);
                break;
            }
        }
        TwoWords inputTwoWords = new TwoWords(value1,value2);
        System.out.println("First half from first word is: "+inputTwoWords.getFirstHalf(value1));
        System.out.println("Second half from second word is: "+inputTwoWords.getSecondHalf(value2));
        System.out.println("Concatenation from first hal of first word + second half of second word is: "+inputTwoWords.concatTwoWords(inputTwoWords.getFirstHalf(value1),inputTwoWords.getSecondHalf(value2)));
    }
}
