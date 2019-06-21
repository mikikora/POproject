package cookieclicker;

public class TimeMachine implements Structure {
    final long basicCost = 123456789;
    int n;
    long prevoiusTime;

    public TimeMachine(long t0, int n) {
        this.n = n;
        prevoiusTime = t0;
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
        long seconds = time = prevoiusTime;
        seconds /= 1000;
        if (seconds > 0) {
            prevoiusTime = time;
        }
        return 100000 * n * seconds;
    }
}
