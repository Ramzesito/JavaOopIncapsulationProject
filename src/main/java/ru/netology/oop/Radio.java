package ru.netology.oop;

public class Radio {
    private int currentVolume = 0; // from 0 to 100
    private int currentStation = 0; // from 0 to stationQty-1
    private int stationQty = 10; // Station quantity by default

    public Radio() {
    }
    public Radio(int stationQty) {
        this.stationQty = stationQty;
    }

    public void setStation(int station) {
        if ((station >= 0) & (station < stationQty)) {
            currentStation = station;
        }
    }

    public int getStationQty() {
        return stationQty;
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
        if (currentStation < stationQty-1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = stationQty - 1;
        }
    }

}
