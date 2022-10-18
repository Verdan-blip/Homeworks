public class Task1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given");
            System.exit(-1);
        }
        final double G = 9.8;
        double seconds = Double.parseDouble(args[0]);
        if (seconds < 0) {
            System.out.println("Seconds can't be negative");
            System.exit(-1);
        }
        double distance = seconds * seconds * G / 2;
        System.out.println(distance);
    }
}
