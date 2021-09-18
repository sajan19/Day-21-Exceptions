package com.MoodAnalyser;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    //Test to check Sad Mood
    @Test
    void givenMessage_whenSad_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser =new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is SAD Message");
        Assertions.assertEquals("SAD",mood);
    }
    //Test to check Happy Mood
    @Test
    void givenMessage_whenNotSad_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser =new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is HAPPY Message");
        Assertions.assertEquals("HAPPY",mood);
    }
    //Test case to check Null
    @Test
    public void givenNullMoodShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try{
            moodAnalyser.analyseMood(null);
        }
        catch(MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    //Test case to check Empty Input
    @Test
    public void givenEmptyMoodShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try{
            moodAnalyser.analyseMood();
        }
        catch(MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
}
