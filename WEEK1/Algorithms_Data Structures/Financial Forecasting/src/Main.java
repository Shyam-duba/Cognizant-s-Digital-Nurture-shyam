import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        double growthRate = sc.nextDouble();
        double initialAmount = sc.nextDouble();


        FinancialForecast forecast = new FinancialForecast(years, growthRate, initialAmount);

        double futureValue = forecast.predictFutureValue();

        System.out.printf("Predicted value after %d years: %.2f\n", years, futureValue);

    }
}