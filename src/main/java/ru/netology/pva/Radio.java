package ru.netology.pva;

public class Radio {


    private int numberStation;
    private int volume = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int statNumber;
    private String name = "Petrov";
    private int volUp=1;
    private int volDown;

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
    public Radio (int volume) {
        volume=volUp+volume;
      return;
    }


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
    return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}