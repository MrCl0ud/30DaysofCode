import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        if (n % 2 == 0) {
            if ((n <= 5) && (n >= 2)) System.out.println("Not Weird");
            if ((n > 5) && (n <= 20)) System.out.println("Weird");
            if (n > 20) System.out.println("Not Weird");
        }
        else System.out.println("Weird");
    }
}
