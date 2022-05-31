package ru.netology.sqr;

public class SQRService {
    public int numberOfSquaresBetween(int min, int max) {
        int x = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    x++;
                } else {
                    return x;
                }
            }
        }
        return x;
    }
}
