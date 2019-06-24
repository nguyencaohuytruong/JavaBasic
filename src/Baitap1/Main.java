package Baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Me me = new Me("Trường", "đen", 1.72f, 50f);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giờ:");
        long time = input.nextLong();
        if (time == 6) {
            me.thucGiac();
            me.diHoc();
        } else if (time == 11) {
            me.tanHoc();
        } else if (time >= 13 && time < 18) {
            me.diChoi();
        } else if (time == 18) {
            me.tapGym();
            me.giamCan();
        } else {
            me.ngu();
        }
        hoi(time, me);
//        boolean check = true;
//        while (check) {
//            System.out.println("Bạn muốn tiếp tục hay kết thúc?\n" +
//                    "Nhập 1: tiếp tục, 2: kết thúc");
//            int nhap = input.nextInt();
//            if (nhap == 1) {
//                System.out.println("Nhập giờ:");
//                time = input.nextLong();
//                if (time == 6) {
//                    me.thucGiac();
//                    me.diHoc();
//                } else if (time == 11) {
//                    me.tanHoc();
//                } else if (time >= 13 && time < 18) {
//                    me.diChoi();
//                } else if (time == 18) {
//                    me.tapGym();
//                    me.giamCan();
//                } else {
//                    me.ngu();
//                }
//            } else {
//                check = false;
//            }
//        }

    }
    public static  boolean check = true;

    public static void hoi(long time, Me me){
        if (check){
            Scanner input = new Scanner(System.in);
            System.out.println("Bạn muốn tiếp tục hay kết thúc?\n" +
                    "Nhập 1: tiếp tục, 2: kết thúc");
            int nhap = input.nextInt();
            if (nhap == 1) {
                System.out.println("Nhập giờ:");
                time = input.nextLong();
                if (time == 6) {
                    me.thucGiac();
                    me.diHoc();
                } else if (time == 11) {
                    me.tanHoc();
                } else if (time >= 13 && time < 18) {
                    me.diChoi();
                } else if (time == 18) {
                    me.tapGym();
                    me.giamCan();
                } else {
                    me.ngu();
                }
            } else {
                check = false;
            }
            hoi(time, me);
        }
    }
}
