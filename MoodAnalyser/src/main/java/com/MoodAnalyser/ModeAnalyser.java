package com.MoodAnalyser;

public class ModeAnalyser {
    String message;
    //Method to Analyse User Mood
    public String analyseMood(String message) {
        try{
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        //Handling Null Point Exception
        catch(NullPointerException e) {
            return "HAPPY";
        }
    }
}
