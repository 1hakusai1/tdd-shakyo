package me.hakusai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void _5ドルを2倍すると10ドルになる() {
        Doller five = new Doller(5);
        assertEquals(new Doller(10), five.times(2));
    }

    @Test
    public void _5ドルを3倍すると15ドルになる() {
        Doller five = new Doller(5);
        assertEquals(new Doller(15), five.times(3));
    }

    @Nested
    public class ValueObjectとしての振る舞いのテスト {
        @Test
        public void _5ドルと5ドルは等しい() {
            assertEquals(new Doller(5), new Doller(5));
        }

        @Test
        public void _5ドルと6ドルは等しくない() {
            assertNotEquals(new Doller(5), new Doller(6));
        }

        @Test
        public void _5ドルのhashと5ドルのhashは等しい() {
            assertEquals(new Doller(5).hashCode(), new Doller(5).hashCode());
        }
    }

}
