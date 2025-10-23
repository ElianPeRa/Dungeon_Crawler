
//Author:Elian Pena Ramos
//11/26/24
//Dungeon rooms

import java.io.File;
import java.util.Scanner;

public class QuestionLoader {

    // Method that storages all the questions from the csv file to an Question array
    public static Question[] scan(String File) {
        int count = 0;// The index
        // An array to hold the objects and an array to hold the values of the file
        Question[] que = new Question[13];
        String[][] temp = new String[1][6];
        try {
            Scanner in2 = new Scanner(new File(File));
            while (in2.hasNextLine()) {
                // Splits the lines by the comas and storages them in the array
                temp[0] = in2.nextLine().split(",");
                // Parses the String values to Integers
                int tempi = Integer.parseInt(temp[0][5]);
                // Creates the question objects
                que[count] = new Question(temp[0][0], temp[0][1], temp[0][2], temp[0][3], temp[0][4], tempi);
                count++;
            }
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
        // Returns the finished array
        return que;
    }
}

