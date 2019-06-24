package Segu.Model;

public class Designer extends SeguMembers {
    public Designer(String nameMember, String nameCompetence) {
        super(nameMember, nameCompetence);
        this.jobTitle ="Designer";
    }

    @Override
    public void work() {
        System.out.println("Thiết kế app");
    }
}
