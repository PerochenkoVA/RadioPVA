package ru.netology.pva;

import javax.naming.Name;

public class Radio {


    private int numberStation;
    private int volume;
    private int maxVolume = 10;
    private int minVolume = 2;
    private int maxStation = 10;
    private int minStation = 0;
    private int statNumber;
    private int volUp;
    private int volDown;
    private boolean on;
    private String name = "Petrov";

    public Radio() {
    }

    public Radio(int numberStation, int statNumber) {

        numberStation = numberStation + statNumber;
        if (numberStation > maxStation) {
            numberStation = minStation;
        }
        if (numberStation < minStation) {
            numberStation = maxStation;
        }
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }


    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getStatNumber() {
        return statNumber;
    }

    public int getVolUp() {
        return volUp;
    }

    public int getVolDown() {
        return volDown;
    }

    public boolean isOn() {
        return on;
    }

    public String getName() {
        return name;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

}