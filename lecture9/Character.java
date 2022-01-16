package lecture9;

public class Character {

    String name;

    double blood;
    double magic;

    int positionX;
    int positionY;

    // parameter list: (String)
    Character(String theName) {
        name = theName;
    }

    // signature
    // return value, method name, parameter list
    // return value: None (constructor has no return value)
    // method name: Character (constructor has its name the same as the class)
    // parameter list: (String, int, int)
    Character(String theName, int thePositionX, int thePositionY) {
        name = theName;
        positionX = thePositionX;
        positionY = thePositionY;
    }

    void moveUp() { positionY -= 1; }
    void moveDown() { positionY += 1; }
    void moveLeft() { positionX -= 1; }
    void moveRight() { positionX += 1; }

    public String toString() {
        return "Character " + name + " (" + positionX + ", " + positionY + ")";
    }

    public boolean equals(Character other) {
        return name.equals(other.name);
    }


    public static void main(String[] args) {
        Character player1 = new Character("Kael'thas");
        Character player2 = player1;

        System.out.println(player1.toString());
        System.out.println(player2.toString());
        player1.moveRight();
        System.out.println(player1.toString());
        System.out.println(player2.toString());

        Character player3 = new Character("Swin");
        Character player4 = new Character("Swin");

        // Compares if player3 and player4 pointing to the same object
        if (player3 == player4) {
            System.out.println("They are equal!");
        } else {
            System.out.println("They are not equal!");
        }

        // Compares if player3 and player4 have the same attributes
        if (player3.equals(player4)) {
            System.out.println("They are equal!");
        } else {
            System.out.println("They are not equal!");
        }
    }

}
