public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] count = new int[n + 1];
        int times = 0;

        for (int i = 0; i < trials; i++) {
            boolean[] birthday = new boolean[n];
            int people = 0;

            while (true) {
                int random = (int) (Math.random() * n);

                if (!birthday[random]) {
                    birthday[random] = true;
                    people++;
                } else {
                    break;
                }
            }
            count[people]++;
            times++;
        }

        int cumulativeCount = 0;
        for (int i = 0; i <= n; i++) {
            cumulativeCount += count[i];
            double cumulativeFraction = (double) cumulativeCount / times;
            System.out.println((i+1) + "\t" + cumulativeCount + "\t" + cumulativeFraction);
            if (cumulativeFraction >= 0.506948) break;
        }
    }
}
