class GameCharacter {
    String name;
    
    GameCharacter(String name) {
        this.name = name;
    }
    
    void attack() {
        System.out.println(name + " attacks");
    }
}

class Warrior extends GameCharacter {
    Warrior(String name) {
        super(name);
    }
    
    void attack() {
        System.out.println(name + " swings sword - melee damage");
    }
}

class Archer extends GameCharacter {
    int arrowCount;
    
    Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }
    
    void attack() {
        if(arrowCount > 0) {
            System.out.println(name + " shoots arrow (remaining: " + --arrowCount + ")");
        } else {
            System.out.println(name + " has no arrows");
        }
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] characters = {
            new Warrior("Conan"),
            new Archer("Legolas", 5)
        };
        
        for(GameCharacter c : characters) {
            c.attack();
        }
    }
}
