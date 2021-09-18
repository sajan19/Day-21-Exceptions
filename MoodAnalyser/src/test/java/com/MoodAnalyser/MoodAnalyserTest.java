package com.MoodAnalyser;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    //Test to check Sad Mood
    @Test
    void givenMessage_whenSad_ShouldReturnSad() {
        ModeAnalyser modeAnalyser =new ModeAnalyser("I am in SAD Mood");
        String mood = modeAnalyser.analyseMood();
        Assertions.assertEquals("SAD",mood);
    }
    //Test to check Happy Mood
    @Test
    void givenMessage_whenNotSad_ShouldReturnHappy() {
        ModeAnalyser modeAnalyser =new ModeAnalyser("I am in HAPPY Mood");
        String mood = modeAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",mood);
    }
}
