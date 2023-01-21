public class EnhencePlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhencePlayer(String name) {
        this(name,100,"sword");
    }

    public EnhencePlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0) {
            this.health = 1;
        }else if (health > 100) {
            this.health = 100;
        }else {
            this.health = health;
        }
            this.weapon = weapon;
        }
    public void loseHealth(int damage){

        health = health - damage;
        if (health <= 0){
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaing(){
        return health;
    }

    public void getHealthRemaining(int extraHealth){
        if (health > 100) {
            System.out.println("Player record to 100%");
            health = 100;
        }
        health = health + extraHealth;
    }

    }

