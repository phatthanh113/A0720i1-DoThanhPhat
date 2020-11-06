package _13_search.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(numbers,3));
    }
    public static int search(int[] array , int key) {
        int head = 0;
        int tail = array.length - 1;
        int mid = 0;
        while (head <= tail) {
            mid = (head + tail) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        return -1 ;
    }
}
