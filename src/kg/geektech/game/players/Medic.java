package kg.geektech.game.players;

public class Medic extends Hero{
    public Medic(int health, int damage, SuperPower superPower, String name) {
        super(health, damage, superPower, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

}
