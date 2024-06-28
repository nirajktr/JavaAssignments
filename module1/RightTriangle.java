public class RightTriangle {

    public static void main(String[] args) {

        // Parse the command-line arguments to get the three sides.
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        // Determine the maximum side.
        int max = Math.max(Math.max(side1, side2), side3);

        // Calculate if the sides form a right triangle and ensure all sides are positive.
        boolean isRight = ((max == side1 && side2 * side2 + side3 * side3 == side1 * side1) ||
                (max == side2 && side1 * side1 + side3 * side3 == side2 * side2) ||
                (max == side3 && side1 * side1 + side2 * side2 == side3 * side3)) && (side1 > 0 && side2 > 0 && side3 > 0);

        // Print the result.
        System.out.println(isRight);
    }
}
