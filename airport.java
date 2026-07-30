public class FlightDelay {
    public static void main(String[] args) {
        Object[][] flight = {
            {1, "Delhi", 9, 4},
            {2, "Mumbai", 10, 30},
            {3, "Bangalore", 21, 0},
            {4, "Pune", 22, 70}
        };

        int max = 0;
        int num = 1;
        int sum = 0;

        for (Object[] i : flight) {
            int delay = (int) i[3];
            if (delay > 0) {
                System.out.println("Flight number " + i[0] + " is delayed by " + delay + " minutes");
                sum += delay;
                if (delay > max) {
                    max = delay;
                    num = (int) i[0];
                }
            }
        }

        System.out.println("Maximum delay is " + max + " minutes of flight number " + num);
        System.out.println("Average delay " + ((double) sum / flight.length) + " minutes");

        for (Object[] i : flight) {
            int delay = (int) i[3];
            if (delay > 60) {
                System.out.println("Flight number " + i[0] + " is delayed by more than 60 minutes");
            }
        }

        System.out.println("Sorted according to departure time: ");
        for (Object[] i : flight) {
            System.out.print(i[0] + "\t");
        }
    }
}
