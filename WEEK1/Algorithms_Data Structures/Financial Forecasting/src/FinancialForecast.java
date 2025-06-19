public class FinancialForecast {
    private int years;
    private double growthRate;

    private double initialAmount;

    public FinancialForecast(int years, double growthRate, double initialAmount) {
        this.years = years;
        this.growthRate = growthRate;
        this.initialAmount = initialAmount;
    }

    public double predictFutureValue() {
        return predictFutureValue(years, growthRate, initialAmount);
    }

    private double predictFutureValue(int years, double growthRate, double initialAmount) {
        if (years == 0) return initialAmount;
        return predictFutureValue(years-1, growthRate, initialAmount) * (1 + growthRate);
    }

    public void setYears(int years){
        this.years = years;
    }
}
