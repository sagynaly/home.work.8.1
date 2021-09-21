package kg.geektech.game.players;



import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperPower.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int random = r.nextInt(3);
        if(random==1&&this.getHealth()>0&& boss.getHealth()>0){
            boss.setDamage(0);
            System.out.println(this.getName() + " |Оглушил босса в этом раунде Босс не может бить");
        }
        else{
            boss.setDamage(50);
        }
    }
}

