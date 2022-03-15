package MorseAssignment;

import java.util.Scanner;

public class MorseMain {

    public static void main(String[] args) {


        Converter convert = new Converter();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Type in morsecode or an english phrase you want to convert:");
            String phrase = sc.nextLine();

            while (true) {

                System.out.println("It is converted to :" + convert.MorseToEng(phrase));

                break;
            }
    }
}









