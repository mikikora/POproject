package cookieclicker;

public class Factory implements Structure {
    final long basicCost = 500;
    int n;
    long previousTime;

    public Factory(long t0, int n) {
        previousTime = t0;
        this.n = n;
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
        return 4 * n * seconds;
    }
}
