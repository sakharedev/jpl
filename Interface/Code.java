interface Bicycle {
    int x = 100;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle {
    int y = 20;
    void blowHornLong();
    void blowHornShort();
}

class AvonCycle implements Bicycle, HornBicycle {
    public void applyBreak(int decrement) {
        System.out.println("Applying Break for: " + decrement);
    }

    public void speedUp(int increment) {
        System.out.println("Applying Speed Up: " + increment);
    }

    public void blowHornLong() {
        System.out.println("Long Horn");
    }

    public void blowHornShort() {
        System.out.println("Short Horn");
    }
}

public class Code {
    public static void main(String args[]) {
        AvonCycle a = new AvonCycle();
        a.applyBreak(10);
        a.speedUp(20);
        a.blowHornLong();
        a.blowHornShort();
    }
}
