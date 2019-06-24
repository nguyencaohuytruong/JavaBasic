package Ptb2;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập a: ");
        int a = input.nextInt();
        System.out.println("Nhập b: ");
        int b = input.nextInt();
        System.out.println("Nhập c: ");
        int c = input.nextInt();
        int delta = 0;
        if (a==0) {
            System.out.println("Phương trình bậc 1");
        } else {
            delta=b*b-4*a*c;
            System.out.println("Delta = " + delta);
            if (delta<0){
                System.out.println("Phương trình vô nghiệm");
            }
            if (delta==0){
                System.out.println("Phương trình có nghiệm kép: x =" + -b/2*a);
            }
            if (delta>0){
                System.out.println("Phương trình có 2 nghiệm phân biệt:\n" +
                        "x1 = " + (-b+Math.sqrt(delta))/2*a + " và\n" +
                        "x2 = " + (-b-Math.sqrt(delta))/2*a );
            }
        }
    }
}
