package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestStopWatch {
    private long starTime;
    private long endTime;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    public TestStopWatch() {
        Date date = new Date();
        starTime = date.getTime();
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void star() {
        Date date = new Date();
        starTime = date.getTime();
        System.out.println(sdf.format(date));

    }

    public void stop() {
        Date date = new Date();
        endTime = date.getTime();
        System.out.println(sdf.format(date));
    }

    public long getElapsedTime() {
        return ((endTime - starTime)/1000 );
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestStopWatch testStopWatch = new TestStopWatch();



        while (true){
            System.out.println("mời bạn nhập vào lựa chọn : " +"\n"+
                    "1.Star " + "\n"+
                    "2.Stop" +"\n"+
                    "0.exit");
            int c = sc.nextInt();
            switch (c){
                case 1 :
                    System.out.println("thời gian bắt đầu : ");
                    testStopWatch.star();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("thời gian két thúc : " );
                             testStopWatch.stop();
                    System.out.println("tổng thời gian thực hiện " + testStopWatch.getElapsedTime() + "s");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("chương trình kết thúc");
                    System.exit(0);
            }
        }





    }

}


