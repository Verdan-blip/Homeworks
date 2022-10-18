public class Task2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No arguments were given");
            System.exit(-1);
        }
        final double PI  = 3.14;

        double radius = Double.parseDouble(args[0]);
        if (radius < 0) {
            System.err.println("Radius can't be negative");
            System.exit(-1);
        }
        double square = PI * radius * radius;
        double perimeter = PI * 2 * radius;
        System.out.println(String.format("Perimeter: %f, Square: %f", perimeter, square));
    }
}