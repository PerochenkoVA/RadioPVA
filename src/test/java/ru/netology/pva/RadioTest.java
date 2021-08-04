package ru.netology.pva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals("Petrov", radio.getName());
    }

    @Test
    public void shouldUsedConstructorAllParametrRadio() {
        Radio radio = new Radio(3, 2, 50, 1, 9, 1, 4, 1, 1, true, "PetrovBM");

        assertEquals(3, radio.getNumberStation());
        assertEquals(2, radio.getVolume());
        assertEquals(50, radio.getMaxVolume());
        assertEquals(9, radio.getMaxStation());
        assertEquals(1, radio.getMinStation());
        assertEquals(4, radio.getStatNumber());
        assertEquals(1, radio.getVolUp());
        assertEquals(1, radio.getVolDown());
        assertEquals(true, radio.isOn());
        assertEquals("PetrovBM", radio.getName());
    }

    @Test
    public void shouldUsedConstructorRadioVolume100() {
        Radio radio = new Radio(100, 0);

        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void useRadioUpVolume() {
        Radio radio = new Radio("Netology", 2, 100, 1, 99);
        assertEquals(1, radio.getVolume1());
    }

    @Test
    public void useRadioDownVolume() {
        Radio radio = new Radio(2, 1, 100, 1);
        assertEquals(100, radio.getVolume2());

    }

}

    /*@Test
    public void setMoreMaximum() {
        Radio voise = new Radio();
        voise.setMaxVolume(11);

        assertEquals(0, voise.getMaxVolume());
    }

    @Test
    public void setMoreMinimum() {
        Radio voise = new Radio();
        voise.setMinVolume(0);
        assertEquals(9, voise.getMinVolume());
    }

    @Test
    public void instalStation() {
        Radio voise = new Radio();
        voise.setStatNumber(5);
        assertEquals(5, voise.getStatNumber());
    }

    @Test
    public void regulateVolumeMax() {
        Radio volume = new Radio();
        volume.setVolUp(11);
        assertEquals(1, volume.getVolUp());
    }

    @Test
    public void regulateVolumeMin() {
        Radio volume = new Radio();
        volume.setVolDown(0);
        assertEquals(10, volume.getVolDown());
    }
*/