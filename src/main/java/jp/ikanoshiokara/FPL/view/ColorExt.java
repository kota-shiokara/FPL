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
            float h = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeX);
            float s = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeY);
            float b = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeZ);
            float a = PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeA);

            return new PApplet().color(h, s, b, a);
        } else {
            // RGB or other
            int r = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeX);
            int g = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeY);
            int b = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeZ);
            int a = (int) PApplet.map(rand.nextFloat(), 0f, 1f, 0f, pg.colorModeA);

            return new PApplet().color(r, g, b, a);
        }
    }
}
