package ru.netology.oop;

public class Radio {
    private int currentVolume = 0; // from 0 to 100
    private int currentStation = 0; // from 0 to 9
    private int stationQty = 10; // Station quantity by default

    public Radio(int stationQty) {
        this.stationQty = stationQty;
    }

    public void setStation(int station) {
        if ((station >= 0) & (station <= 9)) {
            currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

}
