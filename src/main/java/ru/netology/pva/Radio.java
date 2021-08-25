package ru.netology.pva;

public class Radio {

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getStatNumber() {
        return statNumber;
    }

    public void setStatNumber(int statNumber) {
        this.statNumber = statNumber;
    }

    public int getVolUp() {
        return volUp;
    }

    public void setVolUp(int volUp) {
        this.volUp = volUp;
    }

    public int getVolDown() {
        return volDown;
    }

    public void setVolDown(int volDown) {
        this.volDown = volDown;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int numberStation = 2;
    private int volume = 1;
    private int maxVolume = 10;
    private int minVolume = 2;
    private int maxStation = 10;
    private int minStation = 0;
    private int statNumber = 10;
    private int volUp = 1;
    private int volDown = 1;
    private boolean on = true;
    private String name = "Petrov";

    public Radio() {
    }

    public Radio(int numberStation) {
        numberStation +=1;
        if (maxStation< numberStation) {
            numberStation = minStation;
        }
        this.numberStation = numberStation;

    }
}

