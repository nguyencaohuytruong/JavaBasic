package Segu.Model;

public class Developer extends Team {
    public Developer(String leader, String members, String job, String seating) {
        super(leader, members, job, seating);
        this.nameMechanisms = "Developer";
    }
}
