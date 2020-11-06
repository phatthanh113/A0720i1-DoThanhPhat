package _11_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.spi.LocaleNameProvider;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome string = new Palindrome();
        string.setStr(("Able was I ere I saw Elba").toLowerCase());
        String[] strings = string.getStr().split("");
        Stack<String> mWord = new Stack<>();
        Queue<String> dWord = new LinkedList<>();
        addElement(mWord,dWord,strings);
        System.out.println(compare(mWord,dWord));
    }
//  method thêm phần tử vào queue
    public static <T> void addElement(Stack<T> stack,Queue<T> queue , T[] elements) {
        for (int i = 0; i <elements.length ; i++) {
            stack.add(elements[i]);
            queue.add(elements[i]);
        }
    }
//    method so sánh
    public static boolean compare(Stack<?> stack,Queue<?> queue) {
        while (!stack.isEmpty()){
            if(stack.pop() == queue.poll()) {
                return true;
            }
        }
        return false;
    }
}
