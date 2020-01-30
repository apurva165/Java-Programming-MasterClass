package section7.encapsulation;

public class Player {
    public String name;
    public int health;
    public String  weapon;



    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0 ){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
