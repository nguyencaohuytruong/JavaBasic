package Math;

import java.util.Scanner;

public class Bai1 {
    private Scanner input = new Scanner(System.in);
    private int n;
    private int sum;
    public void loiGiai(){
        do {
            System.out.println("Nhập n: ");
            n = input.nextInt();
        } while (n < 3 && n > 50);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng S(n)= " + sum);
    }
}
