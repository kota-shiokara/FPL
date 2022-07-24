package jp.ikanoshiokara.FPL.view;

import processing.core.*;
import java.util.Random;

/**
 * Colorに関するクラス<br>
 *
 * @author kota-shiokara
 * @version 1.1
 */
public class ColorExt {
    /**
     * 引数に入れたPAppletのcolorModeに合ったcolorを生成する<br>
     *
     * Sample:<br>
     *  color c = ColorExt.generateColor(this);<br>
     *  println("R: " + red(c) + " G: " + green(c) + " B: " + blue(c));
     *
     * @param applet PApplet
     * @return int
     */
    public static int generateColor(PApplet applet) {
        PGraphics pg = applet.g;
        return generateColor(pg);
    }

    /**
     * 引数に入れたPGraphicsのcolorModeに合ったcolorを生成する
     *
     * Sample:
     *  PGraphics pg = new PGraphics();
     *  color c = ColorExt.generateColor(pg);
     *  println("R: " + red(c) + " G: " + green(c) + " B: " + blue(c));
     *
     * @param pg PGraphics
     * @return int
     */
    public static int generateColor(PGraphics pg) {
        int colorMode = pg.colorMode;

        Random rand = new Random();
        if(colorMode == PApplet.HSB) {
            // HSB(360, 100, 100)
            float h = getColorValue(rand, pg.colorModeX);
            float s = getColorValue(rand, pg.colorModeY);
            float b = getColorValue(rand, pg.colorModeZ);
            float a = getColorValue(rand, pg.colorModeA);

            return pg.color(h, s, b, a);
        } else {
            // RGB or other
            int r = (int) getColorValue(rand, pg.colorModeX);
            int g = (int) getColorValue(rand, pg.colorModeY);
            int b = (int) getColorValue(rand, pg.colorModeZ);
            int a = (int) getColorValue(rand, pg.colorModeA);

            return pg.color(r, g, b, a);
        }
    }

    private static float getColorValue(Random rand, float colorValue) {
        return PApplet.map(rand.nextFloat(), 0f, 1f, 0f, colorValue);
    }
}
