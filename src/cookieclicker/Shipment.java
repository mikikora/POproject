package cookieclicker;

public class Shipment implements Structure {
    final long basicCost = 7000;
    int n;
    long previousTime;

    public Shipment(long t0, int n) {
        this.n = n;
        previousTime = t0;
    }

    public void buy(int howMany) {n += howMany;}

    public long cost(int howMany) {
        long res = 0;
        for (int i = n; i < n + howMany; i++) {
            res += Math.round(basicCost * Math.pow(1.125, i));
        }
        return res;
    }

    public int howMany() {
        return n;
    }

    public long produce(long time) {
        long seconds = time - previousTime;
        seconds /= 1000;
        if (seconds > 0) {
            previousTime = time;
        }
        return 20 * n * seconds;
    }
}
