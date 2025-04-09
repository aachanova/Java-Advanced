package Ex03_PokemonTrainer;

public class Pokemon {
    private final String name;
    private final String element;
    private  int health;

    public String getName() { return name; }

    public String getElement() { return element; }

    public int getHealth() { return health; }

    public void setHealth(int health) {
        this.health = health;
    }

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;

    }
}
