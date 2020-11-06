package _11_stack_queue.exercise;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 110 ;
        Stack<Integer> numberBinary = new Stack<>();
        convert(number,numberBinary);
        printElement(numberBinary);
    }
    public static void convert(int number,Stack<Integer> numbers) {
        int surplus = 0;
        while (number>0) {
            numbers.push(number%2);
            number /= 2;
        }
        if(numbers.size()<8) {
            numbers.add(0);
        }
    }
    public static void printElement(Stack<Integer> numbers) {
        String result = "";
        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop());
        }
    }
}
