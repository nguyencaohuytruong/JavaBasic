package AppEmail;

public class Main {
    public static void main(String[] args) {
        EmailDAO emailDAO = new EmailDAO();
        emailDAO.checkThemMail();
        emailDAO.hienThiMail();
        emailDAO.danhDauDaDoc(1);
        emailDAO.sapXepTheoTG();
        emailDAO.diChuyenMail();
    }
}
