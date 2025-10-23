//Author:Elian Pena Ramos
//11/26/24
//Dungeon rooms
public class Dungeon {
    // The root of the tree
    Room root;

    // Method that creates the tree
    public Room createDungeon(Question[] arr) {
        // Creates the root
        Room room = new Room(
                "You have entered to a room, there is a person that you love, holding a knife with two ends. One of the ends is pointing to you and the other one is pointing to the person… To avoid any possible outcome, you have to answer quickly: ",
                arr[0]);
        // the next rooms
        room.left = new Room(
                "You entered to a new room. The body of the last person who tried to cross the room is now lying on the floor, among all the other bodies that once were asked: ",
                arr[1]);
        room.right = new Room(
                "You have entered to a room where a ghost is following you, you do not know what its intentions are when the ghost asks you: ",
                arr[2]);
        // Creates the next rooms but attached to the previous rooms, not to the root
        Room room2 = room.left;
        Room room3 = room.right;

        room2.left = new Room(
                "You have entered to an empty room, you do not feel like you are alone, however, you know that you will go to the next room if you answer the question: ",
                arr[3]);
        room2.right = new Room(
                "You have entered to a room, there are many beautiful butterflies, each one of them with different bright colors and toxic poison if they touch you. They are asleep right now but you might awake them and making them fly in the room if you answer wrong: ",
                arr[4]);

        room3.left = new Room(
                "You have entered to a room with no roof, a giant hand is reaching you from above. HURRY UP!!! It is going to catch you if you do not answer quickly the next question: ",
                arr[5]);
        room3.right = new Room(
                "You have entered to a room where there is a paper sheet from the last person who visited the room. The papers says that the answer is the option 2, there is no body and no visible way of how someone can get killed in the room, so you are not really sure if that answer is the correct for the question: ",
                arr[6]);

        Room room4 = room2.left;
        Room room5 = room2.right;

        room4.left = new Room(
                "You have entered to a room. The room is filling up with water, answer the question before is to late!!!: ",
                arr[7]);
        room4.right = new Room(
                "You have entered to a room. There is a dentist waiting for you to perform a tooth extraction using low quality anesthesia. You have to answer the next question to postpone your appointment: ",
                arr[8]);

        room5.left = new Room(
                "You have entered to a room. You are stepping on quicksand and it is getting hotter and hotter until it is really hurting your legs. You have to answer the next question to move on or else you will die covered under hot sand: ",
                arr[9]);
        room5.right = new Room(
                "You have entered to a room. The noise is low right now but after each second pass, it gets louder. Answer quick because before a minute has passed the sound will be able to shake your bones and make your ears bleed: ",
                arr[10]);

        Room room6 = room3.left;

        room6.left = new Room(
                "You have entered to a room, the room is getting smaller and smaller, it is shrinking. Answer quickly before you get crushed by the walls: ",
                arr[11]);
        room6.right = new Room(
                "You have entered to a room, every second you are getting bigger and bigger and it truly hurts. Answer quickly before you get crushed by your own body: ",
                arr[12]);
        // Returns the root
        return room;
    }

    // Getter for the root
    public Room getRoot() {
        return root;
    }

    // Sets the root with the root returned by the createDungeon method
    public Dungeon(Question[] brr) {
        root = createDungeon(brr);
    }
}

