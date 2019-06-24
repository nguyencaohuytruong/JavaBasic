package Segu.Model;

public class Game extends Team {
    public Game(String leader, String members, String job, String seating) {
        super(leader, members, job, seating);
        this.nameMechanisms = "Game";
    }
}
