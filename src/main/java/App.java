/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String userInput = myApp.readUserInput();
        int Age = Integer.parseInt(userInput);
        String displayMessage = myApp.passwordCheck(Age);
        String outputString = myApp.generateOutputString(displayMessage);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readUserInput(){
        System.out.print("What is your age? ");
        return in.nextLine();
    }

    public String passwordCheck(int Age){
        return (Age < 16) ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
    }

    public String generateOutputString(String displayMessage){
        return displayMessage;
    }
}
