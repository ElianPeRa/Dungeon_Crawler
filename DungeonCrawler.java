
//Author:Elian Pena Ramos
//11/26/24
//Dungeon rooms

import java.util.Scanner;

public class DungeonCrawler {
    public static void main(String[] args) {
        // Creates the array of questions using the scan method
        Question[] questions = QuestionLoader
                .scan("computer_science_questions.csv");
        // Creates the Dungeon (the tree)
        Dungeon dungeon = new Dungeon(questions);
        System.out.println(
                "Welcome Room Traveler \n In this moment you have only 3 lives, do not lose them |┬┴┬┴┤ (*_├┬┴┬┴|");
        // Number of lives
        int lives = 3;
        // Starts the game, prints the questions
        print(dungeon.getRoot(), lives);
    }

    public static void print(Room temp, int lives) {
        // If the Room Traveler reaches the end, then the game ends
        if (temp == null) {
            System.out.println(
                    "Seems that you found the end, congratulations!!!! You are not dead now, tomorrow who knows");
            System.out.println("https://youtu.be/XkCA2XqUJ4o?si=4rKsHsmUOMRxNmHq");
            return;
        }
        // Prints the descriptions
        System.out.println(temp.description);
        // Displays the questions
        temp.oneQuestion.displayQuestion();
        System.out.println("Choose an answer, input a number from 1-4");
        // This condition checks if the player is still alive, if not the game ends
        if (!isAlive(lives = lives + isInt(temp))) {
            System.out.println(
                    "You are dead  X_X, sorry for that, anyways here is a great song: https://youtu.be/H48kOqqaWv0?si=beBxS6gSjdXUDYhM");
            return;
        }
        System.out.println("\n Which direction do you want to go? \n Left (input L) or Right (input R)");

        // If the direction is left, then the condition is true
        if (direction()) {
            // The left room is printed
            print(temp.left, lives);
        } else {
            // The right room is printed
            print(temp.right, lives);
        }
    }

    // Method to check if the lives are more than 0
    public static boolean isAlive(int lives) {
        System.out.println("You have " + lives + " remaining lives");
        return lives > 0;
    }

    // Method that checks to which direction the user wants to go
    public static boolean direction() {
        Scanner in = new Scanner(System.in);
        // A while loop that repeats itself until the user inputs a valid letter
        while (true) {
            String choose = in.nextLine();
            choose = choose.toLowerCase();
            if (choose.equals("l") || choose.equals("r")) {
                return choose.equals("l");
            }
            System.out.println(
                    "Please try a valid letter, YOUR LIFE IS IN DENGER YOU FOOL!!!! DO YOU WANT TO GET KILLED??");
        }

    }

    // Method that checks if the answer input is a valid number, if the answer is
    // correct and changes the number of lives
    public static int isInt(Room temp) {
        Scanner in = new Scanner(System.in);
        String answerString = "";
        // A while loop that repeats itself until the user inputs a valid number
        while (true) {
            answerString = in.nextLine();
            if (answerString.equals("1") || answerString.equals("2") || answerString.equals("3")
                    || answerString.equals("4")) {
                int answerInt = Integer.parseInt(answerString);
                // Check if it is the correct answer
                boolean isTrue = temp.oneQuestion.isCorrect(answerInt, temp.oneQuestion);
                // If it is correct, no lives are taken
                if (isTrue) {
                    System.out.println("You answered correctly, Room Traveler");
                    return 0;
                }
                System.out.println("Your answer is wrong, you may lose one of your lives now");
                return -1;

            }
            System.err.println("Please try a valid number, YOUR LIFE IS IN DENGER YOU FOOL!!!!");
        }

    }
}

