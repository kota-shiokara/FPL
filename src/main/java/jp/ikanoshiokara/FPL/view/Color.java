package jp.ikanoshiokara.FPL.view;

import processing.core.*;
import java.util.Random;


/**
 * Colorに関するクラス<br>
 *
 * @author kota-shiokara
 * @version 1.0
 */
public class Color {
    /**
     * 引数に入れたPAppletのcolorModeに合ったcolorを生成する
     *
     * @param applet PApplet
     * @return int
     */
    public static int generateColor(PApplet applet) {
        int colorMode = applet.g.colorMode;

        Random rand = new Random();
        if(colorMode == PApplet.HSB) {
            // HSB(360, 100, 100)
            float h = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeX);
            float s = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeY);
            float b = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeZ);
            float a = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeA);

            return applet.color(h, s, b, a);
        } else {
            // RGB or other
            int r = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeX);
            int g = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeY);
            int b = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeZ);
            int a = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, applet.g.colorModeA);

            return applet.color(r, g, b, a);
        }
    }
}
