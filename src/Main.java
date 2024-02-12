import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("case 1: " + shouldWakeUp(true, 1));
        System.out.println("case 2: " + shouldWakeUp(false, 2));
        System.out.println("case 3: " + shouldWakeUp(true, 8));
        System.out.println("case 4: " + shouldWakeUp(true, -1));

        //task2
        System.out.println("case hasTeen 1: " + hasTeen(9, 99, 19, 2));
        System.out.println("case hasTeen 1: " + hasTeen(23, 15, 42));
        System.out.println("case hasTeen 1: " + hasTeen(22, 23, 34));


        // task3
        System.out.println("isCatPlaying 1: " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying 2: " + isCatPlaying(false, 35));
        System.out.println("isCatPlaying 2: " + isCatPlaying(false, 36));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("area of rectangle: " + area(height, width));

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("area of circle: " + area(radius));



    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) return false;

        return clock < 8 || clock >= 20;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        System.out.println("3 parametre çalıştı!");
        return (firstAge >= 13 && firstAge <= 19)
                || (secondAge >= 13 && secondAge <= 19)
                || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean hasTeen(int... ages) {
        System.out.println("... nokta olan çalıştı");
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int limit = isSummer ? 45 : 35;
        return temperature > 25 && temperature <= limit;
    }

    public static double area(double height, double width) {
        if (width < 0 || height < 0) {
            System.out.println("width or height cannot be less than zero!");
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("radius of circle cannot be less than zero! radius parameter=" + radius);
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }
}