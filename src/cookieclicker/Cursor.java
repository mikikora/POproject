package cookieclicker;

public class Cursor implements Structure{
    final long basicCost = 15;
    int n;
    long PreviousTime;

    public Cursor(long t0, int n) {
        this.n = n;
        PreviousTime = t0;
    }

    public void buy(int howMany) {n += howMany;}

    public long produce(long time) {
        long seconds = time - PreviousTime;
        seconds /= 1000;
        seconds /= 5;
        if (seconds > 0) {
            PreviousTime = time;
        }
        return n * seconds;
    }

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

}
