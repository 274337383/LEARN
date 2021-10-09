package console;

import arduino.Arduino;

public class Main extends Arduino {

    public Main() {
        pinMode(13, OUTPUT);
    }

    private boolean v = false;

    public void loop() {
        digitalWrite(13, v = !v);
        delay(1000);
    }

    public static void main(String[] args) {
        new Main().start();
    }

}