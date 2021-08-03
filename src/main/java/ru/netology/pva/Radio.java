package ru.netology.pva;

public class Radio {

    private int numberStation;    //Номер текущей (прослушиваемой) радиостанции
    private int volume;           //Громкость звука
    private int maxVolume;          //Max звук
    private int minVolume;           // Min звук
    private int statNumber;
    private int volUp;              //звук
    private int volDown;

    //Если текущая радиостанция - 9, нажал на кнопку next на пульте, то текущей должна стать 0-ая.
    public void setMaxVolume(int maxVolume) {
        if (maxVolume > 9) {
            maxVolume = 0;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    //Если текущая радиостанция - 1, нажал на кнопку prev на пульте, то текущей должна стать 9-ая.
    public void setMinVolume(int maxVolume) {
        if (minVolume < 1) {
            minVolume = 9;
        }
    }

    public int getMinVolume() {
        return minVolume;
    }

    //Выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9) (сделайте сеттер)
    public int getStatNumber() {
        this.statNumber = statNumber;
        return statNumber;
    }

    public void setStatNumber(int statNumber) {
        this.statNumber = statNumber;
    }

    //Регулировка громкости по максимуму (с 10 на 1)
    public void setVolUp(int volUp) {
        if (volUp < 10) {
            volUp = volUp + 1;
        }
        if (volUp > 10) {
            volUp = 1;
        }
        this.volUp = volUp;
    }

    public int getVolUp() {
        return volUp;
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

    public int getVolDown() {
        return volDown;
    }
}




