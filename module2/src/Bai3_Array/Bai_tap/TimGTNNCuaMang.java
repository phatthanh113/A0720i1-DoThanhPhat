package Bai3_Array.Bai_tap;

public class TimGTNNCuaMang {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,1,8,9,-3};
        int min = array[0];
        for(int element : array) {
            if(min>element) {
                min=element;
            }
        }
        System.out.println("GTNN của mảng là "+ min);
    }
}
