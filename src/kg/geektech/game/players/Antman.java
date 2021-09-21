package players;


import general.SuperPower;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;

import java.util.Random;

public abstract class Antman extends Hero implements HavingSuperPower{
    public Antman(int health, int damage, String name) {
        super(health, damage, SuperPower.DOUBLE_ARROW, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int random = r.nextInt(3);
        switch(random){
            case 0:
                this.setHealth(this.getHealth()/2);
                boss.setHealth(boss.getHealth()- (this.getDamage()/2));
                System.out.println(this.getName()+ " | Уменшил себе хп и урон в 2 раза ");
                break;
            case 1:

                break;
            case 2:
                this.setHealth(this.getHealth()*2);
                boss.setHealth(boss.getHealth()- (this.getDamage()*2));
                System.out.println(this.getName()+ " | Увеличил себе хп и урон в 2 раза ");
                break;
            default:
                this.setHealth(0);
                break;
        }

    }
}
