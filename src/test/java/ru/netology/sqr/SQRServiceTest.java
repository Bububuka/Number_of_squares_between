package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCount() {
        SQRService service = new SQRService();
        int actual = service.numberOfSquaresBetween(400, 900);
        Assertions.assertEquals(11, actual);
    }


    @Test
    public void shouldCountZero() {
        SQRService service = new SQRService();
        int actual = service.numberOfSquaresBetween(900, 400);
        Assertions.assertEquals(0, actual);
    }
}