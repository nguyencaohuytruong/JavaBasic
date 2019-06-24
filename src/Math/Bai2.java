package Math;

import java.util.Scanner;

public class Bai2 {
    private Scanner input = new Scanner(System.in);
    private int n;
    private int sum;
    public void loiGiai(){
        do {
            System.out.println("Nhập n: ");
            n = input.nextInt();
        } while (n <= 5 && n >= 20);

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Tổng S(n)= " + sum);
    }
}
