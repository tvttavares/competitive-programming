package Algorithms.Implementation;

public class StrangeCounter {

    public static long strangeCounter(long t) {
        long last = 3;
        long cycle = 3;
        while (t > last) {
            cycle *= 2;
            last += cycle;
        }

        // Calculate the counter value at time t
        return last - t + 1;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(4));  // Output: 6
        System.out.println(strangeCounter(10)); // Output: 12
        System.out.println(strangeCounter(21)); // Output: 1
    }
}
