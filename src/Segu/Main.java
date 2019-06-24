package Segu;

import Segu.Model.*;

public class Main {

    public static void main(String[] args) {
        Chairman chairman = new Chairman();
        chairman.showMembers(Chairman.ALL_TEAM);
        chairman.showMembers(Chairman.DEVELOPER);
        Maketing maketing = new Maketing("Dương Hoài","Hoàng Sơn","Maketing","bên tay phải");
        chairman.renameTeam(maketing,"Tester");
        Developer developer = new Developer("Đào Duy","Nguyễn Trường","Dev","đối diện team Maketing");
        Design design = new Design("Nguyễn Đức","Nguyễn Nguyệt","Design","thẳng cửa đi vào");
        chairman.moveMember(developer,"Design");
        chairman.informationMember(design,"Nguyễn Nguyệt");
        chairman.removeMember(maketing,"Hoàng Sơn");
        chairman.addMember(developer,"Đặng Hà","Android");
    }
}
