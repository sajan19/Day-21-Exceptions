package com.MoodAnalyser;

public class ModeAnalyser {
    //Instance variable to take message
     String message;
    //Constructor
    public ModeAnalyser(String message) {
        this.message = message;
    }
    //Method to Analyse User Mood
    public String analyseMood() {
        //Conditions to Check the message
        if (this.message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
