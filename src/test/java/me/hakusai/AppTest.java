package me.hakusai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@DisplayName("表示名")
public class AppTest {
    @Test
    public void dummy() {
        assertTrue(true);
    }

    @Nested
    public class NestedTestCases {
        @Test
        public void 日本語テスト名() {
            assertEquals(3, 1 + 2);
        }
    }
}