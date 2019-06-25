package AppEmail;

import java.util.*;

public class EmailDAO {
    ArrayList<Email> inbox = new ArrayList<>();
    ArrayList<Email> labelLastest = new ArrayList<>();
    private static boolean continueInput = true;
    Scanner input = new Scanner(System.in);

    public void themMail() {
        System.out.println("------------------------------------");
        System.out.println("TIÊU ĐỀ: ");
        String tieuDe = input.nextLine();

        System.out.println("Người gửi: ");
        String nguoiGui = input.nextLine();
        while (!nguoiGui.matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")){
            System.out.println("Email không đúng định dạng mời nhập lại!");
            nguoiGui = input.nextLine();
        }

        System.out.println("Nội Dung: ");
        String noiDung = input.nextLine();

        System.out.println("Thời gian nhận (1-24): ");
        int thoiGianNhan;
        do {
            try {
                thoiGianNhan = input.nextInt();
                while (thoiGianNhan < 1 || thoiGianNhan > 24){
                    System.out.println("Thời gian không đúng định dạng mời bạn nhập lại!");
                    thoiGianNhan = input.nextInt();
                }
                continueInput = false;
            } catch (Exception e){
                System.out.println("Bạn hãy nhập giờ từ 1-24!");
                thoiGianNhan = input.nextInt();
            }
            input.nextLine();
        }
        while (continueInput);
        Email email = new Email(tieuDe, nguoiGui, noiDung, thoiGianNhan);
        inbox.add(email);
    }

    public void checkThemMail() {
        Scanner input = new Scanner(System.in);
        int nhap;
        do {
            System.out.println("------------------------------------");
            System.out.println("Bạn có muốn tạo thêm Gmail mới?\n" +
                    "1: Có | 2: Không");
            try {
                nhap = input.nextInt();
                    switch (nhap){
                        case 1:
                            themMail();
                            checkThemMail();
                            break;
                        case 2:
                            continueInput = false;
                            break;
                        default:
                            System.out.println("Câu trả lời không khớp. Mời bạn nhập lại!");
                            checkThemMail();
                            break;
                    }
            } catch (Exception e){
                System.out.println("Câu trả lời sai định dạng. Bạn vui lòng nhập lại bằng số!");
                checkThemMail();
            }
        } while (continueInput);
    }

    public void hienThiMail() {
        int size = inbox.size();
        System.out.println("------------------------------------");
        System.out.println("Bạn vừa nhận được " + size + " Gmail");
        for (int i = 0; i < size; i++) {
            Email email = inbox.get(i);
            System.out.println("Email thứ [" + i + "]" + email.toString());
        }
    }

    public void danhDauDaDoc(int index) {
        int size = inbox.size();
        if(index >= 0 && index < size){
            inbox.get(index).setIsRead(true);
        }
        System.out.println("------------------------------------");
        for (index = 0; index < size; index++) {
            Email email = inbox.get(index);
            System.out.println("Email thứ [" + index + "]" + email.toString());
        }
    }

    public void sapXepTheoTG(){
       Collections.sort(inbox, new Comparator<Email>() {

           @Override
           public int compare(Email email1, Email email2) {
               if (email1.getThoiGianNhan() < email2.getThoiGianNhan()){
                   return 1;
               } else {
                   if (email1.getThoiGianNhan() == email2.getThoiGianNhan()){
                       return 0;
                   } else {
                       return -1;
                   }
               }
           }
       });
        System.out.println("Danh sách Gmail được sắp xếp theo thời gian gửi gần nhất: ");
        hienThiMail();
    }

    public void diChuyenMail() {
        int numberMail;
        int size = inbox.size();
        do {
            System.out.println("Nhập số lượng Mail muốn di chuyển: ");
            try {
                numberMail = input.nextInt();
                if (numberMail > size || numberMail < 0){
                    System.out.println("Số lượng Email bạn muốn xóa không tồn tại hoặc vượt quá số lượng Email trong danh sách. Mời bạn nhập lại!");
                    numberMail = input.nextInt();
                }
            } catch (Exception e){
                System.out.println("Nhập không đúng định dạng mời nhập lại");
                numberMail = input.nextInt();
            }
        } while (continueInput);
        List<Email> lastestEmails = inbox.subList(0, numberMail);
        labelLastest.addAll(lastestEmails);
        inbox.removeAll(lastestEmails);
    }

    public void xoaEmail(){
        int numberMail;
        System.out.println("Nhập số Email muốn xóa: ");
        numberMail = input.nextInt();
        inbox.remove(numberMail);


        System.out.println("Inbox is empty");
    }


}
