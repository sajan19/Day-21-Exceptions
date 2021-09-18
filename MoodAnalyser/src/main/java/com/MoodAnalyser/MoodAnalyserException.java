package com.MoodAnalyser;

public class MoodAnalyserException extends Exception {
    enum ExceptionType{
        ENTERED_NULL, ENTERED_EMPTY
    }
    ExceptionType type;
    //Constructor
    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type =type;
    }
}
