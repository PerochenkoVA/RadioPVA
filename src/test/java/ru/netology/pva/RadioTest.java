package ru.netology.pva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNumberStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(0, radio.getStatNumber());
        assertEquals("Petrov", radio.getName());
        assertEquals(5,radio.getVolume());
    }

    @Test
    public void RadioStationUp() {
        Radio radio = new Radio(10, 1);

        assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void RadioStationDown() {
        Radio radio = new Radio(0, -1);

        assertEquals(10, radio.getNumberStation());
    }

     @Test
    public void VolUp (){
        Radio radio = new Radio(3);

        assertEquals(4,4);
    }



}