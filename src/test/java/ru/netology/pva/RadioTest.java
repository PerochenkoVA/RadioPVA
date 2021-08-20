package ru.netology.pva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNumberStation());
        assertEquals(0, radio.getVolume());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(2, radio.getMinVolume());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(0, radio.getStatNumber());
        assertEquals(0, radio.getVolUp());
        assertEquals(0, radio.getVolDown());
        assertEquals(false, radio.isOn());
        assertEquals("Petrov", radio.getName());
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


}