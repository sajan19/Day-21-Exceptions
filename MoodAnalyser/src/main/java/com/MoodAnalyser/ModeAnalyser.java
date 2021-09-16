package com.MoodAnalyser;

public class ModeAnalyser {
    public String analyseMood(String message) {
        if (message.contains("SAD"))
        return "SAD";
        else
            return "HAPPY";
    }
}
