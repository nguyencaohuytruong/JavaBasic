package Game.model;

public class King implements Character {
    int mucDoAn = 10;

    public King(Repository repository) {
        eat();
        repository.consume(mucDoAn);
    }

    @Override
    public void eat() {
        System.out.println("Vua ăn " + mucDoAn + " tấn gạo");
    }

    @Override
    public int checkConsume() {
        return mucDoAn;
    }

    public void raLenhLamRuong(Repository repository){
        for (int i = 1; i <= 10; i++){
            Farmer farmer = new Farmer();
            farmer.eat();
            repository.consume(farmer.checkConsume());
            farmer.lamRuong();
            repository.add(farmer.checkAdd());
        }
    }

    public void raLenhDoTham(Repository repository){
        Spy spy = new Spy();
        spy.eat();
        repository.consume(spy.checkConsume());
        spy.doTham(1);
    }

    public void raLenhPhongThu(Repository repository){
        for (int j = 1; j <= 10; j++){
            Soldier soldier = new Soldier();
            soldier.eat();
            repository.consume(soldier.checkConsume());
            soldier.phongthu();
        }
    }

    public void ralenhTanCong(Repository repository, String vuKhi) {
        for (int k = 1; k <= 10; k++){
            Knight knight = new Knight(vuKhi);
            knight.eat();
            repository.consume(knight.checkConsume());
            knight.tanCong();
        }
    }
}
