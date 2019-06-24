package StudentManager;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Chương trình quản lý sinh viên
 * Gồm có các tính năng
 * 1. Nhập thông tin sinh viên theo danh sách (cho phép chọn số lượng)
 * 2. Hiển thị thông tin sinh viên theo danh sách đã nhập (có format giao diện console đảm bảo dễ nhìn, đẹp)
 * 3. Lưu thông tin sinh viên theo danh sách vào cơ sở dữ liệu (File, SQL...)
 * 4. Chỉnh sửa thông tin sinh viên theo mã số
 * 5. Xóa 1 sinh viên theo mã số
 * <p>
 * Thông tin sinh viên
 * 1. Mã số (UID)
 * 2. Tên
 * 3. Năm sinh
 * 4. Tháng sinh
 * 5. Ngày sinh
 * 6. Lớp
 * 7. Khoa
 * 8. ...
 * <p>
 * Giao diện chương trình
 * ---------- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----------
 * 1. Nhập thông tin sinh viên
 * 2. Hiển thị danh sách
 * 3. ....
 * <p>
 * <p>
 * Hiển thị danh sách
 * ---------- DANH SÁCH SINH VIÊN LỚP C0909L ----------
 * Mã số    | Họ tên            | DOB           |   ...
 * 1        | Cao Huy Trường    | 01/01/2000    |
 * 2        | Cao Huy Trường    | 01/01/2000    |
 */
public class Main {
    private static Scanner input = new Scanner(System.in);

    private static void menu() {
        System.out.println("---------- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----------");
        System.out.println("|           1. Nhập thông tin sinh viên.           |");
        System.out.println("|           2. Hiển thị danh sách sinh viên.       |");
        System.out.println("|           3. Sửa sinh viên.                      |");
        System.out.println("|           4. Xóa sinh viên.                      |");
        System.out.println("|           5. Thoát khỏi chương trình.            |");
        System.out.println("----------------------------------------------------");
        System.out.println("Chọn chức năng từ 1-5!");
    }


    public static void main(String[] args) {
        boolean quit = false;
        StudentDAO studentDAO = new StudentDAO();
        menu();
        while (true) {
            boolean continueInput = true;
            int action = 0;
            do {
                try {
                    action = input.nextInt();
                    continueInput = false;
                } catch (InputMismatchException ex) {
                    System.out.println("Bạn phải chọn chức năng từ 1-5!");
                }
                input.nextLine();
            }
            while (continueInput);

            switch (action) {
                case 1:
                    studentDAO.addStudent();
                    break;
                case 2:
                    studentDAO.showStudent();
                    break;
                case 3:
                    studentDAO.editStudent();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc.");
                    quit = true;
                    break;
            }
            if (quit) {
                break;
            }
            menu();
        }
    }
}
