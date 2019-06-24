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

        System.out.println("Nội Dung: ");
        String noiDung = input.nextLine();

        System.out.println("Thời gian nhận: (int)");
        int thoiGianNhan = input.nextInt();
        input.nextLine();

        System.out.println("Đã đọc: (true/false)");
        boolean isRead = input.nextBoolean();

        Email email = new Email(tieuDe, nguoiGui, noiDung, thoiGianNhan, isRead);
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
        System.out.println("Bạn vừa nhận được " + size + " Gmail\n");
        for (int i = 0; i < size; i++) {
            Email email = inbox.get(i);
            System.out.println("Email thứ [" + i + "]" + email.toString());
            System.out.println();
        }
    }

    public void doiTrangThai(int index) {
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
            System.out.println("- Tiêu đề: " + inbox.get(j).getTieuDe() +
                    "\n - Người gửi: " + inbox.get(j).getNguoiGui() +
                    "\n - Nội dung: " + inbox.get(j).getNoiDung() +
                    "\n - Thời gian nhận: " + inbox.get(j).getThoiGianNhan() +
                    "\n - Trạng thái: " + inbox.get(j).getIsRead());
        }
    }

    public void diChuyenMail(int numberMail) {
        int moveMail = numberMail;
        if (moveMail > inbox.size()){
            moveMail = inbox.size();
        }
        for(int k = inbox.size() -1; k >= 0; k--){
            if (k > inbox.size() - moveMail){
                labelLastest.add(inbox.get(k));
                inbox.remove(k);
                System.out.println("Di chuyển thành công Email " + k);
            }
        }
    }

    public void xoaEmail(){
        for (int t = 0; t < inbox.size(); t++){
            inbox.remove(inbox.get(t));
        }
        System.out.println("Inbox is empty");
    }
}
