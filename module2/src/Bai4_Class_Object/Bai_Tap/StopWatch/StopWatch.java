package Bai4_Class_Object.Bai_Tap.StopWatch;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        System.out.println("Số mili giây đếm đc:" + (endTime - startTime));
    }

    public static void main(String[] args) {

        System.out.println("Đang đếm thời gian");
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            int element = (int) Math.floor(((Math.random() * 100000) + 1));
            arr[i] = element;
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(arr);
        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}
