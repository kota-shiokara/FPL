import jp.ikanoshiokara.FPL.view.Color;

color c;
void setup() {
    c = Color.generateColor(this);
    float r = red(c);
    float g = green(c);
    float b = blue(c);
    println("R: " + r + " G: " + g + " B: " + b);
}

void draw() {
    if(frameCount % 90 == 0) {
        c = Color.generateColor(this);
        float r = red(c);
        float g = green(c);
        float b = blue(c);
        println("R: " + r + " G: " + g + " B: " + b);
    }
    background(c);
}

void keyPressed() {
    if(key == 'q' || key == 'e') {
        exit();
    }
}