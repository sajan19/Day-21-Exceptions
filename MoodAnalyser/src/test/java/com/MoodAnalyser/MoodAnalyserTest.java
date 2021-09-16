package com.MoodAnalyser;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    //Test to check Sad Mood
    @Test
    void givenMessage_whenSad_ShouldReturnSad() {
        ModeAnalyser modeAnalyser =new ModeAnalyser();
        String mood = modeAnalyser.analyseMood("This is SAD Message");
        Assertions.assertEquals("SAD",mood);
    }
    //Test to check Happy Mood
    @Test
    void givenMessage_whenNotSad_ShouldReturnHappy() {
        ModeAnalyser modeAnalyser =new ModeAnalyser();
        String mood = modeAnalyser.analyseMood("This is HAPPY Message");
        Assertions.assertEquals("HAPPY",mood);
    }
    //Test to check Null Mood (Null Point Exception)
    @Test
    void givenNullMood_ShouldReturnHappy() {
        ModeAnalyser modeAnalyser =new ModeAnalyser();
        String mood = modeAnalyser.analyseMood(null);
        Assertions.assertEquals("HAPPY",mood);
    }
}
