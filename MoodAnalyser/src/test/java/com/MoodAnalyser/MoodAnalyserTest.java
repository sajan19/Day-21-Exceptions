package com.MoodAnalyser;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    @Test
    void givenMessage_whenSad_ShouldReturnSad() {
        ModeAnalyser modeAnalyser =new ModeAnalyser();
        String mood = modeAnalyser.analyseMood("This is SAD Message");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    void givenMessage_whenNotSad_ShouldReturnHappy() {
        ModeAnalyser modeAnalyser =new ModeAnalyser();
        String mood = modeAnalyser.analyseMood("This is HAPPY Message");
        Assertions.assertEquals("HAPPY",mood);
    }
}
