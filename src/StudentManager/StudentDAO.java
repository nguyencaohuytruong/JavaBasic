package StudentManager;

import java.util.*;


public class StudentDAO {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Student> listStudent = new ArrayList<Student>();

    public void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã số sv: ");
        String code = input.nextLine();

        System.out.println("Nhập tên sv: ");
        String name = input.nextLine();
        while(!name.matches("^[a-zA-Z]{3,30}$")){
            System.out.println("Bạn đã nhập sai ký tự hoặc tên của bạn quá ngắn!");
            name = input.nextLine();
        }

        System.out.println("Nhập ngày sinh: ");
        boolean continueInput = true;
        int day = 0;
        do {
            try {
                day = input.nextInt();
                while (day < 1 || day > 31) {
                    System.out.println("Ngày sinh không hợp lệ mời nhập lại: ");
                    day = input.nextInt();
                }
                continueInput = false;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập ngày bằng số từ 1-31!");
            }
            input.nextLine();
        }
        while (continueInput);

        System.out.println("Nhập tháng sinh: ");
        continueInput = true;
        int month = 0;
        do {
            try {
                month = input.nextInt();
                while (month < 1 || month > 12) {
                    System.out.println("Tháng sinh không hợp lệ mời nhập lại: ");
                    month = input.nextInt();
                }
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Bạn phải nhập tháng bằng số từ 1-12!");
            }
            input.nextLine();
        }
        while (continueInput);

        System.out.println("Nhập năm sinh: ");
        continueInput = true;
        int year = 0;
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        do {
            try {
                year = input.nextInt();
                while (year > yearNow) {
                    System.out.println("Năm sinh quá lớn mời nhập lại: ");
                    year = input.nextInt();
                } while (year < 1900) {
                    System.out.println("Năm sinh không hợp lệ mời nhập lại: ");
                    year = input.nextInt();
                }
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Bạn phải nhập năm sinh bằng số!");
            }
            input.nextLine();
        }
        while (continueInput);

        System.out.println("Nhập lớp: ");
        String classRoom = input.nextLine();

        System.out.println("Nhập ngành: ");
        String department = input.nextLine();

        Student student = new Student(code, name, day, month, year, classRoom, department);
        listStudent.add(student);
    }

//    public static void main(String[] args) {
////        int maxChar = 20;
////        String studentIdTitle = "Mã sinh viên";
////        int spaceCount = (maxChar - studentIdTitle.length()) / 2 - 1;
////        String str1 = String.format("%-" + spaceCount + "s%s%" + spaceCount + "s%-"+spaceCount+"s%s%" + spaceCount + "s", "|", "Mã sinh viên", "", "|", "Tên sinh viên", "|");
////
////        System.out.println(str1);
//        String str1 = String.format("%-3s%s%2s%-3s%s%2s%-3s%s%2s%-3s%s%2s%-3s%s%3s","|","Mã sinh viên","","|","Tên sinh viên","","|","Ngày sinh","","|","Tên lớp","","|","Tên ngành","|");
//        System.out.println(str1);
//    }


    public void showStudent() {
//        int maxChar = 20;
//        String studentIdTitle = "Mã sinh viên";
//        int spaceCount = (maxChar - studentIdTitle.length()) / 2;
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            System.out.println("-------------------------------------- DANH SÁCH SINH VIÊN ---------------------------------------");
//            String str1 = String.format("%"+spaceCount+"s%s%" +spaceCount+"s", "| ","Mã sinh viên", "|");
//            System.out.println(str1);
            String str1 = String.format("%-3s%s%2s%-3s%s%2s%-3s%s%2s%-3s%s%2s%-3s%s%3s","|","Mã sinh viên","","|","Tên sinh viên","","|","Ngày sinh","","|","Tên lớp","","|","Tên ngành","|");
            System.out.println(str1);
//            System.out.println("| \t Mã sinh viên \t | \t Tên sinh viên \t | \t\t Ngày sinh \t\t | \t Tên lớp \t | \t Tên ngành \t |");
            System.out.println("| \t\t" + student.getCode() + "\t\t | \t\t" +
                    student.getName() + "\t\t | \t\t" +
                    student.getDay() + "-" + student.getMonth() + "-" + student.getYear() + "\t | \t\t" +
                    student.getClassRoom() + "\t\t | \t\t" +
                    student.getDepartment() + "\t\t |");
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    }

    public void editStudent() {
        System.out.println("Nhập mã sinh viên cần sửa: ");
        String code = input.next();
        boolean isExisted = false;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            if (student.getCode().equals(code)) {
                isExisted = true;
                System.out.println("Nhập mã sinh viên mới: ");
                String newCode = input.nextLine();

                System.out.println("Nhập tên sinh viên mới: ");
                String newName = input.nextLine();
                while(!newName.matches("^[a-zA-Z]{3,15}$")){
                    System.out.println("Bạn phải nhập tên bằng kí tự chữ!");
                    newName = input.nextLine();
                }

                System.out.println("Nhập ngày sinh mới: ");
                int newDay = input.nextInt();

                System.out.println("Nhập tháng sinh mới: ");
                int newMonth = input.nextInt();

                System.out.println("Nhập năm sinh mới: ");
                int newYear = input.nextInt();
                input.nextLine();

                System.out.println("Nhập lớp mới: ");
                String newClassRoom = input.nextLine();

                System.out.println("Nhập ngành mới: ");
                String newDepartment = input.nextLine();

                System.out.println("Sửa sinh viên thành công!");

                student.setCode(newCode);
                student.setName(newName);
                student.setDay(newDay);
                student.setMonth(newMonth);
                student.setYear(newYear);
                student.setClassRoom(newClassRoom);
                student.setDepartment(newDepartment);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy sinh viên mang mã: " + code);
        }
    }

    public void deleteStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String code = input.next();
        boolean check = false;
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            if (student.getCode().equals(code)) {
                check = true;
                listStudent.remove(student);
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên mang mã: " + code);
        } else {
            System.out.println("Xóa học sinh thành công");
        }
    }

}