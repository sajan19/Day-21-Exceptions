package com.MoodAnalyser;

public class MoodAnalyser {
    String message;
    //Method to Analyse User Mood takes Message
    public String analyseMood(String message) throws MoodAnalyserException {
        try{
            if(message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Please Enter a Proper Message");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        //Handling Null and Empty Input Exception
        catch(NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please Enter a Proper Message");       }
    }
    //Method to Analyse User Mood which doesn't takes Input
    public String analyseMood() throws MoodAnalyserException {
        try{
            if(message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Please Enter a Proper Message");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        //Handling Null Point Exception
        catch(NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please Enter a Proper Message");       }
    }
}
