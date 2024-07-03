
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0, x = 0, y = 0;

        System.out.printf("(%d, %d)%n", x, y);

        while (Math.abs(x) + Math.abs(y) < r) {
            double random = Math.random();
            if (random <= 0.25) x++;
            else if (random <= 0.5) x--;
            else if (random <= 0.75) y++;
            else y--;
            System.out.printf("(%d, %d)%n", x, y);
            steps++;
        }
        System.out.println(steps);
    }
}
