package hanif.hakim.generic;

public class Pair<T, N> {
    private T firstData;
    private N secondData;

    public Pair(T firstData, N secondData) {
        this.firstData = firstData;
        this.secondData = secondData;
    }

    public T getFirstData() {
        return firstData;
    }

    public void setFirstData(T firstData) {
        this.firstData = firstData;
    }

    public N getSecondData() {
        return secondData;
    }

    public void setSecondData(N secondData) {
        this.secondData = secondData;
    }
}
