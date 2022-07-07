package jp.ikanoshiokara.FPL.view;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import processing.core.*;

public class ColorTest {
    @Nested
    @DisplayName("generateColor()")
    class GenerateColor {
        @Test
        @DisplayName("Normal RGB in range test")
        void generateColor_普通のRGB_範囲内() {
            // mock
            PApplet testApplet = new PApplet();
            testApplet.g = new PGraphics();
            testApplet.g.colorMode = PConstants.RGB;

            // run
            int result = ColorExt.generateColor(testApplet);
            boolean red = 0 <= testApplet.red(result) && testApplet.red(result) <= testApplet.g.colorModeX;
            boolean green = 0 <= testApplet.green(result) && testApplet.green(result) <= testApplet.g.colorModeY;
            boolean blue = 0 <= testApplet.blue(result) && testApplet.blue(result) <= testApplet.g.colorModeZ;
            boolean actual = red && blue && green;

            // assert
            assertTrue(actual);
        }

        @Test
        @DisplayName("Normal RGB out of range test")
        void generateColor_普通のRGB_範囲外() {
            // mock
            PApplet testApplet = new PApplet();
            testApplet.g = new PGraphics();
            testApplet.g.colorMode = PConstants.RGB;

            // run
            int result = ColorExt.generateColor(testApplet);
            boolean red = 0 > testApplet.red(result) && testApplet.red(result) > testApplet.g.colorModeX;
            boolean green = 0 > testApplet.green(result) && testApplet.green(result) > testApplet.g.colorModeY;
            boolean blue = 0 > testApplet.blue(result) && testApplet.blue(result) > testApplet.g.colorModeZ;
            boolean actual = red && blue && green;

            // assert
            assertTrue(!actual);
        }
    }
}
