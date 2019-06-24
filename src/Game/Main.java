package Game;


import Game.model.*;


public class Main {

    private static Repository repository;

    public static void main(String[] args) {
        repository = new Repository();

        King king = new King(repository);

        king.raLenhLamRuong(repository);

        king.raLenhDoTham(repository);

        king.raLenhPhongThu(repository);

        king.ralenhTanCong(repository, Knight.GUOM);
    }

}
