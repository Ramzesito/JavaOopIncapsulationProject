package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // tests for radio initialization
    @Test
    public void createRadioObjectWithoutParameters() {
        Radio testRadio = new Radio();
        Assertions.assertEquals(10, testRadio.getStationQty());
    }
    @Test
    public void createRadioObjectWithParameters() {
        Radio testRadio = new Radio(15);
        Assertions.assertEquals(15, testRadio.getStationQty());
    }


}
