public class ElectricityBill {
    public static void main(String[] args) {
        int[][] bill = {
            {101, 200, 300},
            {102, 500, 0},
            {103, 200, 400},
            {104, 400, 0}
        };

        int sum = 0;
        for (int[] i : bill) {
            sum += i[1] + i[2];
        }
        System.out.println("Net electricity used: " + sum + " units");

        int cost = 0;
        // 10rs for first 100
        // 20rs for next 200
        // 30 rs for remaining
        for (int[] i : bill) {
            cost = 0;
            if (i[1] > 100) {
                cost = 1000;
                if ((i[1] - 100) > 0) {
                    cost = cost + (i[1] - 100) * 20;
                    if ((i[1] - 300) > 0) {
                        cost = cost + (i[1] - 300) * 30;
                    }
                }
            }
            System.out.println("Cost of house number " + i[0] + " is " + cost);
        }

        // houses electricity units > 300 are eligible

        int max = 0;
        int house = 0;
        for (int[] i : bill) {
            if (i[1] > max) {
                max = i[1];
                house = i[0];
            }
            if (i[1] > 300) {
                System.out.println("House number " + i[0] + " is eligible for green incentive");
            }
        }

        System.out.println("Highest consumer is house number " + house);

        for (int[] i : bill) {
            System.out.println("House number " + i[0] + " consumes " + i[1] + " units and generates " + i[2] + " units of solar energy");
        }
    }
}
