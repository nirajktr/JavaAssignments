public class DiscreteDistribution {
    public static void main(String[] args) {
        
        int m = Integer.parseInt(args[0]);
        int[] probabilities = new int[args.length - 1];
        
        for (int i = 1; i < args.length; i++) {
            probabilities[i - 1] = Integer.parseInt(args[i]);
        }
        
        int[] cumulativeSums = new int[args.length];
        
        for (int i = 1; i < args.length; i++) {
            cumulativeSums[i] = cumulativeSums[i - 1] + probabilities[i - 1];
        }
        
        for (int i = 0; i < m; i++) {
            int random = (int) (Math.random() * cumulativeSums.length - 1);
            for (int j = 1; j < args.length; j++) {
                if (random >= cumulativeSums[j-1] && random < cumulativeSums[j]) {
                    System.out.println(j + " ");
                    break;
                }
            }
        }
    }
}
