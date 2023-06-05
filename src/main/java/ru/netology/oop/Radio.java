package ru.netology.oop;

import lombok.*;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class Radio {
    @Getter private int currentVolume = 0; // from 0 to 100
    @Getter private int currentStation = 0; // from 0 to stationQty-1
    @Getter private final int stationQty; // Station quantity by default (will be =0 with lombok)

    public void setStation(int station) {
        if ((station >= 0) & (station <= 9)) {
            currentStation = station;
        }
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
