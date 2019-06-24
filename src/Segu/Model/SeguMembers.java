package Segu.Model;

public abstract class SeguMembers {
    private String name;
    private String competence;
    protected String jobTitle;

    public SeguMembers(String nameMember, String nameCompetence){
        this.name = nameMember;
        this.competence = nameCompetence;
    }

    public String getNameMember() {
        return name;
    }

    public String getNameCompetence() {
        return competence;
    }

    public void setNameMember(String nameMember) {
        this.name = nameMember;
    }

    public void setNameCompetence(String nameCompetence) {
        this.competence = nameCompetence;
    }

    public abstract void work();
}


