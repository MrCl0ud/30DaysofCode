import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        solve(12.0,20,8);

    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double total_cost = 0;
        double tip = (tip_percent * meal_cost) /100;
        double tax = (tax_percent * meal_cost) /100;
        total_cost = meal_cost + tip + tax;
        System.out.println(Math.round(total_cost));
    }
}
