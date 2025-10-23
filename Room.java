//Author:Elian Pena Ramos
//11/26/24
//Dungeon rooms

public class Room {
    // Room atributes
    public String description;
    public Question oneQuestion;
    public Room left;
    public Room right;

    // Room constructors
    public Room(String roomDescription, Question theQuestion) {
        description = roomDescription;
        oneQuestion = theQuestion;
        left = null;
        right = null;
    }
}

