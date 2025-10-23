//Author:Elian Pena Ramos
//CS 2
//TA:Manuel Gutierrez
//11/26/24
//lab 9
//Instructor:Monika Akbar
//Dungeon rooms
// CS2401

public class Question {
    // Attributes of a question
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answers;

    // Constructor
    public Question(String Questions, String option01, String option02, String option03, String option04, int answer) {
        question = Questions;
        option1 = option01;
        option2 = option02;
        option3 = option03;
        option4 = option04;
        answers = answer;
    }

    // Setters
    public void setAnswers(int answers) {
        this.answers = answers;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    // Getters
    public int getAnswers() {
        return answers;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getQuestion() {
        return question;
    }

    // Method that checks if the entered answer is correct
    public boolean isCorrect(int guess, Question que) {
        return guess == que.answers;
    }

    // Display the question
    public void displayQuestion() {
        System.out.println(question);
        System.out.println("1: " + option1);
        System.out.println("2: " + option2);
        System.out.println("3: " + option3);
        System.out.println("4: " + option4);
    }

}
