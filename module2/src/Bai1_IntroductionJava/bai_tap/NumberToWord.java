package Bai1_IntroductionJava.bai_tap;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập số");
        int number= scanner.nextInt();
        String word = null;
// Dưới 10
        if(number >=0 && number <10) {
        switch (number) {
            case 0:
                word="zero";break;
            case 1:
                word="one";break;
            case 2:
                word="two";break;
            case 3:
                word="three";break;
            case 4:
                word="four";break;
            case 5:
                word="five";break;
            case 6:
                word="six";break;
            case 7:
                word="seven";break;
            case 8:
                word="eight";break;
            case 9:
                word="nine";break;
            case 10:
                word="ten";break;
            default:
                System.out.println("out of ability");break;
        }
        }
// Dưới 20
        else if(number<20) {
            int ones = number - 10 ;
        switch (ones) {
            case 1 :
                word= "eleven";break;
            case 2 :
                word= "twelve";break;
            case 3 :
                word= "thirteen";break;
            case 4 :
                word= "fourteen";break;
            case 5 :
                word= "fifteen";break;
            case 6 :
                word= "sixteen";break;
            case 7 :
                word= "seventeen";break;
            case 8 :
                word= "eightteen";break;
            case 9 :
                word= "nineteen";break;
        }
        }
// Dưới 100
        else if(number<100) {
            int ones= number%10;
            int tens = (number - ones) /10;
            String onesWord=null;
            String tensWord=null;
            switch (ones) {
                case 0 :
                    onesWord="";break;
                case 1 :
                    onesWord= "one";break;
                case 2 :
                    onesWord= "two";break;
                case 3 :
                    onesWord= "three";break;
                case 4 :
                    onesWord= "four";break;
                case 5 :
                    onesWord= "five";break;
                case 6 :
                    onesWord= "six";break;
                case 7 :
                    onesWord= "seven";break;
                case 8 :
                    onesWord= "eight";break;
                case 9 :
                    onesWord= "nine";break;
            }
            switch (tens) {
                case 2 :
                    tensWord= "twenty";break;
                case 3 :
                    tensWord= "thirty";break;
                case 4 :
                    tensWord= "fourty";break;
                case 5 :
                    tensWord= "fifty";break;
                case 6 :
                    tensWord= "sixty";break;
                case 7 :
                    tensWord= "seventy";break;
                case 8 :
                    tensWord= "eighty";break;
                case 9 :
                    tensWord= "ninety";break;
            }
            word = tensWord + '-' + onesWord;
        }
// Dưới 1000
        else if(number<1000) {
            int ones= (number%100)%10;
            int tens = (number%100 - ones) /10;
                int hundreds= (number -tens*10-ones)/100;
            String onesWord=null;
            String tensWord=null;
                String hundredsWord=null;
            switch (ones) {
                case 0 :
                    onesWord="";break;
                case 1 :
                    onesWord= "one";break;
                case 2 :
                    onesWord= "two";break;
                case 3 :
                    onesWord= "three";break;
                case 4 :
                    onesWord= "four";break;
                case 5 :
                    onesWord= "five";break;
                case 6 :
                    onesWord= "six";break;
                case 7 :
                    onesWord= "seven";break;
                case 8 :
                    onesWord= "eight";break;
                case 9 :
                    onesWord= "nine";break;
            }
            switch (tens) {
                case 1 : {
                    onesWord="";
                    switch (ones) {
                        case 1 :
                            tensWord= "eleven";break;
                        case 2 :
                            tensWord= "twelve";break;
                        case 3 :
                            tensWord= "thirteen";break;
                        case 4 :
                            tensWord= "fourteen";break;
                        case 5 :
                            tensWord= "fifteen";break;
                        case 6 :
                            tensWord= "sixteen";break;
                        case 7 :
                            tensWord= "seventeen";break;
                        case 8 :
                            tensWord= "eightteen";break;
                        case 9 :
                            tensWord= "nineteen";break;
                    }
                }break;
                case 2 :
                    tensWord= "twenty";break;
                case 3 :
                    tensWord= "thirty";break;
                case 4 :
                    tensWord= "fourty";break;
                case 5 :
                    tensWord= "fifty";break;
                case 6 :
                    tensWord= "sixty";break;
                case 7 :
                    tensWord= "seventy";break;
                case 8 :
                    tensWord= "eighty";break;
                case 9 :
                    tensWord= "ninety";break;
            }
            switch (hundreds) {
                case 1 :
                    hundredsWord= "one hundred";break;
                case 2 :
                    hundredsWord= "two hundred";break;
                case 3 :
                    hundredsWord= "three hundred";break;
                case 4 :
                    hundredsWord= "four hundred";break;
                case 5 :
                    hundredsWord= "five hundred";break;
                case 6 :
                    hundredsWord= "six hundred";break;
                case 7 :
                    hundredsWord= "seven hundred";break;
                case 8 :
                    hundredsWord= "eight hundred";break;
                case 9 :
                    hundredsWord= "nine hundred";break;
            }
            word = hundredsWord +'-'+ tensWord +'-'+ onesWord ;
        }
        System.out.println(word);
    }
}
