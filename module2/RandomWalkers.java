public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;

        for (int i = 1; i <= trials; i++) {
            int x = 0, y = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double random = Math.random();
                if (random <= 0.25) x++;
                else if (random <= 0.5) x--;
                else if (random <= 0.75) y++;
                else y--;
                steps++;
            }
        }
        System.out.println("Average number of steps = " + (double)steps/trials);
    }
}
