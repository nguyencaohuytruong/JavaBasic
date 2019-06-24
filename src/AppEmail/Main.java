package AppEmail;

public class Main {
    public static void main(String[] args) {
        EmailDAO emailDAO = new EmailDAO();
        emailDAO.checkThemMail();
        emailDAO.hienThiMail();
        emailDAO.danhDauDaDoc(1);
        emailDAO.hienThiMail();
        emailDAO.sapXepTheoTG();
        emailDAO.diChuyenMail();
        emailDAO.xoaEmail();
    }
}
