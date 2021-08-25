package ru.netology.pva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(1, radio.getVolume());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(2, radio.getMinVolume());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(10, radio.getStatNumber());
        assertEquals(1, radio.getVolUp());
        assertEquals(1, radio.getVolDown());
        assertEquals(true, radio.isOn());
        assertEquals("Petrov", radio.getName());
    }

    @Test
    public void RadioStationUp() {
        Radio radio = new Radio(10);
        assertEquals(0, radio.getNumberStation());

    }
}

