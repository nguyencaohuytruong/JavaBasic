package Segu.Model;

public class Chairman {
    public static final String DEVELOPER = "Developer";
    public static final String DESIGN = "Design";
    public static final String GAME = "Game";
    public static final String MAKETING = "Maketing";
    public static final String ALL_TEAM = "";


    public void showMembers(String teamTypes){
        System.out.println("Hiển thị tất cả các thành viên " + teamTypes);
    }

    public void addMember(Team team, String nameMember, String job) {
        nameMember = team.getMembers();
        job = team.getJob();
        System.out.println("Thêm thành viên " + nameMember  + " công việc " + job);
    }

    public void removeMember(Team team, String nameMember){
        nameMember = team.getMembers();
        System.out.println("Sa thải nhân viên " + nameMember + " bộ phận " + team.getNameMechanisms());
    }

    public void moveMember(Team team, String newMechanisms){
        String oldMechanisms = team.getNameMechanisms();
        team.setNameMechanisms(newMechanisms);
        System.out.println("Chuyển nhân viên " + team.getMembers() + " từ bộ phận " + oldMechanisms + " sang bộ phận " + newMechanisms);
    }

    public void informationMember(Team team, String nameMember){
        nameMember = team.getMembers();
        System.out.println("Thông tin thành viên " + nameMember + " là: " + " leader " + team.getLeader() + ", " + " công việc " + team.getJob()  + ", " + " chỗ ngồi "+ team.getSeating());
    }

    public void renameTeam(Team team, String newTeam){
        String oldTeam = team.getNameMechanisms();
        team.setNameMechanisms(newTeam);
        System.out.println("Đổi tên bộ phận " + oldTeam + " thành " + newTeam);
    }
}
