package AppEmail;

public class Main {
    public static void main(String[] args) {
        EmailDAO emailDAO = new EmailDAO();
        emailDAO.checkThemMail();
        emailDAO.hienThiMail();
        emailDAO.doiTrangThai(2);
        emailDAO.hienThiMail();
        emailDAO.sapXepTheoTG();
        emailDAO.diChuyenMail(3);
        emailDAO.xoaEmail();
    }
}