package Segu.Model;

public class Team {
    private String leader;
    private String members;
    private String job;
    private String seating;
    protected String nameMechanisms;

    public Team(String leader, String members, String job, String seating){
        this.leader = leader;
        this.members = members;
        this.job = job;
        this.seating = seating;
    }

    public String getLeader() {
        return leader;
    }

    public String getMembers() {
        return members;
    }

    public String getJob() {
        return job;
    }

    public String getSeating() {
        return seating;
    }

    public String getNameMechanisms() {
        return nameMechanisms;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public void setNameMechanisms(String nameMechanisms) {
        this.nameMechanisms = nameMechanisms;
    }
}
