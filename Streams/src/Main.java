import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream stream = pseudoRandomStream(333);
        stream.limit(15).forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream resultStream = IntStream.iterate(seed, n -> n*n/10%1000);
        return resultStream;
    }

}
