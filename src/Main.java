import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 4;
        double b = 4.0;
        String c = "HackerRank";

        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(a+i);
        System.out.println(b+d);
        System.out.println(c+" "+s);

    }
}
