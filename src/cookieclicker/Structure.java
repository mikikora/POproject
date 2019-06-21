package cookieclicker;

public interface Structure {
    void buy(int howMany);
    long produce(long time);
//    long sell();
    long cost(int howMany);
    int howMany();
}
