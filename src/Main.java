
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int content = 0;
    static int product_size = 38;
    static Queue<Integer> products = new LinkedList<>();
    static boolean avalible ;

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        producer.start();
        consumer.start();

    }
     
}