//Author:Elian Pena Ramos
//CS 2
//TA:Manuel Gutierrez
//11/26/24
//lab 9
//Instructor:Monika Akbar
//Dungeon rooms
// CS2401
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
