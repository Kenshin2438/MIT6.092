package assn3;

import java.util.Comparator;
import java.util.stream.IntStream;

class Marathon {

    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        Comparator<Integer> comparator = (Integer a, Integer b) -> new Integer(times[a]).compareTo(times[b]);
        int[] rank = IntStream.range(0, names.length).boxed()
                .sorted(comparator).mapToInt((Integer i) -> i.intValue()).toArray();

        System.err.printf("The fastest runner: %s (time: %d in minutes)\n", names[rank[0]], times[rank[0]]);
        System.err.printf("The second runner: %s (time: %d in minutes)\n", names[rank[1]], times[rank[1]]);
    }
}