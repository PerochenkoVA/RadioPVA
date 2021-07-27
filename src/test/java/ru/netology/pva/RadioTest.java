package ru.netology.pva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setMoreMaximum(){
        Radio voise = new Radio();
        voise.setNext();
        assertEquals(0,voise.setNext());
    }

    @Test
    public void setMoreMinimum(){
        Radio voise = new Radio();
        voise.setPrev();
        assertEquals(0,voise.setPrev());
    }
    @Test
    public void instalStation(){
        Radio voise = new Radio();
        voise.setStatNumber(5);
        assertEquals(5, voise.getStatNumber());
    }
    @Test
    public void regulateVolumeMax(){
        Radio volume = new Radio();
        volume.setVolUp(11);
        assertEquals(1,volume.getVolUp());
    }

    @Test
    public void regulateVolumeMin(){
        Radio volume = new Radio();
        volume.setVolDown(0);
        assertEquals(10,volume.getVolDown());
    }
}