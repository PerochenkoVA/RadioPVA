package ru.netology.pva;

import javax.naming.Name;

public class Radio {


    private int numberStation;    //Номер текущей (прослушиваемой) радиостанции
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
    private int volume1;
    private int volume2;

    public Radio() {
    }

    public Radio(int maxVolume, int minVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio(int numberStation, int volume, int maxVolume, int minVolume, int maxStation, int minStation, int statNumber, int volUp, int volDown, boolean on, String name) {
        this.numberStation = numberStation;
        this.volume = volume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.statNumber = statNumber;
        this.volUp = volUp;
        this.volDown = volDown;
        this.on = on;
        this.name = name;
    }

    public Radio (String name, int volUp, int maxVolume, int minVolume, int volume1) {
        this.volUp = volUp;
        this.volDown = volDown;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        volume1 = volume1 + volUp;
        if (volume1 > maxVolume) {
            volume1 = minVolume;
        }
    }

    public Radio(int volDown, int minVolume, int maxVolume, int volume) {

        this.volUp = volUp;
        this.volDown = volDown;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        volume2 = volume2 - volDown;
        if (volume2 < minVolume) {
            volume2 = maxVolume;
        }
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
    public void setId(String name) {
        this.name = name;
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
    public void setName(String name) {this.name = name;}
    public int getVolume1() {return volume1;}
    public void setVolume1(int volume1) {this.volume1 = volume1;}
    public int getVolume2() {return volume2;}
    public void setVolume2(int volume2) {this.volume2 = volume2;}
}


   /* //Регулировка громкости по максимуму (с 10 на 1)
    public void setVolUp(int volUp) {
        if (volUp < 10) {
            volUp = volUp + 1;
        }
        if (volUp > 10) {
            volUp = 1;
        }
        this.volUp = volUp;
    }
    //Регулировка громкости по минимуму (с 1 на 10)
    public void setVolDown(int volDown) {
        if (volDown < 10) {
            volDown = volDown - 1;
        }
        if (volDown < 1) {
            volDown = 10;
        }
        this.volDown = volDown;
    }
*/


