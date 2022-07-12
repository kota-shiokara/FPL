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
        @DisplayName("Normal RGB in range test with PApplet")
        void generateColor_普通のRGB_範囲内_PApplet() {
            // mock
            PApplet testApplet = new PApplet();
            testApplet.g = new PGraphics();
            testApplet.g.colorMode = PConstants.RGB;
            testApplet.g.colorModeX = 255;
            testApplet.g.colorModeY = 255;
            testApplet.g.colorModeZ = 255;

            // run
            int result = ColorExt.generateColor(testApplet);
            float red = testApplet.red(result);
            float green = testApplet.green(result);
            float blue = testApplet.blue(result);

            boolean isRed = 0 <= red && red <= testApplet.g.colorModeX;
            boolean isGreen = 0 <= green && green <= testApplet.g.colorModeY;
            boolean isBlue = 0 <= blue && blue <= testApplet.g.colorModeZ;
            boolean actual = isRed && isGreen && isBlue;

            // assert
            assertTrue(actual);
        }

        @Test
        @DisplayName("Normal RGB in range test with PGraphics")
        void generateColor_普通のRGB_範囲内_PGraphics() {
            // mock
            PGraphics pg = new PGraphics();
            pg.colorMode = PConstants.RGB;
            pg.colorModeX = 255;
            pg.colorModeY = 255;
            pg.colorModeZ = 255;

            PApplet testApplet = new PApplet();
            testApplet.g = pg;

            // run
            int result = ColorExt.generateColor(pg);
            float red = testApplet.red(result);
            float green = testApplet.green(result);
            float blue = testApplet.blue(result);

            boolean isRed = 0 <= red && red <= pg.colorModeX;
            boolean isGreen = 0 <= green && green <= pg.colorModeY;
            boolean isBlue = 0 <= blue && blue <= pg.colorModeZ;
            boolean actual = isRed && isGreen && isBlue;

            // assert
            assertTrue(actual);
        }
    }
}
