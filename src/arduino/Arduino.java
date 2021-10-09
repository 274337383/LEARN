package arduino;

public abstract class Arduino {

    public static final int HIGH = 1;
    public static final int LOW = 0;
    public static final int INPUT = 0;
    public static final int OUTPUT = 1;
    public static final int INPUT_PULLUP = 2;

    public static final int SS = 10;
    public static final int MOSI = 11;
    public static final int MISO = 12;
    public static final int SCK = 13;

    public static final int SDA = 18;
    public static final int SCL = 19;
    public static final int LED_BUILTIN = 13;

    public static final int A0 = 14;
    public static final int A1 = 15;
    public static final int A2 = 16;
    public static final int A3 = 17;
    public static final int A4 = 18;
    public static final int A5 = 19;
    public static final int A6 = 20;
    public static final int A7 = 21;

    public static native void init();

    public static native void pinMode(int pin, int mode);
    public static native void digitalWrite(int pin, boolean val);
    public static native boolean digitalRead(int pin);
    public static native void analogReference(int mode);
    public static native int analogRead(int pin);
    public static native void analogWrite(int pin, int val);

    public static native long millis();
    public static native long micros();
    public static native void delay(long ms);
    public static native void delayMicroseconds(int ms);
    public static native long pulseIn(int pin, int state, long timeout);

    public static native void shiftOut(int dataPin, int clockPin, int bitOrder, byte val);
    public static native byte shiftIn(int dataPin, int clockPin, int bitOrder);

    public Arduino() {
        init();
    }

    public void loop() {}

    public void start() {
        for(;;) loop();
    }

}