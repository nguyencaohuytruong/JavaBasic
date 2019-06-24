package Math;

import java.util.Scanner;

public class Bai3 {
    private Scanner input = new Scanner(System.in);
    private int n;
    private int sum;
    public void loiGiai(){
        do {
            System.out.println("Nhập n: ");
            n = input.nextInt();
        } while (n <= 7);

        for (int i = 1; i <= n; i++) {
            sum += 1/i ;
        }
        System.out.println("Tổng S(n)= " + sum);
    }
}
