package ru.netology.pva;

public class Radio {

    private int numberStation;    //Номер текущей (прослушиваемой) радиостанции
    private int volume;           //Громкость звука
    private int next = 9;          //Max звук
    private int prev = 0;           // Min звук
    private int statNumber;
    private int volUp;              //звук
    private int volDown;

    //Если текущая радиостанция - 9, нажал на кнопку next на пульте, то текущей должна стать 0-ая.
    public int setNext() {
        int setNext = 0;
        return setNext;
    }

    //Если текущая радиостанция - 0, нажал на кнопку prev на пульте, то текущей должна стать 9-ая.
    public int setPrev() {
        int setPrev = 0;
        return setPrev;
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
            volDown = volDown-1;
        }
        if (volDown <1) {
            volDown = 10;
        }
        this.volDown = volDown;
    }
    public int getVolDown() {
        return volDown;
    }
}




