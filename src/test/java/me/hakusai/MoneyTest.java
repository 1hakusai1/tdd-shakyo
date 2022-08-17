package me.hakusai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void _5ドルを2倍すると10ドルになる() {
        Doller five = new Doller(5);
        Doller product = five.times(2);
        assertEquals(10, product.amount);
    }

}
