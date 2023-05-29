package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio testRadio = new Radio();
        testRadio.increaseVolume();
        int expected = 1;
        Assertions.assertEquals(expected, testRadio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolumeLevel() {
        Radio testRadio = new Radio();
        for (int i = 0; i < 3; i++) {
            testRadio.increaseVolume();
        }
        testRadio.decreaseVolume();
        int expected = 2;
        Assertions.assertEquals(expected, testRadio.getCurrentVolume());
    }
    @Test
    public void shouldNotDecreaseVolumeLevelIfMin() {
        Radio testRadio = new Radio();
        testRadio.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, testRadio.getCurrentVolume());
    }
    @Test
    public void shouldNotIncreaseVolumeLevelIfMax() {
        Radio testRadio = new Radio();
        for (int i = 0; i < 101; i++) {
            testRadio.increaseVolume();
        }
        int expected = 100;
        Assertions.assertEquals(expected, testRadio.getCurrentVolume());
    }

    @Test
    public void shouldSetFirstValidStation() {
        Radio testRadio = new Radio();
        testRadio.setStation(0);
        int expected = 0;
        Assertions.assertEquals(expected, testRadio.getCurrentStation());
    }
    @Test
    public void shouldSetLastValidStation() {
        Radio testRadio = new Radio();
        testRadio.setStation(9);
        int expected = 9;
        Assertions.assertEquals(expected, testRadio.getCurrentStation());
    }
    @Test
    public void shouldNotSetInvalidStationAfterMax() {
        Radio testRadio = new Radio();
        testRadio.setStation(10);
        int expected = 0;
        Assertions.assertEquals(expected, testRadio.getCurrentStation());
    }
    @Test
    public void shouldNotSetInvalidStationBeforeMin() {
        Radio testRadio = new Radio();
        testRadio.setStation(-1);
        int expected = 0;
        Assertions.assertEquals(expected, testRadio.getCurrentStation());
    }
}
