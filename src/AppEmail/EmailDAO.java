package AppEmail;

import java.util.*;

public class EmailDAO {
    ArrayList<Email> inbox = new ArrayList<>();
    ArrayList<Email> labelLastest = new ArrayList<>();

    public void themMail() {
        Scanner input = new Scanner(System.in);
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
        boolean continueInput = true;
        int thoiGianNhan = 0;
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
            }
            input.nextLine();
        }
        while (continueInput);
        Email email = new Email(tieuDe, nguoiGui, noiDung, thoiGianNhan);
        inbox.add(email);
    }

    public void checkThemMail() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Bạn có muốn tạo thêm Gmail mới?\n" +
                    "1: Có | 2: Không");
            int nhap;
            nhap = input.nextInt();
            if (nhap == 1){
                themMail();
            } else {
                check = false;
            }
        }
    }

    public void hienThiMail() {
        int size = inbox.size();
        System.out.println("Bạn vừa nhận được " + size + " Gmail");
        for (int i = 0; i < size; i++) {
            Email email = inbox.get(i);
            System.out.println("Email thứ [" + i + "]" + email.toString());
        }
    }

    public void danhDauDaDoc(int index) {
        int size = inbox.size();
        if(index > 0 && index < size){
            inbox.get(index).setIsRead(true);
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
        for (int j = 0; j < inbox.size(); j++){
            System.out.println(inbox.get(j).toString());
        }
    }

    public void diChuyenMail() {
        Scanner input = new Scanner(System.in);
        int size = inbox.size();
        int numberMail = input.nextInt();
        if (numberMail > size || numberMail < 0){
            System.out.println("Số lượng Email bạn muốn xóa không tồn tại hoặc vượt quá số lượng Email trong danh sách. Mời bạn nhập lại!");
            numberMail = input.nextInt();
        }
        List<Email> lastestEmails = inbox.subList(0, numberMail);
        labelLastest.addAll(lastestEmails);
        inbox.removeAll(lastestEmails);
    }

    public void xoaEmail(){
//        for (int t = 0; t < inbox.size(); t++){
//            inbox.remove(inbox.get(t));
//        }
//        System.out.println("Inbox is empty");
        while (!inbox.isEmpty()){
            inbox.remove(0);
        }
        System.out.println("Inbox is empty");
    }


}
