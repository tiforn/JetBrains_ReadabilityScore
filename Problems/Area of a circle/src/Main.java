import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.print(Math.PI * Math.pow(radius, 2));
    }
}